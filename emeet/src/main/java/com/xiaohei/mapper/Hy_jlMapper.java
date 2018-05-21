package com.xiaohei.mapper;

import com.xiaohei.model.Hy_jl;
import com.xiaohei.model.Hy_jlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Hy_jlMapper {
    long countByExample(Hy_jlExample example);

    int deleteByExample(Hy_jlExample example);

    int deleteByPrimaryKey(@Param("id") Long id, @Param("jlId") Integer jlId);

    int insert(Hy_jl record);

    int insertSelective(Hy_jl record);

    List<Hy_jl> selectByExampleWithBLOBs(Hy_jlExample example);

    List<Hy_jl> selectByExample(Hy_jlExample example);

    Hy_jl selectByPrimaryKey(@Param("id") Long id, @Param("jlId") Integer jlId);

    int updateByExampleSelective(@Param("record") Hy_jl record, @Param("example") Hy_jlExample example);

    int updateByExampleWithBLOBs(@Param("record") Hy_jl record, @Param("example") Hy_jlExample example);

    int updateByExample(@Param("record") Hy_jl record, @Param("example") Hy_jlExample example);

    int updateByPrimaryKeySelective(Hy_jl record);

    int updateByPrimaryKeyWithBLOBs(Hy_jl record);

    int updateByPrimaryKey(Hy_jl record);
}