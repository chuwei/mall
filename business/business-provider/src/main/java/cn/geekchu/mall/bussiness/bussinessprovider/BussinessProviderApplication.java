package cn.geekchu.mall.bussiness.bussinessprovider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"cn.geekchu.mall.bussiness.bussinessprovider"})
@MapperScan("cn.geekchu.mall.bussiness.bussinessprovider.mapper")
public class BussinessProviderApplication {

    public static void main(String[] args) {
            SpringApplication.run(BussinessProviderApplication.class, args);
        }

}


