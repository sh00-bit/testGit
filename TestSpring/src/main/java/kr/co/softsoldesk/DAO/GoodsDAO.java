package kr.co.softsoldesk.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.softsoldesk.beans.GoodsBean;
import kr.co.softsoldesk.mapper.GoodsMapper;

@Repository
public class GoodsDAO {
	
	@Autowired
	private GoodsMapper goodsMapper;
	
	public void addGoods(GoodsBean goodsBean) {
		
		goodsMapper.addGoods(goodsBean);
	}
	
	public List<GoodsBean> getGoodsInfo(){
		
		return goodsMapper.getGoodsInfo();
	}
}
