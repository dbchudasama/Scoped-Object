package demo;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ScopedObject
 */
@WebServlet("/ScopedObject")
public class ScopedObject extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ScopedObject() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Request scope - Will only be applicable to the page
		request.setAttribute("test", "Hello");
		String test = (String)request.getAttribute("test");
		
		//Session Object - Will persist for the entire session
		HttpSession session = request.getSession();
		session.setAttribute("test", "Hello");
		String test1 = (String)session.getAttribute("test");
		
		//Application - Applicable across the entire application
		ServletContext context = getServletContext();
		context.setAttribute("test", "Hello");
		String test2 = (String)session.getAttribute("test");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
