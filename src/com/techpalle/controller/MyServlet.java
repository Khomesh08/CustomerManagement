package com.techpalle.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techpalle.dao.DataAccess;
import com.techpalle.model.Customer;
import com.techpalle.util.SuccessPage;


@WebServlet("/")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String path =request.getServletPath();
	
	switch(path) 
	{
	case "/logCustomer":
		validCustomer(request,response);
		break;
	case "/regCustomer":
		insertCustomer(request,response);
		break;
	case "/reg":
		getRegistrationPage(request,response);
		break;
	case "/log":
		getLoginPage(request,response);
		break;
	default:
		getStartUpPage(request,response);
		break;
	}
	}

	
	

	private void validCustomer(HttpServletRequest request, HttpServletResponse response) 
	{
		String email = request.getParameter("tbEmail");
		String password = request.getParameter("tbPwd");
		
		boolean res = DataAccess.validCustomer(email, password);
		
		
			if(res) 
			{
				try 
				{
					RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
					// store success page class in rd
					SuccessPage sp = new SuccessPage();
					request.setAttribute("successDetails",sp);
					
					
					rd.forward(request, response);
				} 
				catch (ServletException e1) 
				{
					e1.printStackTrace();
				} 
				catch (IOException e1) 
				{
					e1.printStackTrace();
				}		

			}
			else {
				getLoginPage(request, response);
			}
		
	}




	private void insertCustomer(HttpServletRequest request, HttpServletResponse response) 
	{
		String name = request.getParameter("tbName");
		String email = request.getParameter("tbMail");
		long mobile = Long.parseLong(request.getParameter("tbTel"));
		String state = request.getParameter("ddlStates");
		String password = request.getParameter("tbPsd");

		Customer c = new Customer(name, email, mobile, state, password);
		
		DataAccess.insertCustomer(c);
		
		try 
		{
			RequestDispatcher rd = request.getRequestDispatcher("customer_login.jsp");
			rd.forward(request, response);
		} 
		catch (ServletException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}		
	}




	private void getRegistrationPage(HttpServletRequest request, HttpServletResponse response) {
		try 
		{
			RequestDispatcher rd = request.getRequestDispatcher("customer_registration.jsp");
			rd.forward(request, response);
		} 
		catch (ServletException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}		
	}




	private void getLoginPage(HttpServletRequest request, HttpServletResponse response) {
		try 
		{
			RequestDispatcher rd = request.getRequestDispatcher("customer_login.jsp");
			rd.forward(request, response);
		} 
		catch (ServletException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}		
	}




	private void getStartUpPage(HttpServletRequest request, HttpServletResponse response) 
	{
		try 
		{
			RequestDispatcher rd = request.getRequestDispatcher("customer_management.jsp");
			rd.forward(request, response);
		} 
		catch (ServletException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
