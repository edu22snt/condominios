import {EventEmitter, Injectable} from '@angular/core';
import {Message, MessageConfirm, MessageType} from "./message";
import {HttpErrorResponse} from "@angular/common/http";

@Injectable()
export class MessageService {

  readonly messageEventEmitter: EventEmitter<Message> = new EventEmitter();
  readonly messageConfirmEventEmitter: EventEmitter<MessageConfirm> = new EventEmitter();

  constructor() {
  }

  addMessage(message: string, type: MessageType) {
    this.messageEventEmitter.emit(new Message(message, type));
  }

  addInfo(message: string) {
    this.addMessage(message, MessageType.ALERT_TYPE_INFO);
  }

  addSuccess(message: string) {
    this.addMessage(message, MessageType.ALERT_TYPE_SUCCESS);
  }

  addWarning(message: string) {
    this.addMessage(message, MessageType.ALERT_TYPE_WARNING);
  }

  addDanger(message: string | HttpErrorResponse) {
    if (message instanceof HttpErrorResponse) {
      switch (message.status) {
        case 404:
          this.addMessage('Registry not found.', MessageType.ALERT_TYPE_DANGER);
          break;
        case 401:
        case 403:
          this.addMessage('Access denied.', MessageType.ALERT_TYPE_DANGER);
          break;
        case 500:
          this.addMessage('Internal server error. Please call the site administrator.', MessageType.ALERT_TYPE_DANGER);
          break;
        default:
          this.addMessage(message.message, MessageType.ALERT_TYPE_DANGER);
      }
    } else {
      this.addMessage(message, MessageType.ALERT_TYPE_DANGER);
    }
  }

  confirm(message: string, title: string, callbackOk: () => void, callbackCancel: () => void = null, okButton: string = "Ok", cancelButton: string = 'Cancel') {
    this.messageConfirmEventEmitter.emit(new MessageConfirm(message, title, okButton, cancelButton, callbackOk, callbackCancel));
  }
}
