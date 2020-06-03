package cn.geekchu.mall.usercenter.usercenterprovider.provider;

import cn.geekchu.mall.usercenter.usercenterprovider.entity.User;
import cn.geekchu.mall.usercenter.usercenterapi.api.UserApi;
import cn.geekchu.mall.usercenter.usercenterapi.vo.UserVo;
import cn.geekchu.mall.usercenter.usercenterprovider.service.impl.UserServiceImpl;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Service(interfaceClass =UserApi.class,version = "1.0.0")
@Component
public class UserProvider implements UserApi {

    @Autowired
    private UserServiceImpl userService;

    @Override
    public UserVo findUserById(String userId) {
        User source = userService.getUserbyid(userId);
        if(source != null){
            UserVo vo = new UserVo();
            BeanUtils.copyProperties(source,vo);
            return vo;
        }
        return null;
    }
}