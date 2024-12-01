package com.Swapnil.web;

import java.io.IOException;

import com.Swapnil.web.dao.StudentDao;
import com.Swapnil.web.model.Student;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class GetStudentController
 */
public class GetStudentController extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			int ID = Integer.parseInt(request.getParameter("ID"));
			
			StudentDao dao = new StudentDao();
			Student S1 = dao.getStudent(ID);
			
			//using request Dipatcher Also need to change in showStudentjsp
//			request.setAttribute("Student",S1);
//			
//	        RequestDispatcher rd=request.getRequestDispatcher("ShowStudent.jsp");
//	        rd.forward(request, response);
			
			//using session also need to change in shoStudentjsp
			HttpSession httpSession = request.getSession();
			httpSession.setAttribute("Student", S1);
            response.sendRedirect("ShowStudent.jsp");
			
			
	}
		

	

}
