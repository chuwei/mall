package cn.geekchu.mall.business.service;

import cn.geekchu.mall.business.entity.OrderDetail;
import cn.geekchu.mall.business.mapper.OrderDetailMapper;
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
