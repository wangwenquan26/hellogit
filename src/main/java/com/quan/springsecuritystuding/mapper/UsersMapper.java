package com.quan.springsecuritystuding.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.quan.springsecuritystuding.eneity.Users;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UsersMapper extends BaseMapper<Users> {
}
