package com.entity.view;

import com.entity.ShengxianchanpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 生鲜产品
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-07 23:12:14
 */
@TableName("shengxianchanpin")
public class ShengxianchanpinView  extends ShengxianchanpinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShengxianchanpinView(){
	}
 
 	public ShengxianchanpinView(ShengxianchanpinEntity shengxianchanpinEntity){
 	try {
			BeanUtils.copyProperties(this, shengxianchanpinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
