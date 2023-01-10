package com.snn.workflow.flowengine.openapi;

import com.snn.workflow.flowengine.service.IFlowActionService;
import io.seata.spring.annotation.GlobalTransactional;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @Author: shinn
 * @Date: 2022/11/18 下午5:00 （日期和时间）
 */
@DubboService(registry = {"dubbo-nacos"}, protocol = {"dubbo"},
    cluster = "failover"
)
public class DubboActionImpl implements IFlowActionService {
    @Override
    @GlobalTransactional(rollbackFor = Exception.class)
    public void add() {

    }
}
