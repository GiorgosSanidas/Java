import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;


class PreparedStatementExample{  
	public static void main(String args[]){  
		try{  
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/world","dimokas","dimok2016#");

			PreparedStatement stmt=con.prepareStatement("insert into city values(?,?,?,?,?)");  
			stmt.setInt(1,4086);  
			stmt.setString(2,"Volos");  
			stmt.setString(3,"GRC");  
			stmt.setString(4,"Thessalia");  
			stmt.setString(5,"95452");  
			int i=stmt.executeUpdate();  
			System.out.println(i+" records inserted");  
			con.close();  
		}catch(Exception e){ System.out.println(e);}  
	}  
}  