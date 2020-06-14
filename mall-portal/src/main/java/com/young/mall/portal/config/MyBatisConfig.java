package com.young.mall.portal.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置
 *
 * @author jonesleborn
 * @since topic v1.0
 */
@Configuration
@MapperScan("com.young.mall.portal.mbg.mapper")
public class MyBatisConfig {
}
