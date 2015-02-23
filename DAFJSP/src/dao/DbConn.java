package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConn {

		public Connection getConn(){
			Connection conn = null;
			
			try {
				Class.forName("org.gjt.mm.mysql.Driver");
				
				try {
					
					conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hk??useUnicode=false&characterEncoding=latin1", "root", "");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return conn;
		}
		
		public void freeConn(Connection conn, Statement s, ResultSet rs) {
			try {
				if (conn != null) {

					conn.close();
				}
				if (rs != null) {
					rs.close();
				}
				if (s != null) {
					s.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
