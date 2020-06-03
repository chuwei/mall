package cn.geekchu.mall.bussiness.bussinessprovider.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "t_order_detail")
public class OrderDetail {
    private static final long serialVersionUID = 1L;

    /**订单详情ID*/
    private String orderDetailId;

    /**订单ID*/
    private String orderId;

    /**产品ID*/
    private String productId;

    /**排序*/
    private int sort;
}
