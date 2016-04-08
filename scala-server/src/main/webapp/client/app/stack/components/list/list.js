import { Component, ChangeDetectionStrategy } from 'angular2/core';
import { ROUTER_DIRECTIVES } from 'angular2/router';
import template from './list.html';
import { StackService } from '../../services/stack';
import { ListItemComponent } from './../list_item/list_item';

@Component({
    selector: 'list',
    template: template,
    directives: [ROUTER_DIRECTIVES, ListItemComponent],
    changeDetection: ChangeDetectionStrategy.Detached
})
export class StackListComponent {
    static get parameters() {
        return [[StackService]];
    }

    constructor(postService) {
        this._stackService = stackService;
    }

}
