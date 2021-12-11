import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ArpegioModuleComponent } from './arpegio-module.component';

describe('ArpegioModuleComponent', () => {
  let component: ArpegioModuleComponent;
  let fixture: ComponentFixture<ArpegioModuleComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ArpegioModuleComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ArpegioModuleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
