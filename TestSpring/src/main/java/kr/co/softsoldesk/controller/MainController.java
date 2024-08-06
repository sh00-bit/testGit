package kr.co.softsoldesk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.softsoldesk.beans.MemberBean;
import kr.co.softsoldesk.service.MemberService;

@Controller
public class MainController {
	
	@Autowired
	MemberService memberService;


	@GetMapping("/main")
	private String main(@ModelAttribute("memberBean") MemberBean memberBean){
			
		return "main";
	}
	
	@PostMapping("/member/join")
	private String memberJoin(@ModelAttribute("memberBean") MemberBean memberBean) {
		
		memberService.addMember(memberBean);
		
		return "success";
	}
	
}
