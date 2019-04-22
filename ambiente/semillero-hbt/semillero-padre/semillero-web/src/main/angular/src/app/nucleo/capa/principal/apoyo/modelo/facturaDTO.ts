import { clienteDTO } from './clienteDTO';

export interface facturaDTO {
    facturaId: number;
    cliente: clienteDTO;
    iva: number;
    total: number;
}