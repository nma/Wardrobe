import { Component, ChangeDetectionStrategy } from 'angular2/core';
import { ROUTER_DIRECTIVES } from 'angular2/router';
import template from './list_item.html';
import { ShortDescriptionPipe } from '../../pipes/short_description';

@Component({
  selector: 'list-item',
  template: template,
  changeDetection: ChangeDetectionStrategy.OnPush,
  directives: [ROUTER_DIRECTIVES],
  pipes: [ShortDescriptionPipe],
  inputs: ['stack']
})
export class ListItemComponent {
  stack;

  static get parameters() {
    return [];
  }

  constructor() {
  }

  getLoggedIn() {
      console.log('method called');
  }
}
