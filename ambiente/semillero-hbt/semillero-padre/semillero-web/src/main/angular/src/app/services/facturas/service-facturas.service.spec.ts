import { TestBed } from '@angular/core/testing';

import { ServiceFacturasService } from './service-facturas.service';

describe('ServiceFacturasService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ServiceFacturasService = TestBed.get(ServiceFacturasService);
    expect(service).toBeTruthy();
  });
});
