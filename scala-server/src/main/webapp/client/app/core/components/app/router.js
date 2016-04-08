import { StackListComponent } from '../../../stack/components/list/list';
import { LoginComponent } from '../../../auth/components/login/login';

export const router = {
  config: [
    { path: '/', component: StackListComponent, name: 'List', useAsDefault: true },
    { path: '/login', component: LoginComponent, name: 'Login' }
  ]
};
