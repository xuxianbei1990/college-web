package college.framework.web.config;

import college.framework.enums.WebFilterOrderEnum;
import college.framework.web.filter.CacheRequestBodyFilter;
import jakarta.servlet.Filter;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * User: EDY
 * Date: 2024/4/24
 * Time: 17:07
 * Version:V1.0
 */
@AutoConfiguration
public class MyWebAutoConfiguration implements WebMvcConfigurer {

    public static <T extends Filter> FilterRegistrationBean<T> createFilterBean(T filter, Integer order) {
        FilterRegistrationBean<T> bean = new FilterRegistrationBean(filter);
        bean.setOrder(order);
        return bean;
    }

    /**
     * 创建 RequestBodyCacheFilter Bean，可重复读取请求内容
     */
    @Bean
    public FilterRegistrationBean<CacheRequestBodyFilter> requestBodyCacheFilter() {
        return createFilterBean(new CacheRequestBodyFilter(), WebFilterOrderEnum.REQUEST_BODY_CACHE_FILTER);
    }

}
