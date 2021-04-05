package chat.demo.mapper;

import chat.demo.entity.User;

import tk.mybatis.mapper.common.Mapper;


@org.apache.ibatis.annotations.Mapper
public interface UserMapper extends Mapper<User> {

    //根据用户名获取id
    public Integer getIdByName(String name);
}
