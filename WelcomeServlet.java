import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import java.io.*;

public class WelcomeServlet extends GenericServlet {
    public void service (ServletRequest request, ServlerResponse response) throws ServletException , IOException
    {
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        pw.println("Hello");

    }
    
}
