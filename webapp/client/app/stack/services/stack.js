import { Injectable } from 'angular2/core';
import { Http } from 'angular2/http';
import { BehaviorSubject } from 'rxjs';
import { request } from '../../auth/helpers/request';

@Injectable()
export class StackService {
  remoteStacks = new BehaviorSubject([]);

  static get parameters() {
    return [[Http]];
  }

  constructor(http) {
    this._http = http;
  }

  refreshStacks() {
    let stacksResponse = this._http.get('/Stack/stack/')
      .map(res => res.json());

    stacksResponse.subscribe(
        (stacks) => {
          this.remoteStacks.next(stacks);
        },
        (error) => {
          console.error(error);
        }
      );

    return stacksResponse;
  }
}
