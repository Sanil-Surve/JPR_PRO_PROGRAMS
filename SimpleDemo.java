public class SimpleDemo 
{ 
    public static void main(String[] args) 
	{ 
	    Connection con=null; 
		Statement stmt=null; 
		ResultSet rs=null; 
		try 
		{ 
		    String jdbcurl="jdbc:mysql://localhost:3306/test"; 
			con=DriverManager.getConnection(jdbcurl, "root", "root"); 
			System.out.println("Connection established"); 
			stmt=con.createStatement(); 
			rs=stmt.executeQuery("select * from emp"); 
			System.out.println("Empid \t Emap name \t City \t Salary"); 
			while(rs.next()) 
			{ 
		        System.out.print(rs.getInt(1)+"\t"); 
				System.out.print(rs.getString(2)+"\t"); 
				System.out.print(rs.getString(3)+"\t"); 
				System.out.print(rs.getFloat(4)); 
				System.out.println(); 
			} 
		} 
		catch(ClassNotFoundException e) 
		{ 
		    e.printStackTrace();
		} 
		catch(SQLException e) 
		{
			e.printStackTrace()
		} 
		finally 
		{
			try 
			{ 
			    rs.close(); 
				stmt.close(); 
				con.close(); 
			} catch(Exception e)
			{
				
			} 
		}
	} 
}  	