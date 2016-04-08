import { UserService } from './user';
import { FakeBackend, FAKE_BACKEND_PROVIDERS } from '../../helpers/fake_backend';
import { Injector } from 'angular2/core';

describe('UserService', () => {
  let service;
  let backend;

  beforeEachProviders(() => [
    UserService,
    FAKE_BACKEND_PROVIDERS
  ]);

  beforeEach(inject([Injector], (injector) => {
    service = injector.get(UserService);
    backend = injector.get(FakeBackend);
  }));

  it('should log in user', (done) => {
    let credentials = { email: 'user@gmail.com', password: 'super_secret' };
    backend.expectPOST('/login', JSON.stringify(credentials))
      .respond(200, JSON.stringify({ success: true }));

    service.login(credentials).subscribe((result) => {
      expect(result).toBeTruthy();
      done();
    });

    backend.flush();
  });
});
