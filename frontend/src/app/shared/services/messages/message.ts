export enum MessageType {
  ALERT_TYPE_INFO = 'alert-info',
  ALERT_TYPE_DANGER = 'alert-danger',
  ALERT_TYPE_SUCCESS = 'alert-success',
  ALERT_TYPE_WARNING = 'alert-warning',
}

export class Message {
  constructor(public message: string, public type: MessageType) {
  }
}

export class MessageConfirm {
  constructor(
    public message: string,
    public title: string,
    public okButton: string,
    public cancelButton: string,
    public callbackOk: (MessageConfirm) => void,
    public callbackCancel: (MessageConfirm) => void) {
  }
}
