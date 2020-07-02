package com.winterchen;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
 * 
     * @ClassName: Springboot2MybatisDemoApplication
     * @Description: TODO(这里用一句话描述这个类的作用)
     * @author hemin
     * @date 2020年7月2日
     *
 */
@SpringBootApplication
@MapperScan("com.winterchen.dao")
public class Springboot2MybatisDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot2MybatisDemoApplication.class, args);
	}
}
