package chat.demo.service.impl;

import chat.demo.mapper.UserMapper;
import chat.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public Integer getIdByName(String name) {
        return userMapper.getIdByName(name);
    }
}
