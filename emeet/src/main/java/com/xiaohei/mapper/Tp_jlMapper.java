package com.xiaohei.mapper;

import com.xiaohei.model.Tp_jl;
import com.xiaohei.model.Tp_jlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tp_jlMapper {
    long countByExample(Tp_jlExample example);

    int deleteByExample(Tp_jlExample example);

    int deleteByPrimaryKey(@Param("tpId") Integer tpId, @Param("userId") Long userId);

    int insert(Tp_jl record);

    int insertSelective(Tp_jl record);

    List<Tp_jl> selectByExampleWithBLOBs(Tp_jlExample example);

    List<Tp_jl> selectByExample(Tp_jlExample example);

    Tp_jl selectByPrimaryKey(@Param("tpId") Integer tpId, @Param("userId") Long userId);

    int updateByExampleSelective(@Param("record") Tp_jl record, @Param("example") Tp_jlExample example);

    int updateByExampleWithBLOBs(@Param("record") Tp_jl record, @Param("example") Tp_jlExample example);

    int updateByExample(@Param("record") Tp_jl record, @Param("example") Tp_jlExample example);

    int updateByPrimaryKeySelective(Tp_jl record);

    int updateByPrimaryKeyWithBLOBs(Tp_jl record);
}