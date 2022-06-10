import { TestBed } from '@angular/core/testing';

import { PortariaListService } from './portaria-list.service';

describe('PortariaListService', () => {
  let service: PortariaListService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(PortariaListService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
