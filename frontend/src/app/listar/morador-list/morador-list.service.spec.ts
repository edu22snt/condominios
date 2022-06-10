import { TestBed } from '@angular/core/testing';

import { MoradorListService } from './morador-list.service';

describe('MoradorListService', () => {
  let service: MoradorListService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(MoradorListService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
