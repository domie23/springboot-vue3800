package com.dao;

import com.entity.DiscussshengxianchanpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussshengxianchanpinVO;
import com.entity.view.DiscussshengxianchanpinView;


/**
 * 生鲜产品评论表
 * 
 * @author 
 * @email 
 * @date 2022-05-07 23:12:14
 */
public interface DiscussshengxianchanpinDao extends BaseMapper<DiscussshengxianchanpinEntity> {
	
	List<DiscussshengxianchanpinVO> selectListVO(@Param("ew") Wrapper<DiscussshengxianchanpinEntity> wrapper);
	
	DiscussshengxianchanpinVO selectVO(@Param("ew") Wrapper<DiscussshengxianchanpinEntity> wrapper);
	
	List<DiscussshengxianchanpinView> selectListView(@Param("ew") Wrapper<DiscussshengxianchanpinEntity> wrapper);

	List<DiscussshengxianchanpinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussshengxianchanpinEntity> wrapper);
	
	DiscussshengxianchanpinView selectView(@Param("ew") Wrapper<DiscussshengxianchanpinEntity> wrapper);
	

}
