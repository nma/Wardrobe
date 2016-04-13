import { Component } from 'angular2/core';
import { RouteConfig } from 'angular2/router';
import template from './app.html';
import { MenuComponent } from '../menu/menu';
import { LoggedInRouterOutlet } from '../../../auth/directives/routeroutlet';
import { router } from './router';

@Component({
  selector: 'my-app',
  directives: [LoggedInRouterOutlet, MenuComponent],
  template: template,
  pipes: []
})
@RouteConfig(router.config)
export class AppComponent {
  static get parameters() {
    return [];
  }

  constructor() {
  }
}
