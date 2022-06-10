import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AutomovelListComponent } from './automovel-list.component';

describe('AutomovelListComponent', () => {
  let component: AutomovelListComponent;
  let fixture: ComponentFixture<AutomovelListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AutomovelListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AutomovelListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
