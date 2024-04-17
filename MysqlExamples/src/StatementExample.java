import java.sql.*;
import java.util.Scanner;  

class StatementExample{  
	public static void main(String args[])throws Exception{  

		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/world","dimokas","dimok2016#");
		
		Statement stmt=con.createStatement();
		stmt.executeUpdate("insert into city values(4085, 'Kozani', 'GRC', 'West Macedonia', 60000)");
		int result=stmt.executeUpdate("update city set Population=46956 where ID=4080");  
		//int result=stmt.executeUpdate("delete from city where ID=4080");  
		System.out.println(result+" records affected"); 
		con.close();  
	}
}  