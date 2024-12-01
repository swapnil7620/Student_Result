package com.Swapnil.web.dao;

import java.sql.*;
import com.Swapnil.web.model.Student;
public class StudentDao {

	public Student getStudent(int ID) {
		Student S1 = new Student();
//		S1.setID(10);
//		S1.setNAME("John");
//		S1.setAGE(23);
//		S1.setMARKS(70.0);
//		
		try {
//			Class.forName("com.mysql.jdbc.Driver");//deprecated 
			Class.forName("com.mysql.cj.jdbc.Driver");// use this one
			
// Ensure you must have database with  all four Coulumn 
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/put your own Database Name","root","Put Your Own Password");
			Statement statement = connection.createStatement();
		ResultSet rSet =	statement.executeQuery("Select*from Student where ID="+ ID);
		if(rSet.next()) {
			S1.setID((rSet.getInt("ID")));
			S1.setNAME(rSet.getString("NAME"));
			S1.setAGE(rSet.getInt("AGE"));
			S1.setMARKS(rSet.getDouble("MARKS"));
			
		}
	
             connection.close();
         	return S1;

		}	
		catch(ClassNotFoundException ex) {
        	System.out.println((ex));
        }

		catch(SQLException s) {
			System.out.println(s);
		}
		catch(Exception e){
			
		    System.out.print(e);
			    
		}
         
        return S1;
	}
}
