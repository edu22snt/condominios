import { BaseEntity } from 'src/app/shared/model/base.model';
import { ProprietarioModel } from './proprietario.model';

export class ApartamentoModel implements BaseEntity<number> {
  id: number;
  bloco: string;
  numero: string
  proprietario: ProprietarioModel;
}
