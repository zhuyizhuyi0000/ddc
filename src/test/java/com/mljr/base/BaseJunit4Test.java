package com.mljr.base;

import org.junit.Before;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestContextManager;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Created by tingweizhu on 18/03/16.
 */
@ContextConfiguration(locations = {"classpath:/spring.xml"})
@Configuration
public class BaseJunit4Test extends AbstractJUnit4SpringContextTests {
    protected TestContextManager testContextManager;
    private ClassPathXmlApplicationContext context;
    @Before
    public void setUpContext() throws Exception {
        this.testContextManager = new TestContextManager(getClass());
        this.testContextManager.prepareTestInstance(this);
    }

//    public <T> T getBean(String name) {
//        return (T) context.getBean(name);
//    }
}