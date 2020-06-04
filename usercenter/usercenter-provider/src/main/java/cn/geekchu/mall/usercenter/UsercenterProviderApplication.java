package cn.geekchu.mall.usercenter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"cn.geekchu.mall.usercenter"})
@MapperScan("cn.geekchu.mall.usercenter.mapper")
public class UsercenterProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(UsercenterProviderApplication.class, args);
    }

}
