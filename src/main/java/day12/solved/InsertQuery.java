package day12.solved;


import day11.solved.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class InsertQuery {
	
	    public static void main(String[] args) throws Exception {        
	         
	        
	        Connection connection = ConnectionUtil.getConnection();
	        System.out.println(connection);
	         
	        Statement stmt = connection.createStatement();
	         
	        // Step 03: Execute Insert Query
	        String query ="INSERT INTO user (username,email,password ) VALUES (\"vanithavelu\",\"vanithavelu@ctr.freshworks.com\", \"24123\")";
	        int rows = stmt.executeUpdate(query);
	        System.out.println("No of rows inserted :" + rows );
	         
	        //Step 04: Execute SELECT Query
	        final String selectQuery = "SELECT username,email FROM USER";
	         
	        //Step 05: Get the resultset
	        ResultSet rs = stmt.executeQuery(selectQuery);
	         
	        //Step 06: Iterate the result
	        while ( rs.next()) {
//	        	int userId = rs.getInt("user_id");            
	        	String userName = rs.getString("username");
	            String emailID = rs.getString("email");
	             
	            System.out.println(" UserName:" + userName + ", EMAIL ID:" + emailID);
	        }
	         
	        //Step 07: close the connection resources       
	        rs.close();
	        stmt.close();
	        connection.close();
	         
	         
	         
	    }
	     
	}
