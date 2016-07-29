package com.spinsci.training;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class EmpolyeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(false);
		PrintWriter out = response.getWriter();
		/*out.print("<p> Username  = ");
		out.println(request.getParameter("un"));
		out.print("</p>");
		*/
		List<Pojo> ls = new ArrayList();
		Pojo emp = new Pojo();
		emp.setEmpName("bhargav");
		emp.setEmpDesignation("trainee Software Engineer");
		emp.setEmpMobile("878097678");
		ls.add(emp);
		for(Pojo empList:ls ){
			System.out.println(empList.getEmpName());
			System.out.println(empList.getEmpDesignation());
			System.out.println(empList.getEmpMobile());
			out.println("<p align='right'>User     :");
			out.print(session.getAttribute("username"));
			out.println("</p>");
			out.println("<p>EmployeeName                  : ");
			out.print(empList.getEmpName());
			out.print("</p>");
			out.println("<p>EmpDesignation      :");
			out.println(empList.getEmpDesignation());
			out.print("</p>");
			out.println("<p> EmpMobileNo        :");
			out.print(empList.getEmpMobile());
			out.println("</p>");
		}
	}

}
