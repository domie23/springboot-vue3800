package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussshengxianchanpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussshengxianchanpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussshengxianchanpinView;


/**
 * 生鲜产品评论表
 *
 * @author 
 * @email 
 * @date 2022-05-07 23:12:14
 */
public interface DiscussshengxianchanpinService extends IService<DiscussshengxianchanpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussshengxianchanpinVO> selectListVO(Wrapper<DiscussshengxianchanpinEntity> wrapper);
   	
   	DiscussshengxianchanpinVO selectVO(@Param("ew") Wrapper<DiscussshengxianchanpinEntity> wrapper);
   	
   	List<DiscussshengxianchanpinView> selectListView(Wrapper<DiscussshengxianchanpinEntity> wrapper);
   	
   	DiscussshengxianchanpinView selectView(@Param("ew") Wrapper<DiscussshengxianchanpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussshengxianchanpinEntity> wrapper);
   	

}

