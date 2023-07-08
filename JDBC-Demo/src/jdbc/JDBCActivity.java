package jdbc;

import java.sql.*;

public class JDBCActivity {

	public static void main(String[] args) throws SQLException {
		String dburl="jdbc:mysql://localhost:3306/classicmodels";
		String user="root";
		String password="password";
		
		System.out.println("-----------MySql Connection----");
		Connection conn= DriverManager.getConnection(dburl, user, password);
		String selectSQL= "select * from employees where officecode=? or officecode=?";
		PreparedStatement ps= conn.prepareStatement(selectSQL);
		ps.setInt(1,1);
		ps.setInt(2,4);
		ResultSet result= ps.executeQuery();
		while(result.next()) {
			String name= result.getString("firstName");
			String email= result.getString("email");
			System.out.println(name+" | "+ email);
		}
		System.out.println("************************************");
		String selectSQL2= "select * from orderdetails where orderNumber=? or orderNumber=? ";
		PreparedStatement ps2= conn.prepareStatement(selectSQL2);
		ps2.setInt(1,10100);
		ps2.setInt(2,10102);
		ResultSet result2= ps2.executeQuery();
		while(result2.next()) {
			String orderNumber= result2.getString("orderNumber");
			String productCode= result2.getString("productCode");
			String quantityOrdered= result2.getString("quantityOrdered");
			System.out.println(orderNumber+" | "+ productCode+" | "+quantityOrdered);
		}
		System.out.println("************************************");

		String selectSQL3= "select * from employees where length(lastName)< ?";
		PreparedStatement ps3= conn.prepareStatement(selectSQL3);
		ps3.setInt(1,5);
		ResultSet result3= ps3.executeQuery();
		while(result3.next()) {
			String name1= result3.getString("firstName");
			String lastname= result3.getString("lastName");
			String email1= result3.getString("email");
			System.out.println(name1+" | "+ lastname+" | "+ email1);
		}
		
		System.out.println("************************************");
		
		
		String updateSQL= "update employees set extension= ? where officecode =?";
		PreparedStatement ps4= conn.prepareStatement(updateSQL);
		ps4.setString(1,"x5698");
		ps4.setInt(2,2);
	    ps4.executeUpdate();
		//Update the extension number of employees whose officecode is 2,
		//and the new extension number will be “5698.” 
		// "update employees set firstName=? , lastName=? where employeeNumber=?";
	}

}
