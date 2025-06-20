package com.entity.view;

import com.entity.CaigoudandengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 采购单登记
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-07 23:12:14
 */
@TableName("caigoudandengji")
public class CaigoudandengjiView  extends CaigoudandengjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CaigoudandengjiView(){
	}
 
 	public CaigoudandengjiView(CaigoudandengjiEntity caigoudandengjiEntity){
 	try {
			BeanUtils.copyProperties(this, caigoudandengjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
