package com.javaeunjeong.board.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javaeunjeong.board.dao.BDao;

public class BWriteCommand implements BCommand{

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse resoinse) {
		// TODO Auto-generated method stub
		
		String bName = request.getParameter("bname");
		String btitle = request.getParameter("btitle");
		String bcontent = request.getParameter("bcontent");
		
		BDao dao = new BDao();
		dao.write(bName,btitle,bcontent);
		
		
		
	}

}
