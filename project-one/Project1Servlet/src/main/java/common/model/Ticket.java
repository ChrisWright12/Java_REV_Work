package common.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tickets")
public class Ticket implements Serializable{

		
		@Id
		@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_generator")
		@SequenceGenerator(name = "id_generator", sequenceName = "ticket_id_seq", allocationSize = 1)
		@Column
		private int ticket_id;
		@Column
		private int user_id;
		@Column 
		private String type;
		@Column
		private double amount;


		
		
		public Ticket() {
			super();
		}
		public Ticket(int user_ID, String tType, double tAmt) {
			super();
			this.user_id = user_ID;
			this.type = tType;
			this.amount = tAmt;
		}
		
		public int getTicket_id() {
			return ticket_id;
		}
		public void setTicket_id(int ticket_id) {
			this.ticket_id = ticket_id;
		}
		public int getUser_id() {
			return user_id;
		}
		public void setUser_id(int user_id) {
			this.user_id = user_id;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public double getAmount() {
			return amount;
		}
		public void setAmount(double amount) {
			this.amount = amount;
		}
		@Override
		public String toString() {
			return "{" + this.user_id+","+this.type+","+this.ticket_id+","+this.amount+"}";
		}
		
}
