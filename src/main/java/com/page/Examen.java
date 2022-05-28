package com.page;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.object.Eva;

/**
 * Servlet implementation class Examen
 */
@WebServlet("/Examen")
public class Examen extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String fac;   
	private static String nbs;
	private static String nbf;
	private static String heure;
	private static String chs;
    Eva eva=new Eva();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Examen() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		if(request.getParameter("examen")!=null) {
		  
			 fac="1";
			request.setAttribute("etape",fac);
			
		}
		if(request.getParameter("fac")!=null && fac=="1") {
		    
		     fac="2";
		     
			
			request.setAttribute("etape",fac);
		}
		
		if(fac=="2"&& request.getParameter("heure")!=null) {
			fac="3";
			request.setAttribute("etape",fac);
		}
		if(fac=="3"&& request.getParameter("nbs")!=null) {
			fac="4";
			request.setAttribute("etape",fac);
		}
		if(fac=="4"&& request.getParameter("salle")!=null) {
			fac="5";
			request.setAttribute("etape",fac);
		}
		if(fac=="5"&& request.getParameter("nbre_fil")!=null) {
			fac="6";
			request.setAttribute("etape",fac);
		}
		if(fac=="6"&& request.getParameter("filiere")!=null) {
			fac="7";
			request.setAttribute("etape",fac);
		}
		this.getServletContext().getRequestDispatcher("/WEB-INF/Examen.jsp").forward(request, response);
	}


}
