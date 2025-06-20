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


import com.dao.DiscussshengxianchanpinDao;
import com.entity.DiscussshengxianchanpinEntity;
import com.service.DiscussshengxianchanpinService;
import com.entity.vo.DiscussshengxianchanpinVO;
import com.entity.view.DiscussshengxianchanpinView;

@Service("discussshengxianchanpinService")
public class DiscussshengxianchanpinServiceImpl extends ServiceImpl<DiscussshengxianchanpinDao, DiscussshengxianchanpinEntity> implements DiscussshengxianchanpinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussshengxianchanpinEntity> page = this.selectPage(
                new Query<DiscussshengxianchanpinEntity>(params).getPage(),
                new EntityWrapper<DiscussshengxianchanpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussshengxianchanpinEntity> wrapper) {
		  Page<DiscussshengxianchanpinView> page =new Query<DiscussshengxianchanpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussshengxianchanpinVO> selectListVO(Wrapper<DiscussshengxianchanpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussshengxianchanpinVO selectVO(Wrapper<DiscussshengxianchanpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussshengxianchanpinView> selectListView(Wrapper<DiscussshengxianchanpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussshengxianchanpinView selectView(Wrapper<DiscussshengxianchanpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
