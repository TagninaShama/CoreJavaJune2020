package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Calculation;

/**
 * Servlet implementation class RollServlet
 */
@WebServlet(description = "It will act as a controller for this file", urlPatterns = ("/RollServlet"))
public class RollServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RollServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		String option = request.getParameter("option");
		double amount = Double.parseDouble(request.getParameter("amount"));
		int d1 = Integer.parseInt(request.getParameter("val1"));
		int d2 = Integer.parseInt(request.getParameter("val2"));
		double sum = d1 + d2;
		double initialAmount = Double.parseDouble(request.getParameter("initialAmount"));
		int rollCount = Integer.parseInt(request.getParameter("rollCount"));
		Calculation C = new Calculation(initialAmount, amount, option, rollCount);

		request.setAttribute("diceImages", C.showDiceImages(d1, d2));
		String url = C.Cal1(sum, amount, option, rollCount);
		request.setAttribute("calc", C);
		initialAmount = C.getTotalAmount();
		rollCount = C.rollCount();
		request.setAttribute("initialAmount", initialAmount);
		request.setAttribute("rollCount", rollCount);
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
