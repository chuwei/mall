package cn.geekchu.mall.bussiness.bussinessprovider.controller;

import cn.geekchu.mall.bussiness.bussinessprovider.entity.Order;
import cn.geekchu.mall.bussiness.bussinessprovider.entity.OrderDetail;
import cn.geekchu.mall.bussiness.bussinessprovider.service.OrderDetailService;
import cn.geekchu.mall.bussiness.bussinessprovider.service.OrderService;
import cn.geekchu.mall.platform.platformapi.api.ProductApi;
import cn.geekchu.mall.platform.platformapi.vo.ProductVo;
import cn.geekchu.mall.usercenter.usercenterapi.api.UserApi;
import cn.geekchu.mall.usercenter.usercenterapi.vo.UserVo;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.UUID;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private OrderDetailService orderDetailService;

    @Reference(check =false)
    private ProductApi productApi;

    @Reference(check =false)
    private UserApi userApi;

    /**
     * 新增
     */
//    @JwtIgnore
    @RequestMapping(value = "/add")
    public boolean add(String productId,String userId){
//        LocalAssert.isStringEmpty(productId,"产品Id不能为空");
//        LocalAssert.isStringEmpty(userId,"用户Id不能为空");
        ProductVo productVo = productApi.queryProductInfoById(productId);
//        LocalAssert.isObjectEmpty(productVo,"未查询到产品信息");
        UserVo userVo = userApi.findUserById(userId);
//        LocalAssert.isObjectEmpty(userVo,"未查询到用户信息");
        Order order = new Order();
        order.setOrderId(UUID.randomUUID().toString());
        order.setOrderNo(System.currentTimeMillis() + "");
        order.setOrderPrice(productVo.getProductPrice());
        order.setUserId(userId);
        order.setOrderTime(new Date());
        orderService.save(order);

        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setOrderDetailId(UUID.randomUUID().toString());
        orderDetail.setOrderId(order.getOrderId());
        orderDetail.setProductId(productId);
        orderDetail.setSort(1);
        orderDetailService.save(orderDetail);
        return true;
    }
}