package kr.co.softsoldesk.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import kr.co.softsoldesk.beans.GoodsBean;

public interface GoodsMapper {
	
	@Insert("insert into Goods values(goods_seq.nextval, #{GoodsName}, #{GoodsPrice} , #{GoodsStore})")
	void addGoods(GoodsBean goodsBean);
	
	@Select("select GoodsName,GoodsPrice,GoodsStore from Goods")
	List<GoodsBean> getGoodsInfo();
}
