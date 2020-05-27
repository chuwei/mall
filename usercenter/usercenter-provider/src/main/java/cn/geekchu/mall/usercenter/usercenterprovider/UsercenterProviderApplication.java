package cn.geekchu.mall.usercenter.usercenterprovider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"cn.geekchu.mall.usercenter.usercenterprovider"})
@MapperScan("cn.geekchu.mall.usercenter.usercenterprovider.mapper")
public class UsercenterProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(UsercenterProviderApplication.class, args);
    }

}
