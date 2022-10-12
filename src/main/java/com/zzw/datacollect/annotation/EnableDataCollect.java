package com.zzw.datacollect.annotation;

import com.zzw.datacollect.DataCollectConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.SchedulingConfiguration;

import java.lang.annotation.*;

/**
 * @author Wen
 * @date 2022/10/12 15:13
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(DataCollectConfiguration.class)
@Documented
public @interface EnableDataCollect {
}
