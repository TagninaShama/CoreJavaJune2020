package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbhelper.UpdateQuery;
import model.Product;

/**
 * Servlet implementation class UpdateProductServlet
 */
@WebServlet({ "/UpdateProductServlet", "/updateProduct" })
public class UpdateProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateProductServlet() {
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
		// TODO Auto-generated method stub
		
		
		String SKU = request.getParameter("SKU");
		String ProductType = request.getParameter("ProductType");
		String Flavor = request.getParameter("Flavor");
		Double Cost = Double.parseDouble(request.getParameter("Cost"));
		Double Price = Double.parseDouble(request.getParameter("Price"));
		int Quantity = Integer.parseInt(request.getParameter("Quantity"));
		
		Product product = new Product();

		product.setSKU(SKU);
		product.setProductType(ProductType);
		product.setFlavor(Flavor);				
		product.setCost(Cost);
		product.setPrice(Price);
		product.setQuantity(Quantity);
	
		
		// create an UpdateQuery object and use it to update the product
		UpdateQuery uq = new UpdateQuery("grocery", "root", "nakbocha2510");
		uq.doUpdate(product);
		
		// pass control on to the ReadServlet
		String url = "/read";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
