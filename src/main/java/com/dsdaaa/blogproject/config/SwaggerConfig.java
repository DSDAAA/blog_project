package com.dsdaaa.blogproject.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/***
 * 创建Swagger配置
 * @since:blogproject
 * @author DSDAAA
 * 2023/10/7
 */
@Configuration
public class SwaggerConfig {
    /**
     * 根据@Tag 上的排序，写入x-order
     *
     * @return the global open api customizer
     */
    @Bean
    public GroupedOpenApi adminApi() {      // 创建了一个api接口的分组
        return GroupedOpenApi.builder()
                .group("admin-api")         // 分组名称
                .pathsToMatch("/**")  // 接口请求路径规则
                .build();
    }

    @Bean
    public OpenAPI customOpenAPI() {

        return new OpenAPI()
                .info(new Info()
                        .title("微博客API接口文档")
                        .version("1.0")
                        .description("微博客API接口文档")
                        .contact(new Contact().name("DunSton"))); // 设定作者
    }


}
