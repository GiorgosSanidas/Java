import java.sql.*;

class ConnectionExample{
	public static void main(String args[]){
		try{
			/* 
			 * ��������� 1�
			 * ����� ��� ������� Class.forName() ��� �������� ������� ��� class �������
			 * ��� driver ��� �����
			 */
			Class.forName("com.mysql.jdbc.Driver");
			
			/* 
			 * ��������� 2�
			 * ����� ��� static ������� DriverManager.registerDriver()
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