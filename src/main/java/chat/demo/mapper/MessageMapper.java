package chat.demo.mapper;

import chat.demo.entity.Message;

import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface MessageMapper extends Mapper<Message> {

    //根据用户id获取信息
    public List<Message> getMessage(String userId);
}
