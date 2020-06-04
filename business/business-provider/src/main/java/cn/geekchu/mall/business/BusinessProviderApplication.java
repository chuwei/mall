package cn.geekchu.mall.business;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"cn.geekchu.mall.business"})
@MapperScan("cn.geekchu.mall.business.mapper")
public class BusinessProviderApplication {

    public static void main(String[] args) {
            SpringApplication.run(BusinessProviderApplication.class, args);
        }

}


