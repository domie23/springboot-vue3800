package com.dao;

import com.entity.CaigoudandengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CaigoudandengjiVO;
import com.entity.view.CaigoudandengjiView;


/**
 * 采购单登记
 * 
 * @author 
 * @email 
 * @date 2022-05-07 23:12:14
 */
public interface CaigoudandengjiDao extends BaseMapper<CaigoudandengjiEntity> {
	
	List<CaigoudandengjiVO> selectListVO(@Param("ew") Wrapper<CaigoudandengjiEntity> wrapper);
	
	CaigoudandengjiVO selectVO(@Param("ew") Wrapper<CaigoudandengjiEntity> wrapper);
	
	List<CaigoudandengjiView> selectListView(@Param("ew") Wrapper<CaigoudandengjiEntity> wrapper);

	List<CaigoudandengjiView> selectListView(Pagination page,@Param("ew") Wrapper<CaigoudandengjiEntity> wrapper);
	
	CaigoudandengjiView selectView(@Param("ew") Wrapper<CaigoudandengjiEntity> wrapper);
	

}
