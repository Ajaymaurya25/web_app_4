package com.web_app_4.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web_app_4.model.Add;

@WebServlet("/addnumber")
public class addController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public addController() {
        super();
       
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		
		Add a = new Add();
		int result = a.addnumbers(num1, num2);
		request.setAttribute("mike", result);
		
		RequestDispatcher rd = request.getRequestDispatcher("addNumber.jsp");
		rd.forward(request, response);
	}

}
