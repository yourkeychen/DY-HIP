package com.dyplayer.hip.dao.ets;

import com.dyplayer.hip.rim.type.ets.DictElement;

public interface DictElementMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DictElement record);

    int insertSelective(DictElement record);

    DictElement selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DictElement record);

    int updateByPrimaryKey(DictElement record);
}