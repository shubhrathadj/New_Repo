

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class hai
 */
@SuppressWarnings("unused")
public class hai extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 public void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        response.setContentType("text/html");
	        PrintWriter out = response.getWriter();
	        
	        
	        String inputNumberStr = "2443";
	        int inputNumber = Integer.parseInt(inputNumberStr);
	        
	        
	        if (inputNumber % 2 == 0) { // Convert the number to a string for palindrome check
	            String numberStr = String.valueOf(inputNumber);
	            String reversedStr = new StringBuilder(numberStr).reverse().toString();
	            
	            
	            if (numberStr.equals(reversedStr)) {
	                out.println("<html><body>");
	                out.println("<h2>" + inputNumber + " is an even palindrome number.</h2>");
	                out.println("</body></html>");
	            } else {
	                out.println("<html><body>");
	                out.println("<h2>" + inputNumber + " is an even number but not a palindrome.</h2>");
	                out.println("</body></html>");
	            }
	        } else {
	            out.println("<html><body>");
	            out.println("<h2>" + inputNumber + " is not an even number.</h2>");
	            out.println("</body></html>");
	        }
	    }
	}

