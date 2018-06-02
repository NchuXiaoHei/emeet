package com.xiaohei.mapper;

import com.xiaohei.model.Zl;
import com.xiaohei.model.ZlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZlMapper {
    long countByExample(ZlExample example);

    int deleteByExample(ZlExample example);

    int deleteByPrimaryKey(@Param("zlId") String zlId, @Param("id") Long id);

    int insert(Zl record);

    int insertSelective(Zl record);

    List<Zl> selectByExampleWithBLOBs(ZlExample example);

    List<Zl> selectByExample(ZlExample example);

    Zl selectByPrimaryKey(@Param("zlId") String zlId, @Param("id") Long id);

    int updateByExampleSelective(@Param("record") Zl record, @Param("example") ZlExample example);

    int updateByExampleWithBLOBs(@Param("record") Zl record, @Param("example") ZlExample example);

    int updateByExample(@Param("record") Zl record, @Param("example") ZlExample example);

    int updateByPrimaryKeySelective(Zl record);

    int updateByPrimaryKeyWithBLOBs(Zl record);

    int updateByPrimaryKey(Zl record);
}