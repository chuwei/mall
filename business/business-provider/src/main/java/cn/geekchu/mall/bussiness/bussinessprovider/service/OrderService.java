package cn.geekchu.mall.bussiness.bussinessprovider.service;

import cn.geekchu.mall.bussiness.bussinessprovider.entity.Order;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {
    public List<Order> list(QueryWrapper<Order> orderQueryWrapper){
        List<Order> list = new ArrayList();
        return list;
    }

    public void save(Order order){

    }
}
