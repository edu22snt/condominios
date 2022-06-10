import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PortariaListComponent } from './portaria-list.component';

describe('PortariaListComponent', () => {
  let component: PortariaListComponent;
  let fixture: ComponentFixture<PortariaListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PortariaListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PortariaListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
