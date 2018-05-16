package com.xiaohei.mapper;

import com.xiaohei.model.Zl;
import com.xiaohei.model.ZlExample;
import com.xiaohei.model.ZlKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZlMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zl
     *
     * @mbg.generated
     */
    long countByExample(ZlExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zl
     *
     * @mbg.generated
     */
    int deleteByExample(ZlExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zl
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(ZlKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zl
     *
     * @mbg.generated
     */
    int insert(Zl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zl
     *
     * @mbg.generated
     */
    int insertSelective(Zl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zl
     *
     * @mbg.generated
     */
    List<Zl> selectByExampleWithBLOBs(ZlExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zl
     *
     * @mbg.generated
     */
    List<Zl> selectByExample(ZlExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zl
     *
     * @mbg.generated
     */
    Zl selectByPrimaryKey(ZlKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zl
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Zl record, @Param("example") ZlExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zl
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") Zl record, @Param("example") ZlExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zl
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Zl record, @Param("example") ZlExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zl
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Zl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zl
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(Zl record);
}