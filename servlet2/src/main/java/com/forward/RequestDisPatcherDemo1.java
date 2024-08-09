package com.forward;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestDisPatcherDemo1
 */
@WebServlet("/RequestDisPatcherDemo1")
public class RequestDisPatcherDemo1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestDisPatcherDemo1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String n= request.getParameter("val1");
		String u= request.getParameter("val2");
		String p= request.getParameter("val3");
		
		if(p.equals("123")) {
			RequestDispatcher rd=request.getRequestDispatcher("RequestDisPatcherDemo2");
			rd.forward(request, response);
		}
		else {
			out.println("Incorrect Username or password");
			RequestDispatcher rd=request.getRequestDispatcher("/login.html");
			rd.include(request, response);
		}
		
		
	}

}
