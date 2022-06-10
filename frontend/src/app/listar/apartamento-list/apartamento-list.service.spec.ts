import { TestBed } from '@angular/core/testing';

import { ApartamentoListService } from './apartamento-list.service';

describe('ApartamentoListService', () => {
  let service: ApartamentoListService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ApartamentoListService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
