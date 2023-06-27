package de.zeroco.servlets;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		int id = Integer.parseInt(request.getParameter("id"));
		try {
			response.getWriter().print((Service.delete(id)) > 0 ? "Deleted Successfully" : "Details Not Deleted");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
