package cn.geekchu.mall.platform;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"cn.geekchu.mall.platform"})
@MapperScan("cn.geekchu.mall.platform.mapper")
public class PlatformProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlatformProviderApplication.class, args);
    }

}
