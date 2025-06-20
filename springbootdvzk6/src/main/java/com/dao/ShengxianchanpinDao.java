package com.dao;

import com.entity.ShengxianchanpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShengxianchanpinVO;
import com.entity.view.ShengxianchanpinView;


/**
 * 生鲜产品
 * 
 * @author 
 * @email 
 * @date 2022-05-07 23:12:14
 */
public interface ShengxianchanpinDao extends BaseMapper<ShengxianchanpinEntity> {
	
	List<ShengxianchanpinVO> selectListVO(@Param("ew") Wrapper<ShengxianchanpinEntity> wrapper);
	
	ShengxianchanpinVO selectVO(@Param("ew") Wrapper<ShengxianchanpinEntity> wrapper);
	
	List<ShengxianchanpinView> selectListView(@Param("ew") Wrapper<ShengxianchanpinEntity> wrapper);

	List<ShengxianchanpinView> selectListView(Pagination page,@Param("ew") Wrapper<ShengxianchanpinEntity> wrapper);
	
	ShengxianchanpinView selectView(@Param("ew") Wrapper<ShengxianchanpinEntity> wrapper);
	

}
