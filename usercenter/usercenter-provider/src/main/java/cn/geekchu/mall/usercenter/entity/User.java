package cn.geekchu.mall.usercenter.entity;

import com.baomidou.mybatisplus.annotation.TableName;

@TableName(value = "t_user")
public class User {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 用户中文名
     */
    private String userName;
}
