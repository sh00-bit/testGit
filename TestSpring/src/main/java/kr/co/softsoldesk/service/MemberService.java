package kr.co.softsoldesk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.softsoldesk.DAO.MemberDAO;
import kr.co.softsoldesk.beans.MemberBean;

@Service
public class MemberService {
	
	@Autowired
	private MemberDAO memeberDAO;
	
	public void addMember(MemberBean memberBean) {
		
		memeberDAO.addMember(memberBean);
		
	}
	
	public List<MemberBean> getMemberInfo() {
		
		return memeberDAO.getMemberInfo();
	}


}
