import { ApartamentoModel } from "./apartamento.model";
import { BaseEntity } from "./base.model";

export class MoradorModel implements BaseEntity<number> {
  id: number;
  nome: string;
  telefone: number;
  email: string;
  cpf: string;
  apartamento: ApartamentoModel;

}
