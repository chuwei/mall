package cn.geekchu.mall.usercenter.usercenterapi.api;

import cn.geekchu.mall.usercenter.usercenterapi.vo.UserVo;

public interface UserApi {

    /**
     * 查询用户信息
     * @param userId
     * @return
     */
    UserVo findUserById(String userId);
}
