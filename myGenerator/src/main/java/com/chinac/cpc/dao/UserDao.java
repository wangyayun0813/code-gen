package com.chinac.cpc.dao;

import com.chinac.cpc.model.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

/**
 * 文件名：
 * 描述：
 * 创建人： wangyayun
 * 创建时间： 2016/8/30.
 * 修改人：
 */
@Component
public interface UserDao
{
    @Select("select * from cpc_user where id=#{id}")
    @Results({@Result(column = "user_name", property = "name")})
    User selectById(@Param("id") Long id);
}
