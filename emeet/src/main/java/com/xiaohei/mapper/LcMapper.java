package com.xiaohei.mapper;

import com.xiaohei.model.Lc;
import com.xiaohei.model.LcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LcMapper {
    long countByExample(LcExample example);

    int deleteByExample(LcExample example);

    int deleteByPrimaryKey(@Param("num") Integer num, @Param("id") Long id);

    int insert(Lc record);

    int insertSelective(Lc record);

    List<Lc> selectByExampleWithBLOBs(LcExample example);

    List<Lc> selectByExample(LcExample example);

    Lc selectByPrimaryKey(@Param("num") Integer num, @Param("id") Long id);

    int updateByExampleSelective(@Param("record") Lc record, @Param("example") LcExample example);

    int updateByExampleWithBLOBs(@Param("record") Lc record, @Param("example") LcExample example);

    int updateByExample(@Param("record") Lc record, @Param("example") LcExample example);

    int updateByPrimaryKeySelective(Lc record);

    int updateByPrimaryKeyWithBLOBs(Lc record);

    int updateByPrimaryKey(Lc record);
}