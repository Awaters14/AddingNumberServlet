package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.numberAdder;

/**
 * Servlet implementation class getNumberServlet
 */
@WebServlet("/getNumberServlet")
public class getNumberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getNumberServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userNumber1= request.getParameter("userNumber1");
		String userNumber2= request.getParameter("userNumber2");
		String userNumber3= request.getParameter("userNumber3");
		
		numberAdder userNumber = new numberAdder(Integer.parseInt(userNumber1),Integer.parseInt(userNumber2),Integer.parseInt(userNumber3));
		request.setAttribute("userNumbers", userNumber);
		getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
	}

}
