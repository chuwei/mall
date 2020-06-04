package cn.geekchu.mall.platform.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ProductVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**商品ID*/
    private String productId;

    /**商品名称*/
    private String productName;

    /**商品价格*/
    private BigDecimal productPrice;
}