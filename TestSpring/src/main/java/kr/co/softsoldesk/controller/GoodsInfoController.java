package kr.co.softsoldesk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.softsoldesk.beans.GoodsBean;
import kr.co.softsoldesk.service.GoodsService;

@Controller
public class GoodsInfoController {
	
	@Autowired
	private GoodsService goodsService;
	
	@GetMapping("/GoodsInfo")
	public String GoodsInfo(Model model) {
		
		List<GoodsBean> goodslist = goodsService.getGoodsInfo();
		model.addAttribute("goodslist",goodslist);
		
		return "GoodsInfo";
	}
}
