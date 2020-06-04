package cn.geekchu.mall.usercenter.api;

import cn.geekchu.mall.usercenter.vo.UserVo;

public interface UserApi {

    /**
     * 查询用户信息
     * @param userId
     * @return
     */
    UserVo findUserById(String userId);
}
