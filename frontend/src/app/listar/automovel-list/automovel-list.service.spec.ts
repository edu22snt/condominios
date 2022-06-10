import { TestBed } from '@angular/core/testing';

import { AutomovelListService } from './automovel-list.service';

describe('AutomovelListService', () => {
  let service: AutomovelListService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AutomovelListService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
