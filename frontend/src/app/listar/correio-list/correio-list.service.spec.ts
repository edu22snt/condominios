import { TestBed } from '@angular/core/testing';

import { CorreioListService } from './correio-list.service';

describe('CorreioListService', () => {
  let service: CorreioListService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CorreioListService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
