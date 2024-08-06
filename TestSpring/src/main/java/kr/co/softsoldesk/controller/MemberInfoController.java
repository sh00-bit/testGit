package kr.co.softsoldesk.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.softsoldesk.beans.MemberBean;
import kr.co.softsoldesk.service.MemberService;

@Controller
public class MemberInfoController {
	
	@Autowired
	private MemberService memberService;
	
	@GetMapping("/MemberInfo")
	public String MemberInfo(Model model) {
	
		List<MemberBean> list = memberService.getMemberInfo();
		model.addAttribute("list", list);
		
		return "MemberInfo";
	}
	
	
}
