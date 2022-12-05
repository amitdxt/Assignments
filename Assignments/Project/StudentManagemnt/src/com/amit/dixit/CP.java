package com.amit.dixit;


	import java.sql.*;
	public class CP {
		static Connection con;
		public static Connection createc() {
			
			try {
				
				//load the driver
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				//create the Connection
				String user = "*****"; //user of mysql
				String password = "*****"; //password of mysql
				String url = "jdbc:mysql://localhost:3306/student_management";
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management","root","root");
				
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			return con;
			
		}
	}

	;

