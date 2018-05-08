
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.ssm.services.impl.AopServiceImpl;
import com.ssm.services.impl.AopServiceImpl2;

public class AopTest {
    @Autowired
    private AopServiceImpl2 aopServiceimpl2 ;
    @Autowired
    private AopServiceImpl aopServiceImpl ;
    @Test
    public void testAop(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("spring-mybatis.xml");
        //扫描的方式
        aopServiceImpl=ctx.getBean(AopServiceImpl.class);
        aopServiceImpl.eat();
        aopServiceImpl.sleep();

        //非扫描方式
//        aopServiceImpl = (AopServiceImpl) ctx.getBean("aopServiceImpl");//错误不是写的spring的bean，后续改
//        aopServiceImpl.eat();
//        aopServiceImpl.sleep();


//        aopServiceImpl2 = ctx.getBean(AopServiceImpl2.class);
//        aopServiceImpl2.eat();
//        aopServiceImpl2.sleep();


    }
}
