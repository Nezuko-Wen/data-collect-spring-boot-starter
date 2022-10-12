package com.zzw.datacollect;

import com.zzw.datacollect.test.DemoService;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author Wen
 * @date 2022/10/12 15:17
 */
@Configuration
@MapperScan("com.zzw.datacollect.mapper")
public class DataCollectConfiguration {
    @Bean
    public DemoService demoService() {
        return new DemoService();
    }
}
