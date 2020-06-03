package cn.geekchu.mall.bussiness.bussinessprovider.service;

import cn.geekchu.mall.bussiness.bussinessprovider.entity.Order;
import cn.geekchu.mall.bussiness.bussinessprovider.mapper.OrderMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    OrderMapper orderMapper;

    public List<Order> list(QueryWrapper<Order> orderQueryWrapper){
        List<Order> list = new ArrayList();
        return list;
    }

    public void save(Order order){
        orderMapper.insert(order);

    }
}
