import { TestBed } from '@angular/core/testing';

import { ServiceFacturaService } from './service-factura.service';

describe('ServiceFacturaService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ServiceFacturaService = TestBed.get(ServiceFacturaService);
    expect(service).toBeTruthy();
  });
});
