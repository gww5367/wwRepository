package com.gww.www;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserServlet
 */
//@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, 
	        HttpServletResponse response)throws ServletException, IOException {
			response.setContentType("text/html;charset=utf-8");
			//��ȡ�û������Ϣ
			String username="����";
			PrintWriter printWriter = response.getWriter();
			printWriter.write("�û���Ϊ��"+username+ "<br>");
			//���������ѯ������Ϣ
			request.getRequestDispatcher("/OrderServlet").include(request, response);
			printWriter.write("��ѯ����");
		}
		public void doPost(HttpServletRequest request,
	        HttpServletResponse response)throws ServletException, IOException {
			doGet(request, response);
		}


}
