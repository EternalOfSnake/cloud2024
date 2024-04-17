package com.north.cloud.fallback;

import com.north.cloud.apis.PayFeignSentinelApi;
import com.north.cloud.resp.ResultData;
import com.north.cloud.resp.ReturnCodeEnum;
import org.springframework.stereotype.Component;

/**
 * @author eternal
 * @version 1.0
 * @description: TODO
 * @date 2024/4/17 下午5:32
 */
@Component
public class PayFeignSentinelApiFallBack implements PayFeignSentinelApi
{
    @Override
    public ResultData getPayByOrderNo(String orderNo)
    {
        return ResultData.fail(ReturnCodeEnum.RC500.getCode(),"对方服务宕机或不可用，FallBack服务降级o(╥﹏╥)o");
    }
}