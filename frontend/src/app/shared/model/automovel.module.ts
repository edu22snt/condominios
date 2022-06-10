import { ApartamentoModel } from "./apartamento.model";
import { BaseEntity } from "./base.model";

export class AutomovelModel implements BaseEntity<number> {
  id: number;
  tipo: string;
  marca: string;
  modelo: string;
  cor: string;
  placa: string;
  apartamento: ApartamentoModel;

}
