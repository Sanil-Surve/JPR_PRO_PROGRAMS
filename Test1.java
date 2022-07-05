import java.sql.*; 

class Test1
{ 
    public static void main(String ar[])throws Exception 
	{ 
	    String url="jdbc:odbc:st"; 
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); 
		System.out.println("Drivers Loaded"); 
		Connection c=DriverManager.getConnection(); 
    } 
}  

//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); 
//Connection c=DriverManager.getConnection(); 
//String url="jdbc:odbc:st"; 
//System.out.println("Drivers Loaded"); 