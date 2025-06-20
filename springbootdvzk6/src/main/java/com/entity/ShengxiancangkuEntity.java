package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 生鲜仓库
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-05-07 23:12:14
 */
@TableName("shengxiancangku")
public class ShengxiancangkuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShengxiancangkuEntity() {
		
	}
	
	public ShengxiancangkuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 仓库编号
	 */
					
	private String cangkubianhao;
	
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
	 * 保存状态
	 */
					
	private String baocunzhuangtai;
	
	/**
	 * 仓库位置
	 */
					
	private String cangkuweizhi;
	
	/**
	 * 详情
	 */
					
	private String xiangqing;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：仓库编号
	 */
	public void setCangkubianhao(String cangkubianhao) {
		this.cangkubianhao = cangkubianhao;
	}
	/**
	 * 获取：仓库编号
	 */
	public String getCangkubianhao() {
		return cangkubianhao;
	}
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
	 * 设置：保存状态
	 */
	public void setBaocunzhuangtai(String baocunzhuangtai) {
		this.baocunzhuangtai = baocunzhuangtai;
	}
	/**
	 * 获取：保存状态
	 */
	public String getBaocunzhuangtai() {
		return baocunzhuangtai;
	}
	/**
	 * 设置：仓库位置
	 */
	public void setCangkuweizhi(String cangkuweizhi) {
		this.cangkuweizhi = cangkuweizhi;
	}
	/**
	 * 获取：仓库位置
	 */
	public String getCangkuweizhi() {
		return cangkuweizhi;
	}
	/**
	 * 设置：详情
	 */
	public void setXiangqing(String xiangqing) {
		this.xiangqing = xiangqing;
	}
	/**
	 * 获取：详情
	 */
	public String getXiangqing() {
		return xiangqing;
	}

}
