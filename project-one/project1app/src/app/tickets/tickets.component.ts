import { Component, OnInit } from '@angular/core';
import { Tickets } from '../tickets';
import { Router } from '@angular/router';
import { TicketsService } from '../tickets.service';
import { NgForm } from '@angular/forms';
import { HttpClient } from '@angular/common/http';
import { Login } from '../login/login';

@Component({
  selector: 'app-tickets',
  templateUrl: './tickets.component.html',
  styleUrls: ['./tickets.component.css']
})
export class TicketsComponent implements OnInit {

  tickets: Tickets[] = [];
  login: Login | undefined;
  ticket: Tickets = {
    user_ID: 0,
    ticket_id: 0,
    type: '',
    amount: 0.0,
  }
  

  constructor(private router:Router, private ticketService: TicketsService,
              private http:HttpClient) { }

  ngOnInit(): void {
    this.getTickets();
  }

  getTickets(): void {
    this.ticketService.getTickets()
    .subscribe(ticketList => {
      console.log(ticketList)
      this.tickets = ticketList
    });
  }

  selectedTicket?: Tickets;

  onSelect(ticket: Tickets): void{
    this.selectedTicket = ticket;
    console.log(ticket.ticket_id);
  }

  logout(){
    localStorage.clear()
    this.router.navigate(['login'])
  }
  onSubmit(form:NgForm){
    console.log(form)
    this.http.post("http://localhost:8080/Project1.3/home", 
                    JSON.stringify({
                    user_id: form.value.userid, 
                    type: form.value.Type,
                    amount: form.value.amount}))
                    .subscribe({
                      next: (data:any)=>{
                      if(data.status === 'success'){
                        this.router.navigate(['tickets'])
                      }
                    }})
  }

}
