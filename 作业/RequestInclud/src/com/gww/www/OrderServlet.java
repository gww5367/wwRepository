package com.gww.www;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OrderServlet
 */
//@WebServlet("/OrderServlet")
public class OrderServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, 
	        HttpServletResponse response)throws ServletException, IOException {
			// ������Ӧʱʹ�õ��ַ�����
			response.setContentType("text/html;charset=utf-8");
			//��ȡ�û���Ӧ�Ķ�����Ϣ
			String orderId="001";
			String orderContent="ƻ���ֻ�";
			PrintWriter printWriter = response.getWriter();
			printWriter.write("������ţ�"+orderId+ "<br>");
			printWriter.write("�������ݣ�"+orderContent+ "<br>");
			
		}
		public void doPost(HttpServletRequest request,
	        HttpServletResponse response)throws ServletException, IOException {
			doGet(request, response);
		}


}
