package cn.geekchu.mall.platform.provider;

import cn.geekchu.mall.platform.api.ProductApi;
import cn.geekchu.mall.platform.entity.Product;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import cn.geekchu.mall.platform.service.ProductService;
import cn.geekchu.mall.platform.vo.ProductVo;

@Service(interfaceClass = ProductApi.class)
@Component
public class ProductProvider implements ProductApi {

    @Autowired
    private ProductService productService;

    @Override
    public ProductVo queryProductInfoById(String productId) {
        System.out.println("productProvider is working now.....");
        //通过商品ID查询信息
        Product source = productService.getById(productId);
        if(source != null){
            ProductVo vo = new ProductVo();
            BeanUtils.copyProperties(source,vo);
            return vo;
        }
        return null;
    }
}