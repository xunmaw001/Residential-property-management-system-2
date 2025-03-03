package com.dao;

import com.entity.TousuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.TousuView;

/**
 * 投诉信息 Dao 接口
 *
 * @author 
 */
public interface TousuDao extends BaseMapper<TousuEntity> {

   List<TousuView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
