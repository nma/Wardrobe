import { Component, ChangeDetectionStrategy } from 'angular2/core';
import { ROUTER_DIRECTIVES, Router } from 'angular2/router';
import template from './menu.html';
import { UserService } from '../../../auth/services/user';

@Component({
  selector: 'top-menu',
  template: template,
  directives: [ROUTER_DIRECTIVES],
  changeDetection: ChangeDetectionStrategy.OnPush,
  pipes: []
})
export class MenuComponent {
  static get parameters() {
    return [[UserService], [Router]];
  }

  constructor(userService, router) {
    this.userService = userService;
    this._router = router;
  }

  getLoggedIn() {
    return this.userService.getLoggedIn();
  }

  logout() {
    this.userService.logout();
    this._router.navigate(['List']);
    return false;
  }
}
