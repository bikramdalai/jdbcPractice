package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WishMsgGen extends HttpServlet {
	
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
	//set ContentType
		res.setContentType("text/html");
	//get PrintWriter
		PrintWriter pw=res.getWriter();
	//b.logics
		LocalDateTime ldt=LocalDateTime.now();//gives the current date time
		int hour =ldt.getHour();//give hour 0 to 23
		if(hour<12)
			pw.println("<h1 style='color:blue;text-align:center'>GOOD MORNING</h1>");
		else if(hour<16)
			pw.println("<h1 style='color:blue;text-align:center'>GOOD AFTERNOON</h1>");
		else if(hour<20)
			pw.println("<h1 style='color:blue;text-align:center'>GOOD EVENING</h1>");
		else
			pw.println("<h1 style='color:blue;text-align:center'>GOOD night</h1>");
	
	//home href
		pw.println("<a href='http://localhost:3030/WISHApp2/home.html>HOME</a>");
	//close stream
		pw.close();
	}//service(_)
}//class
