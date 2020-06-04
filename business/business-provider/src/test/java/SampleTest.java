import cn.geekchu.mall.business.BusinessProviderApplication;
import cn.geekchu.mall.business.entity.Order;
import cn.geekchu.mall.business.mapper.OrderMapper;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BusinessProviderApplication.class)
public class SampleTest {

    @Autowired
    private OrderMapper orderMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<Order> orderList = orderMapper.selectList(null);
        Assert.assertEquals(1, orderList.size());
        orderList.forEach(System.out::println);
    }

}