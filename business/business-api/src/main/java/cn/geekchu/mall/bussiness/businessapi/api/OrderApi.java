package cn.geekchu.mall.bussiness.businessapi.api;

import cn.geekchu.mall.bussiness.businessapi.vo.OrderVo;

import java.util.List;

public interface OrderApi {

    /**
     * 通过用户ID，查询用户订单信息
     * @param userId
     * @return
     */
    List<OrderVo> queryOrderByUserId(String userId);
}