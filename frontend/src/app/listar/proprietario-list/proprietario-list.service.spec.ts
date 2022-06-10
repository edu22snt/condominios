import { TestBed } from '@angular/core/testing';

import { ProprietarioListService } from './proprietario-list.service';

describe('ProprietarioListService', () => {
  let service: ProprietarioListService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ProprietarioListService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
