package com.xiaohei.mapper;

import com.xiaohei.model.Zbf;
import com.xiaohei.model.ZbfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZbfMapper {
    long countByExample(ZbfExample example);

    int deleteByExample(ZbfExample example);

    int deleteByPrimaryKey(String name);

    int insert(Zbf record);

    int insertSelective(Zbf record);

    List<Zbf> selectByExampleWithBLOBs(ZbfExample example);

    List<Zbf> selectByExample(ZbfExample example);

    Zbf selectByPrimaryKey(String name);

    int updateByExampleSelective(@Param("record") Zbf record, @Param("example") ZbfExample example);

    int updateByExampleWithBLOBs(@Param("record") Zbf record, @Param("example") ZbfExample example);

    int updateByExample(@Param("record") Zbf record, @Param("example") ZbfExample example);

    int updateByPrimaryKeySelective(Zbf record);

    int updateByPrimaryKeyWithBLOBs(Zbf record);

    int updateByPrimaryKey(Zbf record);
}