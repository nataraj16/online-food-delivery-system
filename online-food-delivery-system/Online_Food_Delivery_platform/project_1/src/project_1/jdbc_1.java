package project_1;

import java.sql.*;
import java.util.*;

public class jdbc_1 {

	public static void main(String[] args)throws ClassNotFoundException, SQLException  {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/adminlogin", "root", "");
		//Step-II: Creating JDBC Statements
				Statement stmt = con.createStatement();
				
				
				//Step-III: Execute SQL Statements
				Scanner ini = new Scanner(System.in);
				System.out.print("Enter S No : ");
				int sno = ini.nextInt();
				System.out.print("Enter email id: ");
				String user = ini.next();
				System.out.print("Enter password: ");
				String pass = ini.next();
				String sql = "insert into `login` values('"+sno+"', '"+user+"', '"+pass+"')";
				stmt.executeUpdate(sql);
				String qry = "Select * from login";
				
				//Step-IV: Get ResultSet
				ResultSet rs = stmt.executeQuery(qry);
				while(rs.next()) {
					System.out.println(rs.getString("sno") + "\t" + rs.getString("user")+ "\t" + rs.getString("pass"));
				}
				
				//Step=V: Close Connections
				stmt.close();
				con.close();

	}

}
