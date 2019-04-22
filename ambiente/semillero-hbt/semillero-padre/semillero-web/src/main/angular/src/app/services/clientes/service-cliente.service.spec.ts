import { TestBed } from '@angular/core/testing';

import { ServiceClienteService } from './service-cliente.service';

describe('ServiceClienteService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ServiceClienteService = TestBed.get(ServiceClienteService);
    expect(service).toBeTruthy();
  });
});
