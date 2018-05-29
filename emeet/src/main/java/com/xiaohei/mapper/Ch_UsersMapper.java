package com.xiaohei.mapper;

import com.xiaohei.model.Ch_Users;
import com.xiaohei.model.Ch_UsersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Ch_UsersMapper {
    long countByExample(Ch_UsersExample example);

    int deleteByExample(Ch_UsersExample example);

    int deleteByPrimaryKey(@Param("userId") Long userId, @Param("id") Long id);

    int insert(Ch_Users record);

    int insertSelective(Ch_Users record);

    List<Ch_Users> selectByExampleWithBLOBs(Ch_UsersExample example);

    List<Ch_Users> selectByExample(Ch_UsersExample example);

    Ch_Users selectByPrimaryKey(@Param("userId") Long userId, @Param("id") Long id);

    int updateByExampleSelective(@Param("record") Ch_Users record, @Param("example") Ch_UsersExample example);

    int updateByExampleWithBLOBs(@Param("record") Ch_Users record, @Param("example") Ch_UsersExample example);

    int updateByExample(@Param("record") Ch_Users record, @Param("example") Ch_UsersExample example);

    int updateByPrimaryKeySelective(Ch_Users record);

    int updateByPrimaryKeyWithBLOBs(Ch_Users record);

    int updateByPrimaryKey(Ch_Users record);
}