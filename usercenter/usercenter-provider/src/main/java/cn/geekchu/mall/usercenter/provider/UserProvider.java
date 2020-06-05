package cn.geekchu.mall.usercenter.provider;

import cn.geekchu.mall.usercenter.entity.User;
import cn.geekchu.mall.usercenter.service.impl.UserServiceImpl;
import cn.geekchu.mall.usercenter.api.UserApi;
import cn.geekchu.mall.usercenter.vo.UserVo;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Service(interfaceClass =UserApi.class)
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