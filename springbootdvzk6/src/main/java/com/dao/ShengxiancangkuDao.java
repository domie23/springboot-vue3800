package com.dao;

import com.entity.ShengxiancangkuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShengxiancangkuVO;
import com.entity.view.ShengxiancangkuView;


/**
 * 生鲜仓库
 * 
 * @author 
 * @email 
 * @date 2022-05-07 23:12:14
 */
public interface ShengxiancangkuDao extends BaseMapper<ShengxiancangkuEntity> {
	
	List<ShengxiancangkuVO> selectListVO(@Param("ew") Wrapper<ShengxiancangkuEntity> wrapper);
	
	ShengxiancangkuVO selectVO(@Param("ew") Wrapper<ShengxiancangkuEntity> wrapper);
	
	List<ShengxiancangkuView> selectListView(@Param("ew") Wrapper<ShengxiancangkuEntity> wrapper);

	List<ShengxiancangkuView> selectListView(Pagination page,@Param("ew") Wrapper<ShengxiancangkuEntity> wrapper);
	
	ShengxiancangkuView selectView(@Param("ew") Wrapper<ShengxiancangkuEntity> wrapper);
	

}
