package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.CaigoudandengjiDao;
import com.entity.CaigoudandengjiEntity;
import com.service.CaigoudandengjiService;
import com.entity.vo.CaigoudandengjiVO;
import com.entity.view.CaigoudandengjiView;

@Service("caigoudandengjiService")
public class CaigoudandengjiServiceImpl extends ServiceImpl<CaigoudandengjiDao, CaigoudandengjiEntity> implements CaigoudandengjiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CaigoudandengjiEntity> page = this.selectPage(
                new Query<CaigoudandengjiEntity>(params).getPage(),
                new EntityWrapper<CaigoudandengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CaigoudandengjiEntity> wrapper) {
		  Page<CaigoudandengjiView> page =new Query<CaigoudandengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CaigoudandengjiVO> selectListVO(Wrapper<CaigoudandengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CaigoudandengjiVO selectVO(Wrapper<CaigoudandengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CaigoudandengjiView> selectListView(Wrapper<CaigoudandengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CaigoudandengjiView selectView(Wrapper<CaigoudandengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
