import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ChordsModuleComponent } from './chords-module.component';

describe('ChordsModuleComponent', () => {
  let component: ChordsModuleComponent;
  let fixture: ComponentFixture<ChordsModuleComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ChordsModuleComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ChordsModuleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
