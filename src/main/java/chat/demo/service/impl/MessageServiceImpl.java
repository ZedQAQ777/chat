package chat.demo.service.impl;

import chat.demo.entity.Message;
import chat.demo.entity.User;
import chat.demo.mapper.MessageMapper;
import chat.demo.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    private MessageMapper messageMapper;
    @Override
    public List<Message> getByUserId(User user) {
        return messageMapper.selectAll();
    }

    @Override
    public List<Message> getMessage(String userId) {
        return messageMapper.getMessage(userId);
    }

    @Override
    public void send(Message message) {
        messageMapper.insert(message);
    }
}
