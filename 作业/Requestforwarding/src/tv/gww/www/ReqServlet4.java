package tv.gww.www;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReqServlet4
 */
//@WebServlet("/ReqServlet4")
public class ReqServlet4 extends HttpServlet {
	public void doGet(HttpServletRequest request, 
	        HttpServletResponse response)throws ServletException, IOException {
			// ������Ӧʱʹ�õ��ַ�����
			response.setContentType("text/html;charset=utf-8");
			String userId = (String) request.getAttribute("userId");
			//��ȡ�û���Ӧ����Ϣ
			String username="����";
			int age=20;
			PrintWriter printWriter = response.getWriter();
			printWriter.write("��ѯ���Ϊ"+userId+ "���û���Ϣ���£�<br>");
			printWriter.write("�û���Ϊ��"+username+ "<br>");
			printWriter.write("�û����䣺"+age+ "<br>");
			
		}
		public void doPost(HttpServletRequest request,
	        HttpServletResponse response)throws ServletException, IOException {
			doGet(request, response);
		}


}
