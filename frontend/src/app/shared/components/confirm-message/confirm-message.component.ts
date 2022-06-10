import {Component} from '@angular/core';
import {MessageConfirm} from "../../services/messages/message";
import {MessageService} from "../../services/messages/message.service";

@Component({
  selector: 'confirm-message',
  templateUrl: './confirm-message.component.html',
  styleUrls: ['./confirm-message.component.scss']
})
export class ConfirmMessageComponent {

  public items: MessageConfirm[] = [];

  constructor(private messageService: MessageService) {
    messageService.messageConfirmEventEmitter.subscribe(message => {
      this.items.push(message)
    });
  }

  deleteMessage(item: MessageConfirm) {
    const index = this.items.indexOf(item, 0);
    if (index > -1) {
      this.items.splice(index, 1);
    }
  }

  ngOnInit(): void {
  }

  confirmMessage(message: MessageConfirm) {
    if (message.callbackOk) {
      message.callbackOk(message);
    }

    this.deleteMessage(message);
  }

  cancelMessage(message: MessageConfirm) {
    if (message.callbackCancel) {
      message.callbackCancel(message);
    }

    this.deleteMessage(message);
  }
}
