package cn.geekchu.mall.usercenter.usercenterprovider.service;

import cn.geekchu.mall.usercenter.usercenterprovider.entity.User;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public User getOne(QueryWrapper<User> userQueryWrapper){
        User user = new User();
        return  user;
    }
}
