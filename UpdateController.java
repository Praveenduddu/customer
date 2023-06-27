package de.zeroco.servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdateController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String contact = request.getParameter("contact");
        String email = request.getParameter("email");
        String date = request.getParameter("date");
        try {
			response.getWriter().print((Service.update(Service.getObjectUsingParameters(id, name, contact, email, date)) > 0) ? "Details Updated Successfully" : "Details Not Updateded");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
