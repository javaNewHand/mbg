package com.atguigu.dao;

import com.atguigu.domain.ProcessDefine;
import java.util.List;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface ProcessDefineMapper {
    @Delete({
        "delete from act_re_procdef",
        "where ID_ = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into act_re_procdef (ID_, REV_, ",
        "CATEGORY_, NAME_, ",
        "KEY_, VERSION_, DEPLOYMENT_ID_, ",
        "RESOURCE_NAME_, DGRM_RESOURCE_NAME_, ",
        "DESCRIPTION_, HAS_START_FORM_KEY_, ",
        "SUSPENSION_STATE_, TENANT_ID_)",
        "values (#{id,jdbcType=VARCHAR}, #{rev,jdbcType=INTEGER}, ",
        "#{category,jdbcType=VARCHAR}, #{name,jdbcType=VARCHAR}, ",
        "#{key,jdbcType=VARCHAR}, #{version,jdbcType=INTEGER}, #{deploymentId,jdbcType=VARCHAR}, ",
        "#{resourceName,jdbcType=VARCHAR}, #{dgrmResourceName,jdbcType=VARCHAR}, ",
        "#{description,jdbcType=VARCHAR}, #{hasStartFormKey,jdbcType=TINYINT}, ",
        "#{suspensionState,jdbcType=INTEGER}, #{tenantId,jdbcType=VARCHAR})"
    })
    int insert(ProcessDefine record);

    @Select({
        "select",
        "ID_, REV_, CATEGORY_, NAME_, KEY_, VERSION_, DEPLOYMENT_ID_, RESOURCE_NAME_, ",
        "DGRM_RESOURCE_NAME_, DESCRIPTION_, HAS_START_FORM_KEY_, SUSPENSION_STATE_, TENANT_ID_",
        "from act_re_procdef",
        "where ID_ = #{id,jdbcType=VARCHAR}"
    })
    @ConstructorArgs({
        @Arg(column="ID_", javaType=String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="REV_", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="CATEGORY_", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="NAME_", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="KEY_", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="VERSION_", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="DEPLOYMENT_ID_", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="RESOURCE_NAME_", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="DGRM_RESOURCE_NAME_", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="DESCRIPTION_", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="HAS_START_FORM_KEY_", javaType=Byte.class, jdbcType=JdbcType.TINYINT),
        @Arg(column="SUSPENSION_STATE_", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="TENANT_ID_", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    ProcessDefine selectByPrimaryKey(String id);

    @Select({
        "select",
        "ID_, REV_, CATEGORY_, NAME_, KEY_, VERSION_, DEPLOYMENT_ID_, RESOURCE_NAME_, ",
        "DGRM_RESOURCE_NAME_, DESCRIPTION_, HAS_START_FORM_KEY_, SUSPENSION_STATE_, TENANT_ID_",
        "from act_re_procdef"
    })
    @ConstructorArgs({
        @Arg(column="ID_", javaType=String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="REV_", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="CATEGORY_", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="NAME_", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="KEY_", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="VERSION_", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="DEPLOYMENT_ID_", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="RESOURCE_NAME_", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="DGRM_RESOURCE_NAME_", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="DESCRIPTION_", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="HAS_START_FORM_KEY_", javaType=Byte.class, jdbcType=JdbcType.TINYINT),
        @Arg(column="SUSPENSION_STATE_", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="TENANT_ID_", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<ProcessDefine> selectAll();

    @Update({
        "update act_re_procdef",
        "set REV_ = #{rev,jdbcType=INTEGER},",
          "CATEGORY_ = #{category,jdbcType=VARCHAR},",
          "NAME_ = #{name,jdbcType=VARCHAR},",
          "KEY_ = #{key,jdbcType=VARCHAR},",
          "VERSION_ = #{version,jdbcType=INTEGER},",
          "DEPLOYMENT_ID_ = #{deploymentId,jdbcType=VARCHAR},",
          "RESOURCE_NAME_ = #{resourceName,jdbcType=VARCHAR},",
          "DGRM_RESOURCE_NAME_ = #{dgrmResourceName,jdbcType=VARCHAR},",
          "DESCRIPTION_ = #{description,jdbcType=VARCHAR},",
          "HAS_START_FORM_KEY_ = #{hasStartFormKey,jdbcType=TINYINT},",
          "SUSPENSION_STATE_ = #{suspensionState,jdbcType=INTEGER},",
          "TENANT_ID_ = #{tenantId,jdbcType=VARCHAR}",
        "where ID_ = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(ProcessDefine record);
}