package MyPack;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private String[] jokes= {
			"Why Programmer Are Single? Because they can't 'C#' ",
			"Why don't programmer don't like nature? Because it has too many bugs",
			"Why do programmers prefer dark mode?,Because the light attracts bugs!",
			"How does a programmer open a jar?\r\n"
			+ "They install Java first."
			
	};
       
   
    public MyServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String st1 = request.getParameter("first");
		 String st2 = request.getParameter("second");
		 String st3=request.getParameter("bt1");
		   
		        int num1 = Integer.parseInt(st1);
		        int num2 = Integer.parseInt(st2);
		        int result = 0;

		        if(st3.equals("1"))
		        {
		        	result=num1+num2;
		        }
		        else if(st3.equals("2"))
		        {
		        	result=num1-num2;
		        }
		        
		        else if(st3.equals("3"))
		        {
		        	result=num1*num2;
		        }
		        
		        else if(st3.equals("4"))
		        {
		        	result=num1/num2;
		        }
		        else {
		        	response.getWriter().append("Invalid Operation");
		        }
		        //response.getWriter().append("Result is: "+result);
		        
		        
		        
		        int randomIndex=(int)(Math.random()*jokes.length);
		        String randomJoke=jokes[randomIndex];
		        response.sendRedirect("NewFile.jsp?result="+result+"&jokes="+randomJoke);
	}
	


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
