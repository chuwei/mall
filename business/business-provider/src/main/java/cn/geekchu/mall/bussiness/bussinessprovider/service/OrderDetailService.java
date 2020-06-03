package cn.geekchu.mall.bussiness.bussinessprovider.service;

import cn.geekchu.mall.bussiness.bussinessprovider.entity.OrderDetail;
import cn.geekchu.mall.bussiness.bussinessprovider.mapper.OrderDetailMapper;
import cn.geekchu.mall.bussiness.bussinessprovider.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailService {
    @Autowired
    OrderDetailMapper orderDetailMapper;

    public void save(OrderDetail orderDetail){
        orderDetailMapper.insert(orderDetail);
    }
}
