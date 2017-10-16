package jdbc_example;

import java.sql.*;

public class jdbcexample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
        //load driver
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		
		//get connection
		Connection con=DriverManager.getConnection("jdbc.odbc.ds");
		
		//create statements
		Statement sta=con.createStatement();
		String ddlcreate="create table hello(id number, name varchar2(50))";
        sta.execute(ddlcreate);
        System.out.println("table created");
	}

}
//java 8 doesn't support Type1 Driver