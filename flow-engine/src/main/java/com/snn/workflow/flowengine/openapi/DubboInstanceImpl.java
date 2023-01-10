package com.snn.workflow.flowengine.openapi;

import com.snn.workflow.flowengine.service.IFlowInstanceService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @Author: shinn
 * @Date: 2022/11/17 上午10:48 （日期和时间）
 */
@DubboService(registry = {"dubbo-nacos"}, protocol = {"dubbo"},
    cluster = "failover"
)
public class DubboInstanceImpl implements IFlowInstanceService {
}
