import { ApartamentoModel } from "./apartamento.model";
import { BaseEntity } from "./base.model";

export class PrestadorServicoModel implements BaseEntity<number> {
    id: number; 
    nome: string;
    telefone_celular: number;
    telefone_residencial: number;
    email: string;
    cpf: string;
    rg: string;
    ssp: string
    ativo: boolean;
    cargo: string;
    apartamento: ApartamentoModel;

  }