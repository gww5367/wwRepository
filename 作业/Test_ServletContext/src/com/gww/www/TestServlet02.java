package com.gww.www;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.*;
import javax.servlet.*;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet02
 */
//@WebServlet("/TestServlet02")
public class TestServlet02 extends HttpServlet {
	@Override
	public void init() throws ServletException {
		// ����������һ����ʼֵ 0 
		int count = 0;
		// �� 0 ���뵽 ServletContext��
		getServletContext().setAttribute("count", count);
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// ��ԭ���Ĵ���ȡ����
		int count = (Integer) getServletContext().getAttribute("count");
		count += 1;
		// ���뵽SErvletContext��
		getServletContext().setAttribute("count", count);
		// ��ҳ�������ӭ����!
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().println("<h1>��ӭ���ٱ���վ! ��������"+count+"�η���</h1>");
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}


}
