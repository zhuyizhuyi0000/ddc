package com.mljr.testcase;
import com.lyqc.api.dubbo.RepaymentPayDubboService;
import com.lyqc.api.model.FinRepaymentPay;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.*;


/**
 * Created by zhutingwei on 2018/3/16.
 */
@ContextConfiguration(locations={"classpath:spring-consumer.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class RepaymentPayDubboServiceTest {

    @Autowired
    private RepaymentPayDubboService repaymentPayDubboService;

    private FinRepaymentPay finRepaymentPay = new FinRepaymentPay();

    private static final String PATTERN  = "yyyy-mm-dd";

    @Test
    public void testDubboService(){
        finRepaymentPay.setAppNo("F1803281000100102002");
        finRepaymentPay.setAppName("黄志宁");
        finRepaymentPay.setLoanRate(8.56);
        finRepaymentPay.setLoanDate(stringToDate("2018-03-07",PATTERN));
        finRepaymentPay.setPayDate(stringToDate("2018-04-06", PATTERN));
        finRepaymentPay.setPrincipal(1320.46);
        finRepaymentPay.setInterest(385.09);
        finRepaymentPay.setRepayment(1705.55);
        finRepaymentPay.setPaymentDate(stringToDate("2018-04-05",PATTERN));
        finRepaymentPay.setTermNo((short)1);
        finRepaymentPay.setLoanType("XWYH4");
        finRepaymentPay.setStatus((short)1);
        finRepaymentPay.setFactPayDate(stringToDate("2018-03-15",PATTERN));
        finRepaymentPay.setUpdateTime(stringToDate("2018-03-15 00:00:00",PATTERN));
        finRepaymentPay.setFactRepayment(1100.35);
        finRepaymentPay.setStatusZH("1");
        finRepaymentPay.setLoanChanl((short)1);
        List<FinRepaymentPay> finRepaymentPayList = new ArrayList<FinRepaymentPay>();
        finRepaymentPayList.add(finRepaymentPay);

        Map<String, Object> result = new HashMap<String, Object>();
        result = repaymentPayDubboService.receiveRepaymentPay(finRepaymentPayList);
        System.out.println(result);

    }

    public static Date stringToDate(String source, String pattern) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Date date = null;
        try {
            date = simpleDateFormat.parse(source);
        } catch (Exception e) {
        }
        return date;
    }
}
