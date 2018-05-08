
import com.ssm.entities.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.ssm.services.UserService;

public class UserServiceTest {
    @Autowired //可用可不用
    private UserService userService;
    @Test
    public void testQueryUser() {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("spring-mybatis.xml");
        userService=ctx.getBean(UserService.class);
        long id = 1 ;
        User user = userService.queryUser(id);
        System.out.println("username---"+user.getUsername());
    }
}
