package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShengxiancangkuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShengxiancangkuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShengxiancangkuView;


/**
 * 生鲜仓库
 *
 * @author 
 * @email 
 * @date 2022-05-07 23:12:14
 */
public interface ShengxiancangkuService extends IService<ShengxiancangkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShengxiancangkuVO> selectListVO(Wrapper<ShengxiancangkuEntity> wrapper);
   	
   	ShengxiancangkuVO selectVO(@Param("ew") Wrapper<ShengxiancangkuEntity> wrapper);
   	
   	List<ShengxiancangkuView> selectListView(Wrapper<ShengxiancangkuEntity> wrapper);
   	
   	ShengxiancangkuView selectView(@Param("ew") Wrapper<ShengxiancangkuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShengxiancangkuEntity> wrapper);
   	

}

