package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CaigoudandengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CaigoudandengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CaigoudandengjiView;


/**
 * 采购单登记
 *
 * @author 
 * @email 
 * @date 2022-05-07 23:12:14
 */
public interface CaigoudandengjiService extends IService<CaigoudandengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CaigoudandengjiVO> selectListVO(Wrapper<CaigoudandengjiEntity> wrapper);
   	
   	CaigoudandengjiVO selectVO(@Param("ew") Wrapper<CaigoudandengjiEntity> wrapper);
   	
   	List<CaigoudandengjiView> selectListView(Wrapper<CaigoudandengjiEntity> wrapper);
   	
   	CaigoudandengjiView selectView(@Param("ew") Wrapper<CaigoudandengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CaigoudandengjiEntity> wrapper);
   	

}

