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


import com.dao.ShengxianchanpinDao;
import com.entity.ShengxianchanpinEntity;
import com.service.ShengxianchanpinService;
import com.entity.vo.ShengxianchanpinVO;
import com.entity.view.ShengxianchanpinView;

@Service("shengxianchanpinService")
public class ShengxianchanpinServiceImpl extends ServiceImpl<ShengxianchanpinDao, ShengxianchanpinEntity> implements ShengxianchanpinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShengxianchanpinEntity> page = this.selectPage(
                new Query<ShengxianchanpinEntity>(params).getPage(),
                new EntityWrapper<ShengxianchanpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShengxianchanpinEntity> wrapper) {
		  Page<ShengxianchanpinView> page =new Query<ShengxianchanpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShengxianchanpinVO> selectListVO(Wrapper<ShengxianchanpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShengxianchanpinVO selectVO(Wrapper<ShengxianchanpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShengxianchanpinView> selectListView(Wrapper<ShengxianchanpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShengxianchanpinView selectView(Wrapper<ShengxianchanpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
