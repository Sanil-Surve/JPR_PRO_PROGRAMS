import java.io.*; 
import java.util.*; 

public class HelloWorld extends HttpServlet 
{ 
   public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException 
   { 
      response.setContentType("text/html"); 
	  PrintWriter out = response.getWriter(); 
	  HttpSession hp=request.getSession(true); 
	  Date create=new Date(hp.getCreationTime()); 
	  Date access=new Date(hp.getLastAccessedTime()); 
	  System.out.println("<h1><br>Session is created at "+create); 
	  System.out.println("<h1><br>Last access time is "+access); 
	  System.out.println("<h1><br>Session id is "+hp.getId()); 
	}
} 