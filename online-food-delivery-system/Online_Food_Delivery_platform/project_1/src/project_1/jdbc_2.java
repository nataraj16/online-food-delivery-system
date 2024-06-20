package project_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

class jdbc_2 {

	public static void main(String[] args)throws ClassNotFoundException, SQLException {
		
		// TODO Auto-generated method stub

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantdetails", "root", "");
		//Step-II: Creating JDBC Statements
				Statement stmt = con.createStatement();
				
				
				//Step-III: Execute SQL Statements
				Scanner ini = new Scanner(System.in);
				System.out.print("Enter restaurantname: ");
				String restaurantname = ini.next();
				System.out.print("Enter onwer name: ");
				String onwername = ini.next();
				System.out.print("Enter contact number : ");
				String contact = ini.next();
				System.out.print("Enter email id: ");
				String email = ini.next();
				System.out.print("Enter address: ");
				String address = ini.next();
				System.out.print("Enter pincode number : ");
				String pincode = ini.next();
				String sql = "insert into `details` values('"+restaurantname+"', '"+onwername+"', '"+contact+"','"+email+"', '"+address+"', '"+pincode+"')";
				stmt.executeUpdate(sql);
				String qry = "Select * from login";
				
				//Step-IV: Get ResultSet
				ResultSet rs = stmt.executeQuery(qry);
				while(rs.next()) {
					System.out.println(rs.getString("restaurantname") + "\t" + rs.getString("onwername")+ "\t" + rs.getString("contact")+"\t"+rs.getString("email") + "\t" + rs.getString("address")+ "\t" + rs.getString("pincode"));
				}
				
				//Step=V: Close Connections
				stmt.close();
				con.close();
	}

}
