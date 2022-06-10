import { BaseEntity } from "./base.model";
import { MoradorModel } from "./morador.model";

export class CorreioModel implements BaseEntity<number> {
  id: number; 
  descricao: string;
  entrega: Date;
  retirada: Date;
  responsavelPortaria: string;
  morador: MoradorModel;

}
