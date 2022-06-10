import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ProprietarioListComponent } from './proprietario-list.component';

describe('ProprietarioListComponent', () => {
  let component: ProprietarioListComponent;
  let fixture: ComponentFixture<ProprietarioListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ProprietarioListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ProprietarioListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
