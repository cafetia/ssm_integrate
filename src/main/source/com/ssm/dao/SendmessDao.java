package com.ssm.dao;



import com.ssm.entities.MessageSend;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface SendmessDao {
    /**
    *
    * Created with IDEA 2017
    * author:Cafe
    * Date: 2018/4/20
    * Time: 下午 4:56
    *
    * */
    public List<MessageSend> srearchMS();
    public void  updateMS(int msId);
}
