package cn.geekchu.mall.bussiness.bussinessprovider.provider;

import cn.geekchu.mall.bussiness.businessapi.api.OrderApi;
import cn.geekchu.mall.bussiness.businessapi.vo.OrderVo;
import cn.geekchu.mall.bussiness.bussinessprovider.entity.Order;
import cn.geekchu.mall.bussiness.bussinessprovider.service.OrderService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Service(interfaceClass = OrderApi.class)
@Component
public class OrderProvider implements OrderApi {

    @Autowired
    private OrderService orderService;

    @Override
    public List<OrderVo> queryOrderByUserId(String userId) {
        QueryWrapper<Order> queryWrapper = new QueryWrapper<Order>();
        queryWrapper.eq("user_id",userId);
        List<Order> sourceList = orderService.list(queryWrapper);
        if(!CollectionUtils.isEmpty(sourceList)){
            List<OrderVo> voList = new ArrayList<>();
            for (Order order : sourceList) {
                OrderVo vo = new OrderVo();
                BeanUtils.copyProperties(order, vo);
                voList.add(vo);
            }
            return voList;
        }
        return null;
    }
}