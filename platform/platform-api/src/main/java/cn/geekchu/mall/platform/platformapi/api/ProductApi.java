package cn.geekchu.mall.platform.platformapi.api;

import cn.geekchu.mall.platform.platformapi.vo.ProductVo;

public interface ProductApi {

    /**
     * 通过商品ID，查询商品信息
     * @param productId
     * @return
     */
    ProductVo queryProductInfoById(String productId);
}