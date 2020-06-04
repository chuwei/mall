package cn.geekchu.mall.platform.entity;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@TableName(value = "t_product")
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    /**商品ID*/
    private String productId;

    /**商品名称*/
    private String productName;

    /**商品价格*/
    private BigDecimal productPrice;
}