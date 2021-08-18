package controller;

import java.io.BufferedReader;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import com.fasterxml.jackson.databind.ObjectMapper;

import common.model.Ticket;
import common.model.User;
import dao.dao;

@SuppressWarnings("serial")
@WebServlet("/home")

public class HomeServlet extends HttpServlet{
	dao data = new dao();
	User user = new User();
	UserServlet userve = new UserServlet();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		resp.setContentType("application/json");
		
		ObjectMapper mapper = new ObjectMapper();

		String jsonInString = mapper.writeValueAsString(data.getAll());
		
		resp.getWriter().print(jsonInString);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException { 
		StringBuffer jsonStrBuffer = new StringBuffer();
		String line = null;

		BufferedReader reader = request.getReader();
		while ((line = reader.readLine()) != null)
			jsonStrBuffer.append(line);
		
		doGet(request,response);
		
	}
	
}

