package com.ssm.services.impl;


import com.ssm.entities.MessageSend;
import com.ssm.dao.SendmessDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ssm.services.SendMessService;

import java.util.List;

@Service("sendMessService")
public class SendMessServiceimpl implements SendMessService {
    private SendmessDao sendmessDao;
    public List<MessageSend> seleMS() {
        return sendmessDao.srearchMS();
    }

    public void modifyMS( int id) {
        sendmessDao.updateMS(id);
    }
}
