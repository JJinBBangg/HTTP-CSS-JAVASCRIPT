package com.newlecture.web.etc;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/spag")
public class Spag extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String num_ = request.getParameter("n");
		int num = 0;
		if(num_ != null && !num_.equals("")) {
			num = Integer.parseInt(num_);
		}
		String result = "";
		if(num% 2 != 1){
			result = "짝수입니다.";
		} else {
			result = "홀수입니다.";
		}
		request.setAttribute("result", result);
		String[] names = {"kookjin", "ahn"};
		request.setAttribute("names", names);
		Map<String, Object> notice = new HashMap<>();
		notice.put("id",1);
		notice.put("title", "제목");
		request.setAttribute("notice", notice);
		
		//page context 내장객체 : 패이지 내에서만 사용가능
		//request : 페이지 간 연결하여 사용가능
		//session : 현재 세션
		//application : 모든 세션, 패이지
		//----------- 위 4가지 서버상에 저장----------//
		
		//cookie : 클라이언트에 저장
		
		//redirect : 새로운 작업요청
		//forward : 현재의 작업요청을 이어서 값을 전달
		RequestDispatcher dispatcher = request.getRequestDispatcher("spag.jsp");
		
		dispatcher.forward(request, response);
	}
}
