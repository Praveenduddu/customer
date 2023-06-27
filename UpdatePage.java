package de.zeroco.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdatePage extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		List<Customer> list = Dao.get(Integer.parseInt(request.getParameter("id")));
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
        out.println("<html><body><h1>Update Details</h1><form action = \"update\" method = \"post\">");
        out.println("<label>Id : </label><input type = \"number\" name = \"id\" value = " + list.get(0).getId() +"></input><br></br>");
        out.println("<label>Name : </label><input type = \"text\" name = \"name\" value = " + list.get(0).getName() +"></input><br></br>");
        out.println("<label>Contact : </label><input type = \"number\" name = \"contact\" value = " + list.get(0).getContact() +"></input><br></br>");
        out.println("<label>Email : </label><input type = \"email\" name = \"email\" value = " + list.get(0).getEmail() +"></input><br></br>");
        out.println("<label>Date Of Birth : </label><input type = \"date\" name = \"date\" value = " + list.get(0).getDateOfBirth() +"></input><br></br>");
        out.println("<input type = \"submit\"></input><br></br>");
	}
}
