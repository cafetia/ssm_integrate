package TheadPool;


import com.ssm.entities.MessageSend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.ssm.services.SendMessService;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolTest {
    @Autowired
    private static SendMessService sendMessService;
    public static void main(String[] args) {
        //定时器 ,延迟多久后，只执行一次
/*        Executors.newScheduledThreadPool(3).schedule(new Runnable() {
            public void run() {
                System.out.println("the boom has boomed!!");
            }
        },2, TimeUnit.SECONDS);
*/

        //定时器  延迟多久后，执行一次，之后每隔一段时间执行一次。 实现短信发送。
        Executors.newScheduledThreadPool(11).scheduleAtFixedRate(new Runnable() {
            public void run() {
                /*System.out.println("the boom is booming!!");
                for (int tt = 0 ;tt < 10 ;tt++){
                    try {
                        Thread.sleep(1000);
                        System.out.println("现在时间是："+new Date().getSeconds());

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }*/

                sendDx();


            }
        },2,600, TimeUnit.SECONDS);


    }

    public static void sendDx(){
        try {
            ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-mybatis.xml");
            sendMessService = applicationContext.getBean(SendMessService.class);
            List<MessageSend> smLlist = sendMessService.seleMS();
            System.out.println("smListSize is --"+smLlist.size());
            System.out.println("the second id is ----"+smLlist.get(1).getId());
            Iterator it = smLlist.iterator();
            /*while (it.hasNext()){
                MessageSend messageSend = new MessageSend();
                messageSend = (MessageSend)it.next();
                System.out.println("currentId is ___"+messageSend.getId());
            }*/
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
