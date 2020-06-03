package cn.geekchu.mall.platform.platformprovider.provider;

import cn.geekchu.mall.platform.platformapi.api.ProductApi;
import cn.geekchu.mall.platform.platformprovider.entity.Product;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import cn.geekchu.mall.platform.platformprovider.service.ProductService;
import cn.geekchu.mall.platform.platformapi.vo.ProductVo;

@Service(interfaceClass = ProductApi.class,version = "1.0.0")
@Component
public class ProductProvider implements ProductApi {

    @Autowired
    private ProductService productService;

    @Override
    public ProductVo queryProductInfoById(String productId) {
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