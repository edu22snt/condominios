import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CorreioListComponent } from './correio-list.component';

describe('CorreioListComponent', () => {
  let component: CorreioListComponent;
  let fixture: ComponentFixture<CorreioListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CorreioListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CorreioListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
