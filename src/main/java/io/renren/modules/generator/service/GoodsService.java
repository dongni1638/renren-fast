package io.renren.modules.generator.service;

import io.renren.modules.generator.entity.GoodsEntity;

import java.util.List;
import java.util.Map;

/**
 * 文件管理
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-09-19 22:43:00
 */
public interface GoodsService {
	
	GoodsEntity queryObject(Long goodsId);
	
	List<GoodsEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(GoodsEntity goods);
	
	void update(GoodsEntity goods);
	
	void delete(Long goodsId);
	
	void deleteBatch(Long[] goodsIds);
}
