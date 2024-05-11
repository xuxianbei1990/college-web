package college.framework.apilog.config;

import college.framework.apilog.core.ApiAccessLogInterceptor;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * User: EDY
 * Date: 2024/4/24
 * Time: 16:42
 * Version:V1.0
 */
@AutoConfiguration
public class MyApiLogAutoConfiguration implements WebMvcConfigurer {


    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new ApiAccessLogInterceptor());
    }

}
