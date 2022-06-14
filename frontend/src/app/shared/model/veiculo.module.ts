import { ApartamentoModel } from "./apartamento.model";
import { BaseEntity } from "./base.model";
import { MoradorModel } from "./morador.model";

export class VeiculoModel implements BaseEntity<number> {
  id: number;
  tipo: string;
  marca: string;
  modelo: string;
  cor: string;
  placa: string;
  is_garagem_propria: boolean;
  apartamento_garagem_alugada: ApartamentoModel;
  morador: MoradorModel;

}
