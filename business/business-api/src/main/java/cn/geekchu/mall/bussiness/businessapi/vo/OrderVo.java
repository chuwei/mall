package cn.geekchu.mall.bussiness.businessapi.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class OrderVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**订单ID*/
    private String orderId;

    /**订单编号*/
    private String orderNo;

    /**订单金额*/
    private BigDecimal orderPrice;

    /**下单时间*/
    private Date orderTime;
}