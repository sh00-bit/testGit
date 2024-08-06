package kr.co.softsoldesk.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import kr.co.softsoldesk.beans.MemberBean;

public interface MemberMapper{
	
	@Insert("insert into member values(user_seq.nextval, #{user_name}, #{user_pass})")
	void addMember(MemberBean memberBean);
	
	@Select("select user_idx,user_name, user_pass from member")
	List<MemberBean> getMemberInfo();
	
}
