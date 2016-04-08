import { Injectable } from 'angular2/core';
import { Http } from 'angular2/http';
import { BehaviorSubject } from 'rxjs';
import { request } from '../../auth/helpers/request';

@Injectable()
export class PostService {
  remotePosts = new BehaviorSubject([]);

  static get parameters() {
    return [[Http]];
  }

  constructor(http) {
    this._http = http;
  }

  refreshPosts() {
    let postsResponse = this._http.get('/stack')
      .map(res => res.json());

    postsResponse.subscribe(
        (posts) => {
          this.remotePosts.next(posts);
        },
        (error) => {
          console.error(error);
        }
      );

    return postsResponse;
  }
}
