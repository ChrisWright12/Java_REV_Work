package manager;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
//		UserManager mgr = new UserManagerImpl();
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		UserManager mgr = (UserManager) context.getBean("userMgr");
		
		boolean success = mgr.login(null, null);
		
		System.out.println(success);
	}

}
