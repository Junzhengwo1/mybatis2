package com.kou.dao;

import com.kou.domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author dell
 */
public interface IUserDao {

    /**
     * 查询所有 注解配置
     * @return
     */

    @Select("select * from user")
    List<User> findAll();
}
