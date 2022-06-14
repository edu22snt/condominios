import { ApartamentoModel } from "./apartamento.model";
import { BaseEntity } from "./base.model";
import { FuncionarioModel } from "./funcionario.model";
import { MoradorModel } from "./morador.model";

export class CorreioModel implements BaseEntity<number> {
  id: number; 
  descricao: string;
  entrega: Date;
  retirada: Date;
  responsavelPortaria: FuncionarioModel;
  morador: MoradorModel;
  apartamento: ApartamentoModel;

}
