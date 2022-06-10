import {Component} from '@angular/core';
import {MessageService} from "../../services/messages/message.service";
import {Message} from "../../services/messages/message";

@Component({
  selector: 'alert-message',
  templateUrl: './alert-message.component.html',
  styleUrls: ['./alert-message.component.scss']
})
export class AlertMessageComponent {

  public items: Message[] = [];

  constructor(private messageService: MessageService) {
    messageService.messageEventEmitter.subscribe(message => {
      this.items.push(message)

      setTimeout(() => {
        this.deleteMessage(message);
      }, 6000);
    });
  }

  deleteMessage(item: Message) {
    const index = this.items.indexOf(item, 0);
    if (index > -1) {
      this.items.splice(index, 1);
    }
  }
}
