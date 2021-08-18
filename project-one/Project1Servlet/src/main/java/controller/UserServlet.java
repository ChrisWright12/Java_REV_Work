package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import common.util.AppConstants;
import common.util.HttpUtil;
import common.model.User;
import manager.UserManager;

@SuppressWarnings("serial")
@WebServlet("/login")

public class UserServlet extends HttpServlet{
	static User user;

	private UserManager manager = new UserManager();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		try {
			//get JSON data
			ObjectMapper mapper = new ObjectMapper();
			user = mapper.readValue(HttpUtil.getJSONData(req), User.class);
			//persist data to back-end
			boolean success = manager.login(user.getUser_id(),user.getPassword());
			
			resp.getWriter().print( "{\"status\":"+ (success ? "\"success\"" : "\"failure\"")+"}");
		}catch (Exception e) {
			resp.getWriter().print(HttpUtil.getErrorMessage(e.getMessage()));
			resp.setStatus(AppConstants.HTTP_ERROR);
		}
		
	}
}
