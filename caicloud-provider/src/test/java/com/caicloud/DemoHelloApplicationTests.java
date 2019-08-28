
package com.caicloud;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes={DemoHelloApplication.class})// 指定启动类
public class DemoHelloApplicationTests {
    private final static Logger logger = LoggerFactory.getLogger(DemoHelloApplicationTests.class);

    @Test
    public void testOne(){
        logger.info("-------------------one-----------------------------");

        System.out.println("--------------test hello 1-------------");
    }

    @Test
    public void testTwo(){
        System.out.println("------test hello 2-------");
        logger.info("---------------two---------------------------------");
        TestCase.assertEquals(1, 1);
    }



    @Before
    public void testBefore(){
        logger.info("-----------------before-------------------------------");

        System.out.println("---------------before");
    }

    @After
    public void testAfter(){
        logger.info("-----------------------after-------------------------");

        System.out.println("after---------------");
    }


}