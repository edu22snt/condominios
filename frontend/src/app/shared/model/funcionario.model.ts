import { BaseEntity } from "./base.model";

export class FuncionarioModel implements BaseEntity<number> {
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

  }