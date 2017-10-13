package io.renren.modules.generator.dao;

import io.renren.modules.generator.entity.GoodsEntity;
import io.renren.modules.sys.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;

/**
 * 文件管理
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-09-19 22:43:00
 */
@Mapper
public interface GoodsDao extends BaseDao<GoodsEntity> {
	
}
