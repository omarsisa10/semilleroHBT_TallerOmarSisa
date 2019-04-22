import { facturaDTO } from './facturaDTO';
import { platoDTO } from './platoDTO';
import { bebidaDTO } from './bebidaDTO';

export interface facturaDetalleDTO {
    detalleId: string;
    factura: string;
    plato: string;
    bebida: string;
    precioUnitario: number;
}