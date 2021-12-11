import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TheoryModuleComponent } from './theory-module.component';

describe('TheoryModuleComponent', () => {
  let component: TheoryModuleComponent;
  let fixture: ComponentFixture<TheoryModuleComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TheoryModuleComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TheoryModuleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
