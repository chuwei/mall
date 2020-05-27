package cn.geekchu.mall.platform.platformprovider.service;

import cn.geekchu.mall.platform.platformprovider.entity.Product;
import org.apache.dubbo.config.annotation.Service;

@Service
public class ProductService {

    public Product getById(String productId){
        Product product = new Product();
        return product;
    };
}
