import java.sql.*;

class ConnectionExample{
	public static void main(String args[]){
		try{
			/* 
			 * Περίπτωση 1η
			 * Χρήση της μεθόδου Class.forName() για δυναμική φόρτωση του class αρχείου
			 * του driver στη μνήμη
			 */
			Class.forName("com.mysql.jdbc.Driver");
			
			/* 
			 * Περίπτωση 2η
			 * Χρήση της static μεθόδου DriverManager.registerDriver()
			 */
			//Driver myDriver = new com.mysql.jdbc.Driver();
			//DriverManager.registerDriver(myDriver);
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/world","dimokas","dimok2016#");
			
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from city");
			
			while(rs.next())
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
			
			con.close();
		}
		catch(Exception e){ 
			System.out.println(e);
		}
	}
}