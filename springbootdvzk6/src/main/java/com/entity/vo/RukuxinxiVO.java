package com.entity.vo;

import com.entity.RukuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 入库信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-05-07 23:12:14
 */
public class RukuxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 仓库名称
	 */
	
	private String cangkumingcheng;
		
	/**
	 * 产品名称
	 */
	
	private String chanpinmingcheng;
		
	/**
	 * 数量
	 */
	
	private Integer shuliang;
		
	/**
	 * 入库时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date rukushijian;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
	/**
	 * 设置：仓库名称
	 */
	 
	public void setCangkumingcheng(String cangkumingcheng) {
		this.cangkumingcheng = cangkumingcheng;
	}
	
	/**
	 * 获取：仓库名称
	 */
	public String getCangkumingcheng() {
		return cangkumingcheng;
	}
				
	
	/**
	 * 设置：产品名称
	 */
	 
	public void setChanpinmingcheng(String chanpinmingcheng) {
		this.chanpinmingcheng = chanpinmingcheng;
	}
	
	/**
	 * 获取：产品名称
	 */
	public String getChanpinmingcheng() {
		return chanpinmingcheng;
	}
				
	
	/**
	 * 设置：数量
	 */
	 
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
				
	
	/**
	 * 设置：入库时间
	 */
	 
	public void setRukushijian(Date rukushijian) {
		this.rukushijian = rukushijian;
	}
	
	/**
	 * 获取：入库时间
	 */
	public Date getRukushijian() {
		return rukushijian;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
			
}
