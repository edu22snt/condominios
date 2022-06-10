import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CorreioComponent } from './correio.component';

describe('CorreioComponent', () => {
  let component: CorreioComponent;
  let fixture: ComponentFixture<CorreioComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CorreioComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CorreioComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
