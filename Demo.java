 import java.awt.*; 
 import java.io.*; 
 public class Demo 
 { 
    public static void main(String args[])
	{ 
	   try 
	   { 
	       Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); 
		   System.out.println("Driver Loaded"); 
		   Connection con=DriverManager.getConnection("jdbc:odbc:mybd1"); 
		   System.out.println("Connection Establish"); 
		   con.close(); 
		   System.out.println("Connection close "); 
	   } 
	   catch(Exception e) 
	   { 
	       System.out.println("Error"); 
	   }
	} 
}  