package com.snn.workflow.flowengine;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import io.seata.spring.annotation.datasource.EnableAutoDataSourceProxy;
import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@NacosPropertySource(dataId = "config",autoRefreshed = true)
@DubboComponentScan(basePackages = "com.snn.workflow.flowengine.openapi")
@EnableAutoDataSourceProxy
public class FlowEngineApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlowEngineApplication.class, args);
    }

}
