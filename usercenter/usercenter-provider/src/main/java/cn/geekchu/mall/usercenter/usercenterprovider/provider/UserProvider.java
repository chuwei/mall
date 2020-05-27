package cn.geekchu.mall.usercenter.usercenterprovider.provider;

import cn.geekchu.mall.usercenter.usercenterprovider.entity.User;
import cn.geekchu.mall.usercenter.usercenterprovider.service.UserService;
import cn.geekchu.mall.usercenter.usercenterapi.api.UserApi;
import cn.geekchu.mall.usercenter.usercenterapi.vo.UserVo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Service(interfaceClass =UserApi.class)
@Component
public class UserProvider implements UserApi {

    @Autowired
    private UserService userService;

    @Override
    public UserVo findUserById(String userId) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<User>();
        queryWrapper.eq("user_id",userId);
        User source = userService.getOne(queryWrapper);
        if(source != null){
            UserVo vo = new UserVo();
            BeanUtils.copyProperties(source,vo);
            return vo;
        }
        return null;
    }
}