package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dbHelp.CartHasMoviesQuery;
import dbHelp.CartQuery;
import dbHelp.CustomerQuery;
import model.Cart;

/**
 * Servlet implementation class ReadCartServlet
 */
@WebServlet("/ReadCartServlet")
public class ReadCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReadCartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String userName= (String)session.getAttribute("userName");	
		CustomerQuery customerInfo = new CustomerQuery("amcproject", "root", "nakbocha2510", userName);
		CartQuery cartInfo = new CartQuery("amcproject", "root", "nakbocha2510", userName);	
		customerInfo.createCustID();
		cartInfo.createCartID();
		int customerID = customerInfo.getCustomerID();
		int cartID = cartInfo.getCartID();	


		CartHasMoviesQuery cartHasMovies = new CartHasMoviesQuery("amcproject", "root", "nakbocha2510", customerID, cartID);
		cartHasMovies.getCartInfo(cartID, customerID);
		String cartTable = cartHasMovies.getCartTable();
		session.setAttribute("customerID", customerID);
		session.setAttribute("cartID", cartID);
		session.setAttribute("cartInfo", cartTable);
		
		String url= "/Cart.jsp";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
