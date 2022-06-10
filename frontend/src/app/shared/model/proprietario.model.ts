import { BaseEntity } from "./base.model";

export class ProprietarioModel implements BaseEntity<number> {
  id: number; 
  nome: string;
  telefone: number;
  email: string;
  cpf: string;
}
