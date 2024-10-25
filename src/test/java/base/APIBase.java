package base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.*;

public class APIBase {
    public static final Logger logger = LogManager.getLogger(APIBase.class);
    @BeforeMethod()
    public void PrefixMethod(){
        logger.info("APIBase > PrefixMethod - Started");
        System.out.println("APIBase > PrefixMethod :");
        logger.info("APIBase > PrefixMethod - Ended");
    }
    @AfterMethod()
    public void PostfixMethod(){
        logger.info("APIBase > PostfixMethod - Started");
        System.out.println("APIBase > PostfixMethod :");
        logger.info("APIBase > PostfixMethod - Ended");
    }
    @BeforeClass()
    public void PrefixClass(){
        logger.info("APIBase > PrefixClass - Started");
        System.out.println("APIBase > PrefixClass :");
        logger.info("APIBase > PrefixClass - Ended");
    }
    @AfterClass()
    public void PostfixClass(){
        logger.info("APIBase > PostfixClass - Started");
        System.out.println("APIBase > PostfixClass :");
        logger.info("APIBase > PostfixClass - Ended");
    }
    @BeforeSuite
    public void PrefixSuite(){
        logger.info("APIBase > PrefixSuite - Started");
        System.out.println("APIBase > PrefixSuite :");
        logger.info("APIBase > PrefixSuite - Ended");
    }
    @AfterSuite
    public void PostfixSuite(){
        logger.info("APIBase > PostfixSuite - Started");
        System.out.println("APIBase > PostfixSuite :");
        logger.info("APIBase > PostfixSuite - Ended");
    }
}
