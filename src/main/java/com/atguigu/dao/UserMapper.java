package com.atguigu.dao;

import com.atguigu.domain.User;
import java.util.List;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface UserMapper {
    @Delete({
        "delete from t_user",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into t_user (id, loginacct, ",
        "userpswd, username, ",
        "email, createtime)",
        "values (#{id,jdbcType=INTEGER}, #{loginacct,jdbcType=VARCHAR}, ",
        "#{userpswd,jdbcType=CHAR}, #{username,jdbcType=VARCHAR}, ",
        "#{email,jdbcType=VARCHAR}, #{createtime,jdbcType=CHAR})"
    })
    int insert(User record);

    @Select({
        "select",
        "id, loginacct, userpswd, username, email, createtime",
        "from t_user",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ConstructorArgs({
        @Arg(column="id", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="loginacct", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="userpswd", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="username", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="email", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="createtime", javaType=String.class, jdbcType=JdbcType.CHAR)
    })
    User selectByPrimaryKey(Integer id);

    @Select({
        "select",
        "id, loginacct, userpswd, username, email, createtime",
        "from t_user"
    })
    @ConstructorArgs({
        @Arg(column="id", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="loginacct", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="userpswd", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="username", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="email", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="createtime", javaType=String.class, jdbcType=JdbcType.CHAR)
    })
    List<User> selectAll();

    @Update({
        "update t_user",
        "set loginacct = #{loginacct,jdbcType=VARCHAR},",
          "userpswd = #{userpswd,jdbcType=CHAR},",
          "username = #{username,jdbcType=VARCHAR},",
          "email = #{email,jdbcType=VARCHAR},",
          "createtime = #{createtime,jdbcType=CHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(User record);
}