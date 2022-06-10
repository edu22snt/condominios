import { Component, OnInit } from '@angular/core';
import { MessageService } from './shared/services/messages/message.service';
import { TokenStorageService } from './shared/services/token-storage/token-storage.service';
import {debounceTime, takeLast, tap} from "rxjs/operators";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'condominio';
  private roles: string[];
  collapsed = false;
  isLoggedIn = false;
  showAdmin = false;
  showUser = false;
  username: string;

  constructor(
    private tokenStorageService: TokenStorageService,
    private messageService: MessageService
  ){}

  ngOnInit(): void {
    window.alert = (message) => this.messageService.addSuccess(message);
    this.tokenStorageService.logEvent.pipe(
      debounceTime(100),
      tap(() => this.login()),
      takeLast(1)
    ).subscribe();
    this.login();
  }

  login(): void {
    this.isLoggedIn = !!this.tokenStorageService.getToken();
    if (this.isLoggedIn) {
      const user = this.tokenStorageService.getUser();
      this.roles = user.roles;
      this.showAdmin = this.roles.includes('ROLE_ADMIN');
      this.showUser = this.roles.includes('ROLE_USER');
      this.username = user.username;
    } else {
      this.clearSession();
    }
  }

  logout(): void {
    this.tokenStorageService.signOut();
    this.clearSession();
  }

  private clearSession(): void {
    this.roles = [];
    this.isLoggedIn = false;
    this.showAdmin = false;
    this.showUser = false;
    this.hideCollapse();
  }

  toggleCollapse(): void {
    this.collapsed = !this.collapsed;
  }

  hideCollapse(): void {
    this.collapsed = false;
  }

}
