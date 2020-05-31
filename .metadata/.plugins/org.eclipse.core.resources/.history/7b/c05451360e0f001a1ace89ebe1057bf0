package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.UserHelper;
import model.customer;
import utilities.PasswordService;
import model.UserHelper;
/**
 * Servlet implementation class LogInFormServlet
 */
@WebServlet("/LogInForm")
public class LogInFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private HttpSession session; 
	private String url;
	private int loginAttempts;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogInFormServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		session = request.getSession();


		//forward our request along
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get our current session
		session = request.getSession();

		//get the number of logins
		if(session.getAttribute("loginAttempts") == null){
			loginAttempts = 0;
		}
		
		//exceeded logins
		if(loginAttempts > 2){
			String errorMessage = "Error: Number of Login Attempts Exceeded";
			request.setAttribute("errorMessage", errorMessage);
			url = "LogIn.jsp";
		}else{	//proceed
			//pull the fields from the form
			String emailAddress = request.getParameter("emailAddress");
			String password = request.getParameter("password");

			//encrypt the password to check against what's stored in DB
			PasswordService pws = new PasswordService();
			String encryptedPass = pws.encrypt(password);
			System.out.println(password);
			System.out.println(encryptedPass);
			
			//create a user helper class to make database calls, and call authenticate user method
			UserHelper uh = new UserHelper();
			customer user = uh.authenticateUser(emailAddress, encryptedPass);

			//we've found a user that matches the credentials
			if(emailAddress != null){
				//invalidate current session, then get new session for our user (combats: session hijacking)
				session.invalidate();
				session=request.getSession(true);
				session.setAttribute("user", user);
				url="LogIn.jsp";
			}
			// user doesn't exist, redirect to previous page and show error
			else{
				String errorMessage = "Error: Unrecognized Usernames or Password<br>Login attempts remaining: "+(3-(loginAttempts));
				request.setAttribute("errorMessage", errorMessage);

				//track login attempts (combats: brute force attacks)
				session.setAttribute("loginAttempts", loginAttempts++);
				url = "index.jsp";
			}
		}
		//forward our request along
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
