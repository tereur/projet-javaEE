package com.page;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login_admins
 */
@WebServlet("/Login_admins")
public class Login_admins extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login_admins() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String login="jeff";
		String password="12345678";
		String lgn =request.getParameter("login");
		String pswd =request.getParameter("pswd");
		if(true) {
			request.setAttribute("option","home");
			HttpSession session =request.getSession();
			session.setAttribute("login", lgn);
			session.setAttribute("password", pswd);
			request.setAttribute("session",session.getAttribute("login"));
			this.getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
		    
		} else
			this.getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);	
	}

}
