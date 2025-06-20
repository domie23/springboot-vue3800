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


import com.dao.ShengxiancangkuDao;
import com.entity.ShengxiancangkuEntity;
import com.service.ShengxiancangkuService;
import com.entity.vo.ShengxiancangkuVO;
import com.entity.view.ShengxiancangkuView;

@Service("shengxiancangkuService")
public class ShengxiancangkuServiceImpl extends ServiceImpl<ShengxiancangkuDao, ShengxiancangkuEntity> implements ShengxiancangkuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShengxiancangkuEntity> page = this.selectPage(
                new Query<ShengxiancangkuEntity>(params).getPage(),
                new EntityWrapper<ShengxiancangkuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShengxiancangkuEntity> wrapper) {
		  Page<ShengxiancangkuView> page =new Query<ShengxiancangkuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShengxiancangkuVO> selectListVO(Wrapper<ShengxiancangkuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShengxiancangkuVO selectVO(Wrapper<ShengxiancangkuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShengxiancangkuView> selectListView(Wrapper<ShengxiancangkuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShengxiancangkuView selectView(Wrapper<ShengxiancangkuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
