package cn.geekchu.mall.usercenter.usercenterprovider.service.impl;

import cn.geekchu.mall.usercenter.usercenterprovider.entity.User;
import cn.geekchu.mall.usercenter.usercenterprovider.mapper.UserMapper;
import cn.geekchu.mall.usercenter.usercenterprovider.service.UserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public User getUserbyid(String userid){
        QueryWrapper<User> queryWrapper = new QueryWrapper<User>();
        queryWrapper.eq("user_id",userid);
        User user = userMapper.selectOne(queryWrapper);
        return  user;
    }
}
