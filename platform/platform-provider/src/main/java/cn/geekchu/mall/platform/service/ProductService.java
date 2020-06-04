package cn.geekchu.mall.platform.service;

import cn.geekchu.mall.platform.entity.Product;
import org.springframework.stereotype.Service;


@Service
public class ProductService {

    public Product getById(String productId){
        Product product = new Product();
        return product;
    };
}
