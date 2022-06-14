import { ApartamentoModel } from "./apartamento.model";
import { BaseEntity } from "./base.model";

export class MoradorModel implements BaseEntity<number> {
  id: number;
  nome: string;
  data_nascimento: string;
  telefone_celular: number;
  telefone_residencial: number;
  telefone_comercial: number;
  email: string;
  cpf: string;
  rg: string;
  ssp: string;
  is_proprietario: boolean;
  profissao: string;
  renda_familiar: number;
  apartamento: ApartamentoModel;

}
