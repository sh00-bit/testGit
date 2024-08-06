package kr.co.softsoldesk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import kr.co.softsoldesk.beans.GoodsBean;
import kr.co.softsoldesk.service.GoodsService;

@Controller
public class GoodsController {

	@Autowired
	private GoodsService goodsService;
	
	@GetMapping("/goods")
	private String goods(@ModelAttribute("sellBean") GoodsBean goodsBean) {
		
		return "goods";
	}
	
	@GetMapping("Goods/sell")
	private String goodsSell(@ModelAttribute("sellBean") GoodsBean goodsBean) {
	
		goodsService.addGoods(goodsBean);
		return "success";
	}
	
}
