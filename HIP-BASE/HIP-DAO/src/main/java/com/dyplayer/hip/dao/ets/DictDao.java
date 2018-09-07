package com.dyplayer.hip.dao.ets;

import com.dyplayer.hip.rim.type.ets.Dict;

public interface DictDao {

    int deleteByPrimaryKey(Long id);

    int insert(Dict record);

    int insertSelective(Dict record);

    Dict selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Dict record);

    int updateByPrimaryKey(Dict record);
}
