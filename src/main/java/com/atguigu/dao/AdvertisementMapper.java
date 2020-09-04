package com.atguigu.dao;

import com.atguigu.domain.Advertisement;
import java.util.List;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface AdvertisementMapper {
    @Delete({
        "delete from t_advertisement",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into t_advertisement (id, name, ",
        "iconpath, status, url, ",
        "userid)",
        "values (#{id,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, ",
        "#{iconpath,jdbcType=VARCHAR}, #{status,jdbcType=CHAR}, #{url,jdbcType=VARCHAR}, ",
        "#{userid,jdbcType=INTEGER})"
    })
    int insert(Advertisement record);

    @Select({
        "select",
        "id, name, iconpath, status, url, userid",
        "from t_advertisement",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ConstructorArgs({
        @Arg(column="id", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="iconpath", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="status", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="url", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="userid", javaType=Integer.class, jdbcType=JdbcType.INTEGER)
    })
    Advertisement selectByPrimaryKey(Integer id);

    @Select({
        "select",
        "id, name, iconpath, status, url, userid",
        "from t_advertisement"
    })
    @ConstructorArgs({
        @Arg(column="id", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="iconpath", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="status", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="url", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="userid", javaType=Integer.class, jdbcType=JdbcType.INTEGER)
    })
    List<Advertisement> selectAll();

    @Update({
        "update t_advertisement",
        "set name = #{name,jdbcType=VARCHAR},",
          "iconpath = #{iconpath,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=CHAR},",
          "url = #{url,jdbcType=VARCHAR},",
          "userid = #{userid,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Advertisement record);
}