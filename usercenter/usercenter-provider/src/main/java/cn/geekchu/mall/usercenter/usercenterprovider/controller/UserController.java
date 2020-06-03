package cn.geekchu.mall.usercenter.usercenterprovider.controller;

import cn.geekchu.mall.bussiness.businessapi.api.OrderApi;
import cn.geekchu.mall.bussiness.businessapi.vo.OrderVo;
import cn.geekchu.mall.usercenter.usercenterprovider.service.impl.UserServiceImpl;
import io.swagger.annotations.Api;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users/user")
@Api
public class UserController {

    @Reference(check =false)
    private OrderApi orderApi;

    @Autowired
    private UserServiceImpl userService;
    /**
     * 查询当前用户信息
     * @param
     * @return
     */

//    @GetMapping("/info")
//    @ApiOperation(value = "用户信息")
//    public CommonResult<UserVo> info() {
//        UserBO userResult = userService.getUser(UserSecurityContextHolder.getContext().getUserId());
//        return success(UserConvert.INSTANCE.convert2(userResult));
//    }

    /**
     * 通过用户ID，查询订单信息
     * @param userId
     * @return
     */
    @RequestMapping("/list")
    public List<OrderVo> queryOrderByUserId(String userId){
        return orderApi.queryOrderByUserId(userId);
    }
}
