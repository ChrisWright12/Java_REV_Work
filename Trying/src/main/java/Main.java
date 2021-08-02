import dao.AccountDAO;



public class Main {
	
	public static void main(String[] args) {
		AccountDAO service = new AccountDAO();
		service.start();
	}

}
