package com.xiaohei.mapper;

import com.xiaohei.model.Hy;
import com.xiaohei.model.HyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HyMapper {
    long countByExample(HyExample example);

    int deleteByExample(HyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Hy record);

    int insertSelective(Hy record);

    List<Hy> selectByExample(HyExample example);

    Hy selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Hy record, @Param("example") HyExample example);

    int updateByExample(@Param("record") Hy record, @Param("example") HyExample example);

    int updateByPrimaryKeySelective(Hy record);

    int updateByPrimaryKey(Hy record);
}