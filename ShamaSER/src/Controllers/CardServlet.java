package Controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.NumberFormat;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CardServlet
 */
@WebServlet(description = "It will act both as a view and the controller for this file", urlPatterns = { "/Calculate" })
public class CardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CardServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		CreditCard card = new CreditCard(request.getParameter("firstName"), request.getParameter("lastName"), Integer.parseInt(request.getParameter("accountNum")), Double.parseDouble(request.getParameter("balanceDue")), Double.parseDouble(request.getParameter("percentToPay")));
		
		NumberFormat ft = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<style> table, th, td "
				+ "{border: 1px solid black;"
				+ " border-collapse: collapse;} </style>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1> Credit Payment Schedule </h1>");
		out.println("<h3>Customer: "+request.getParameter("firstName")+" "+request.getParameter("lastName")+ "</h3>");
		out.println("<h3>Account#: "+ Integer.parseInt(request.getParameter("accountNum"))+ "</h3>");
		out.println("<h3>Balance Due: "+  ft.format(Double.parseDouble(request.getParameter("balanceDue")))+ "</h3>");
		out.println(card.data());
		out.println("</html>");
		out.println("</body>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
