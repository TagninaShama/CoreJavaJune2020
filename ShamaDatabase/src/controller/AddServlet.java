package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbhelper.AddQuery;
import model.Product;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet(description = "Controller for adding a new product to the database", urlPatterns = { "/addProduct" })
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddServlet() {
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
		// get the data
		String SKU = request.getParameter("SKU");
		String ProductType = request.getParameter("ProductType");
		String Flavor = request.getParameter("Flavor");
		Double Cost = Double.parseDouble(request.getParameter("Cost"));
		Double Price = Double.parseDouble(request.getParameter("Price"));
		int Quantity = Integer.parseInt(request.getParameter("Quantity"));
	
		// set up a product object
		Product product = new Product();

		product.setSKU(SKU);
		product.setProductType(ProductType);
		product.setFlavor(Flavor);				
		product.setCost(Cost);
		product.setPrice(Price);
		product.setQuantity(Quantity);
	    
		// set up an addQuery object
	    AddQuery aq = new AddQuery("grocery", "root", "nakbocha2510");
		// pass the product to addQuery to add to the database
	    aq.doAdd(product);
	    
	    // pass execution control to the ReadServlet
	    String url = "/read";
	    
	    RequestDispatcher dispatcher = request.getRequestDispatcher(url);
	    dispatcher.forward(request, response);
	    
		
	}

}
