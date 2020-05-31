package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.GameNumber;

/**
 * Servlet implementation class GameServlet
 */
@WebServlet(
		description = "A servlet to control our simple guessing game", 
		urlPatterns = { 
				"/GameServlet", 
				"/doGuess"
		}, initParams = { 
				@WebInitParam(name = "guesses", value = "1"), 
				@WebInitParam(name = "targetMin", value = "0"), 
				@WebInitParam(name = "targetMax", value = "1000")
		})
public class GameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int targetMax;
	private int guesses;
	private int targetMin;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GameServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    public void init(ServletConfig config) throws ServletException {
		this.guesses = Integer.parseInt(config.getInitParameter("guesses"));
		this.targetMax = Integer.parseInt(config.getInitParameter("targetMax"));
		this.targetMin = Integer.parseInt(config.getInitParameter("targetMin"));
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// get input - target, guess, number of guesses, minimum and maximum
	
		HttpSession session = request.getSession();
		GameNumber target = new GameNumber();
		if(guesses == 1) {
			   
			   target.setRandom(targetMin , targetMax);
			   session.setAttribute("target", target);
		   }
		   else { 
			  target = (GameNumber)session.getAttribute("target");
		   }
GameNumber guess = new GameNumber(Integer.parseInt(request.getParameter("guess")));

		// initialize output
		String msg = "";
		String url = "/guess.jsp";
	   
		// compare the guess with the target
	   if( guess.getValue() == target.getValue() ){
		   // winner
		   msg = "Correct! You got it in " + guesses + " guesses.";
		   url = "/correct.jsp";
		   guesses = 1;
	   } else {
		   // next guess
		   guesses++;
		   if ( guess.getValue() < target.getValue() ) {
			   //low
			   msg = "Incorrect guess! Guess higher next time.";
		   } else {
			   // high
			   msg = "Incorrect guess! Guess lower next time.";
		   }
	   }
	  // HttpSession session = request.getSession();
		//session.setAttribute("guesses", guesses);

	   // add values to request object to pass to the destination
	   request.setAttribute("msg", msg);
	   session.setAttribute("guesses", guesses);
	
	   // send control to the next component
	   RequestDispatcher dispatcher = request.getRequestDispatcher(url);
	   dispatcher.forward(request, response);
		
		
	}

}



