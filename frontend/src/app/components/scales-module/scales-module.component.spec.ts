import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ScalesModuleComponent } from './scales-module.component';

describe('ScalesModuleComponent', () => {
  let component: ScalesModuleComponent;
  let fixture: ComponentFixture<ScalesModuleComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ScalesModuleComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ScalesModuleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
