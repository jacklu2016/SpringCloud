package com.springboot.cloud.sysadmin.organization.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.springboot.cloud.sysadmin.organization.entity.form.UserQueryForm;
import com.springboot.cloud.sysadmin.organization.entity.param.UserQueryParam;
import com.springboot.cloud.sysadmin.organization.entity.po.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserMapper extends BaseMapper<User> {


    List<User> getUserList(UserQueryParam userQueryParam);
}