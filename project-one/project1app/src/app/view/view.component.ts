import { Component, OnInit, Input } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Tickets } from '../tickets';
import { TicketsService } from '../tickets.service';
import { Location } from '@angular/common';
import { LoginComponent } from '../login/login.component';

@Component({
  selector: 'app-view',
  templateUrl: './view.component.html',
  styleUrls: ['./view.component.css']
})
export class ViewComponent implements OnInit {


  @Input() ticket?: Tickets;
  login?: LoginComponent;

  constructor(private route: ActivatedRoute,
              private ticketService: TicketsService,
              private location: Location
              ) { }

  ngOnInit(): void {
  }

 
}
