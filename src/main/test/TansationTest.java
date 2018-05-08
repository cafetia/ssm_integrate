
import com.ssm.entities.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.ssm.services.UserService;

import javax.transaction.Transactional;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TansationTest {
    @Autowired
    private UserService userService;
    @Test
    @Transactional
    public  void  myTranstest() throws Exception{
        ApplicationContext ctx=new ClassPathXmlApplicationContext("spring-mybatis.xml");
        userService=ctx.getBean(UserService.class);

        //以String形式传入，mybatis会自动转换？
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        String dateNow = sdf.format(date);

        System.out.println("现在的时间是："+dateNow);


        int userId = 3;
        User user = new User();
        user.setRegTime(dateNow);
        user.setEmail("12912@163.com");
        user.setId(1);
        user.setPassword("123456");
        user.setRegIp("134.65.453.12");
        user.setRole("girl");
        user.setStatus(1);
        user.setUsername("xiaowoniu");
        userService.modifyUser(user);


        System.out.println("getRegTime--"+user.getRegTime());
        user.setId(userId);
        user.setPassword("654321");
        user.setRegIp("134.65.453.15");
        user.setStatus(2);
        user.setRole("lady");
        user.setUsername("liaolu");
        user.setEmail("1263g@126.com");
        userService.addUser(user);
    }
}
