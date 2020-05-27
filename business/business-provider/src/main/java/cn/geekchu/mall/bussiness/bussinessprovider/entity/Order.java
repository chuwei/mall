package cn.geekchu.mall.bussiness.bussinessprovider.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@TableName(value = "t_order")
public class Order {
    private static final long serialVersionUID = 1L;

    /**订单ID*/
    private String orderId;

    /**订单编号*/
    private String orderNo;

    /**用户id*/
    private String userId;

    /**订单金额*/
    private BigDecimal orderPrice;

    /**下单时间*/
    private Date orderTime;
}
