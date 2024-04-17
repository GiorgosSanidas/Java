import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;


class CallableStatementExample2{  
	public static void main(String args[]){  
		try{  
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/world","dimokas","dimok2016#");

			String query = "{call getcitybycoountry (?)}";
			CallableStatement stmt = con.prepareCall(query);
			stmt.setString(1, "GRC");  
			boolean hasResults = stmt.execute();
            while (hasResults) {
                ResultSet resultSet = stmt.getResultSet();
                // process result set
                while (resultSet.next()) {
                    String cityName = resultSet.getString("name");
                    System.out.println(cityName);
                }
                hasResults = stmt.getMoreResults();
            }			
			stmt.close();
			con.close();
		}
		catch(Exception e){ System.out.println(e);}  
	}  
}  