package com.gww.www;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet03
 */
@WebServlet(name = "Test03", urlPatterns = { "/Test03" })
public class TestServlet03 extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// ȡ��ServletContext�д�Ĵ���
		int count = (Integer) getServletContext().getAttribute("count");
		// ��ʾ��ҳ��
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().println("<h1>��վ�������� "+count+" ��!</h1>");
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}


}
