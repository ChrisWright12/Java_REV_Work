package dao;


import java.util.List;
import org.hibernate.Session;
import org.hibernate.*;
import common.util.AppConstants;
import common.model.Ticket;
import common.model.User;
import common.util.DBUtil;

public class dao implements AppConstants{

	
	@SuppressWarnings("unchecked")
	public List<Ticket> getAll(){
		Session session = DBUtil.getInstance().getSession();
		Query query = session.createQuery("FROM common.model.Ticket");
		List<Ticket> tickets = query.list();
		session.close();
		return tickets;
	}
	

	public Ticket findById(int uId) {
		Session session = DBUtil.getInstance().getSession();
		Query query = session.createQuery("FROM common.model.Ticket where user_id = :user_id");
		query.setInteger("user_id", uId);
		
		Ticket tickets = (Ticket) query.uniqueResult();
		
		session.close();
		
		return tickets;
	}
	
	
	public User getUser(int uId, String password) {
		Session session = DBUtil.getInstance().getSession();
		
		Query query = session.createQuery("FROM common.model.User where user_Id = :uId and password = :pass");
		query.setInteger("uId", uId);
		query.setString("pass", password);
		
		User user = (User) query.uniqueResult();
		
		session.close();
		
		return user;
	}
}
