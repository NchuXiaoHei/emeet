package com.xiaohei.mapper;

import com.xiaohei.model.Tp;
import com.xiaohei.model.TpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TpMapper {
    long countByExample(TpExample example);

    int deleteByExample(TpExample example);

    int deleteByPrimaryKey(@Param("id") Long id, @Param("tpId") Integer tpId);

    int insert(Tp record);

    int insertSelective(Tp record);

    List<Tp> selectByExample(TpExample example);

    Tp selectByPrimaryKey(@Param("id") Long id, @Param("tpId") Integer tpId);

    int updateByExampleSelective(@Param("record") Tp record, @Param("example") TpExample example);

    int updateByExample(@Param("record") Tp record, @Param("example") TpExample example);

    int updateByPrimaryKeySelective(Tp record);

    int updateByPrimaryKey(Tp record);
}