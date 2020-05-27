package cn.geekchu.mall.usercenter.usercenterprovider.controller;

import cn.geekchu.mall.bussiness.businessapi.api.OrderApi;
import cn.geekchu.mall.bussiness.businessapi.vo.OrderVo;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Reference(check =false)
    private OrderApi orderApi;


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
