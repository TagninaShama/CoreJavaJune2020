package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbHelp.AddAccount;
import model.Customer;
import utilities.PasswordService;


/**
 * Servlet implementation class AddAccount
 */
@WebServlet("/AddAccount")
public class AddAccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddAccountServlet() {
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
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String customerPhoneNo = request.getParameter("customerPhoneNo");
		String emailAddress = request.getParameter("emailAddress");
		String password = request.getParameter("password");
		
	//NEW STUFF!!
		PasswordService ps = new PasswordService();
		String encPassword = ps.encrypt(password);
	
		// set up a product object
		Customer customer = new Customer();
		customer.setCustomerID();
		customer.setFirstName(firstName);
		customer.setLastName(lastName);
		customer.setEmailAddress(emailAddress);
		customer.setCustomerPhoneNo(customerPhoneNo);
		customer.setPassword(encPassword);
		   
		// set up an addQuery object
	    AddAccount aq = new AddAccount("amcproject", "root", "nakbocha2510");
	    
		// pass the product to addQuery to add to the database
	    aq.doAdd(customer);
	    
		// pass execution control to the ReadServlet
	    String url = "LogIn.jsp";
	    
	    RequestDispatcher dispatcher = request.getRequestDispatcher(url);
	    dispatcher.forward(request, response);
	    
		
	}

}
