package com.mljr.base;//package base;
//
//import com.alibaba.fastjson.JSON;
//import com.google.common.collect.Lists;
//import com.vdian.refundplatform.client.service.RefundSysReadService;
//import com.vdian.refundplatform.common.RefundResultDO;
//import com.vdian.refundplatform.common.model.dto.req.QueryRefundInfoReqDTO;
//import com.vdian.refundplatform.common.model.dto.resp.RefundInfoRespDTO;
//import org.junit.Test;
//
//import javax.annotation.Resource;
//import java.util.List;
//
///**
// * Created by tingweizhu on 17/12/5.
// */
////@SuppressWarnings("SpringJavaAutowiringInspection")
//public class TestDubbo extends BaseJunit4Test {
//
//    @Resource(name = "refundSysReadService")
//    private RefundSysReadService refundSysReadService;
//
//    @Test
//    public void testDubboService(){
//        QueryRefundInfoReqDTO queryRefundInfoReqDTO = new QueryRefundInfoReqDTO();
//        queryRefundInfoReqDTO.setOrderIdList(Lists.newArrayList(800416710851697L));
//        RefundResultDO<List<RefundInfoRespDTO>> result = refundSysReadService.getRefundInfoByOrderIds(queryRefundInfoReqDTO);
//        System.out.println(JSON.toJSONString(result));
//
//    }
//
//
//
//}
