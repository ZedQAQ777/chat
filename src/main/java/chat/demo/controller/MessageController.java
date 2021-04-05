package chat.demo.controller;

import chat.demo.common.R;
import chat.demo.entity.Message;
import chat.demo.entity.User;
import chat.demo.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/message")
@CrossOrigin
public class MessageController {

    @Autowired
    private MessageService messageService;

    //获取A和B的所有信息
    @GetMapping("getAll")
    public List<Message> getAll(){
        return messageService.getByUserId(new User());
    }

    @GetMapping("getMessage/{userId}")
    public R getMessage(@PathVariable("userId") String userId){
        List<Message> messages = messageService.getMessage(userId);
        return R.ok().data("messages",messages);
    }

    //用户发送数据，前端已经获取了发送对象的userid，并且封装了message存储消息（不需要封装id）
    @PostMapping("sendMessage")
    public R sendMessage(@RequestBody Message message){
        messageService.send(message);
        return R.ok().data("info","成功");
    }

}
