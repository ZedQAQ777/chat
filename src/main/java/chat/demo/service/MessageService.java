package chat.demo.service;

import chat.demo.entity.Message;
import chat.demo.entity.User;

import java.util.List;

public interface MessageService {
    //获取对应用户的历史信息
    public List<Message> getByUserId(User user);

    //根据id获取对应的用户信息
    public List<Message> getMessage(String userId);

    //存储数据
    public void send(Message message);
}
