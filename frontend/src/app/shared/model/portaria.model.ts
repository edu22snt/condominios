import { BaseEntity } from "./base.model";
import { MoradorModel } from "./morador.model";

export class PortariaModule implements BaseEntity<number> {
  id: number;
  mensagem: string;
  dataHoraCadastro: Date;
  dataHoraBaixa: Date;
  morador: MoradorModel;
  
}
