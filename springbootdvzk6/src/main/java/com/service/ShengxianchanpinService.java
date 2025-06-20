package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShengxianchanpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShengxianchanpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShengxianchanpinView;


/**
 * 生鲜产品
 *
 * @author 
 * @email 
 * @date 2022-05-07 23:12:14
 */
public interface ShengxianchanpinService extends IService<ShengxianchanpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShengxianchanpinVO> selectListVO(Wrapper<ShengxianchanpinEntity> wrapper);
   	
   	ShengxianchanpinVO selectVO(@Param("ew") Wrapper<ShengxianchanpinEntity> wrapper);
   	
   	List<ShengxianchanpinView> selectListView(Wrapper<ShengxianchanpinEntity> wrapper);
   	
   	ShengxianchanpinView selectView(@Param("ew") Wrapper<ShengxianchanpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShengxianchanpinEntity> wrapper);
   	

}

