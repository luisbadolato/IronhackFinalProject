import { TestBed } from '@angular/core/testing';

import { ModInterceptorService } from './mod-interceptor.service';

describe('ModInterceptorService', () => {
  let service: ModInterceptorService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ModInterceptorService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
