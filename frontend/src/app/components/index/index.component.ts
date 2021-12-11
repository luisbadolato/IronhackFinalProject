import { Component, OnInit } from '@angular/core';
import { TokenService } from 'src/app/services/token.service';

@Component({
  selector: 'app-index',
  templateUrl: './index.component.html',
  styleUrls: ['./index.component.scss']
})
export class IndexComponent implements OnInit {

  guestIcon: string = "btn-user-guest";

  constructor(private tokenService: TokenService) { }

  ngOnInit(): void {
    this.changeGuestIcon();
  }

  changeGuestIcon(): void {
    if (this.tokenService.getUserName()) {
      this.guestIcon = "btn-modules";
    }
  }
}
