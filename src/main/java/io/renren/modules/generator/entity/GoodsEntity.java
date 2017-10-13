package io.renren.modules.generator.entity;

import java.io.Serializable;
import java.util.Date;


/**
 * 文件管理
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-09-19 22:43:00
 */
public class GoodsEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Long goodsId;
	//文件名称
	private String name;
	//文件介绍
	private String intro;
	//状态  0:异常  1：正常
	private Integer status;
	//创建者
	private String createUserId;
	//创建时间
	private Date createTime;

	/**
	 * 设置：
	 */
	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
	}
	/**
	 * 获取：
	 */
	public Long getGoodsId() {
		return goodsId;
	}
	/**
	 * 设置：文件名称
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：文件名称
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：文件介绍
	 */
	public void setIntro(String intro) {
		this.intro = intro;
	}
	/**
	 * 获取：文件介绍
	 */
	public String getIntro() {
		return intro;
	}
	/**
	 * 设置：状态  0:异常  1：正常
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：状态  0:异常  1：正常
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * 设置：创建者
	 */
	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}
	/**
	 * 获取：创建者
	 */
	public String getCreateUserId() {
		return createUserId;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getCreateTime() {
		return createTime;
	}
}
