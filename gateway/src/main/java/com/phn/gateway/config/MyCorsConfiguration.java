package com.phn.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * @author PengHenan
 * @create  2020-06-28 15:07:22
 */
@Configuration
public class MyCorsConfiguration {

    /*@Bean
    public WebFilter corsFilter(){
        return (ServerWebExchange ctx, WebFilterChain chain)->{
            ServerHttpRequest request = ctx.getRequest();
            if(CorsUtils.isCorsRequest(request)){
                HttpHeaders requestHeaders = request.getHeaders();
                ServerHttpResponse response = ctx.getResponse();
                HttpMethod requestMethod = requestHeaders.getAccessControlRequestMethod();
                HttpHeaders responseHeaders = response.getHeaders();
                responseHeaders.add(HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN,requestHeaders.getOrigin());
                responseHeaders.addAll(HttpHeaders.ACCESS_CONTROL_ALLOW_HEADERS,
                        requestHeaders.getAccessControlRequestHeaders());
                if(null != requestMethod){
                    responseHeaders.add(HttpHeaders.ACCESS_CONTROL_ALLOW_METHODS,requestMethod.name());
                }
                responseHeaders.add(HttpHeaders.ACCESS_CONTROL_ALLOW_CREDENTIALS,"true");
                responseHeaders.add(HttpHeaders.ACCESS_CONTROL_EXPOSE_HEADERS,"*");
                if(request.getMethod()==HttpMethod.OPTIONS){
                    response.setStatusCode(HttpStatus.OK);
                    return Mono.empty();
                }
            }
            return chain.filter(ctx);
        };
    }*/

    @Bean
    public CorsFilter corsFilter() {
        //1.添加CORS配置信息
        CorsConfiguration config = new CorsConfiguration();
        //1) 允许的域(form 方向),不要写*，否则cookie就无法使用了
        config.addAllowedOrigin("*");
        //2) 是否发送Cookie信息
        config.setAllowCredentials(true);
        //3) 允许的请求方式
        config.addAllowedMethod("OPTIONS");
        config.addAllowedMethod("HEAD");
        config.addAllowedMethod("GET");
        config.addAllowedMethod("PUT");
        config.addAllowedMethod("POST");
        config.addAllowedMethod("DELETE");
        config.addAllowedMethod("PATCH");
        // 4）允许的头信息
        config.addAllowedHeader("*");

        //2.添加映射路径，我们拦截一切请求
        UrlBasedCorsConfigurationSource configSource = new UrlBasedCorsConfigurationSource();
        configSource.registerCorsConfiguration("/**", config);

        //3.返回新的CorsFilter.
        return new CorsFilter(configSource);
    }


}
