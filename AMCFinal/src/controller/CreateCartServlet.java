package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dbHelp.AddCart;
import dbHelp.CartHasMoviesQuery;
import dbHelp.CartQuery;
import dbHelp.CustomerQuery;
import model.Cart;
import model.Customer;

/**
 * Servlet implementation class CreateCartServlet
 */
@WebServlet("/CreateCartServlet")
public class CreateCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateCartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
		Cart cart = new Cart();
		String movieName = request.getParameter("movies");
		int adultQuan = Integer.parseInt(request.getParameter("adult"));
		int youthQuan = Integer.parseInt(request.getParameter("child"));
		double price = cart.total(youthQuan, adultQuan);
		int quantity = cart.totalQuan(youthQuan, adultQuan);
		int customerID = customerInfo.getCustomerID();
		int cartID = cartInfo.getCartID();
		session.setAttribute("customerID", customerID);
		session.setAttribute("cartID", cartID);
		
		//set up a product object
		cart.setCartId(cartID);
		cart.setCustomerId(customerID);
		cart.setMovieName(movieName);
		cart.setPrice(price);
		cart.setQuantity(quantity);
		
		// set up an addQuery object
		AddCart ac = new AddCart("amcproject", "root", "nakbocha2510");
		    
		// pass the product to addQuery to add to the database
		ac.doCart(cart, customerID, cartID);
		ac.doAddMovies(cart);	
		
		
		// retrieves info from cart_has_movies db
		CartHasMoviesQuery cartHasMovies = new CartHasMoviesQuery("amcproject", "root", "nakbocha2510", customerID, cartID);
		cartHasMovies.getCartInfo(cartID, customerID);
		String cartTable = cartHasMovies.getCartTable();
		session.setAttribute("cartInfo", cartTable);
		String url= "/Cart.jsp";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
