package com.zzw.datacollect;

import com.zzw.datacollect.test.DemoService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Wen
 * @date 2022/10/12 15:17
 */
@Configuration
public class DataCollectConfiguration {
    @Bean
    public DemoService demoService() {
        return new DemoService();
    }
}
