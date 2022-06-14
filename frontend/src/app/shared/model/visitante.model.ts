import { ApartamentoModel } from "./apartamento.model";
import { BaseEntity } from "./base.model";

export class VisitanteModule implements BaseEntity<number> {
  id: number;
  nome: string;
  cpf: string;
  rg: string;
  data_entrada: Date;
  apartamento_visita: ApartamentoModel; 
}
