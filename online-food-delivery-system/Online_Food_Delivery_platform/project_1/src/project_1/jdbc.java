package project_1;
import java.sql.*;
import java.util.*;


public class jdbc {

	public static void main(String[] args)throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/customerlogin", "root", "");
		//Step-II: Creating JDBC Statements
				Statement stmt = con.createStatement();
				
				
				//Step-III: Execute SQL Statements
				Scanner ini = new Scanner(System.in);
				System.out.print("Enter S No : ");
				int SNo = ini.nextInt();
				System.out.print("Enter email id: ");
				String userid = ini.next();
				System.out.print("Enter password: ");
				String Password = ini.next();
				String sql = "insert into `login_details` values('"+SNo+"', '"+userid+"', '"+Password+"')";
				stmt.executeUpdate(sql);
				String qry = "Select * from login_details";
				
				//Step-IV: Get ResultSet
				ResultSet rs = stmt.executeQuery(qry);
				while(rs.next()) {
					System.out.println(rs.getString("S No") + "\t" + rs.getString("userid")+ "\t" + rs.getString("Password"));
				}
				
				//Step=V: Close Connections
				stmt.close();
				con.close();



	}

}
