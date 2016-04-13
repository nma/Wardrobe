import { ListComponent } from '../../../stack/components/list/list';
import { LoginComponent } from '../../../auth/components/login/login';

export const router = {
  config: [
    { path: '/', component: ListComponent, name: 'List', useAsDefault: true },
    { path: '/login', component: LoginComponent, name: 'Login' }
  ]
};
