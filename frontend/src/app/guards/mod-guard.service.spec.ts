import { TestBed } from '@angular/core/testing';

import { ModGuardService } from './mod-guard.service';

describe('ModGuardService', () => {
  let service: ModGuardService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ModGuardService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
