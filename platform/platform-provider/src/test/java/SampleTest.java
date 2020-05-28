

import cn.geekchu.mall.platform.platformprovider.PlatformProviderApplication;
import cn.geekchu.mall.platform.platformprovider.entity.Product;
import cn.geekchu.mall.platform.platformprovider.mapper.ProductMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = PlatformProviderApplication.class)
public class SampleTest {

    @Autowired
    private ProductMapper productMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<Product> orderList = productMapper.selectList(null);
        Assert.assertEquals(1, orderList.size());
        orderList.forEach(System.out::println);
    }

}