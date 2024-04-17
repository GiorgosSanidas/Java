import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;


class CallableStatementExample1{  
	public static void main(String args[]){  
		try{  
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/world","dimokas","dimok2016#");

			String query = "{call getcountry (?, ?)}";
			CallableStatement stmt = con.prepareCall(query);
			stmt.setString(1, "GRC");  
			stmt.registerOutParameter(2, java.sql.Types.VARCHAR);
			stmt.execute(); 
			String countryName = stmt.getString(2);
			System.out.println("Country Name = "+countryName);
			stmt.close();
			con.close();
		}
		catch(Exception e){ System.out.println(e);}  
	}  
}  