package chat.demo.controller;

import chat.demo.common.R;
import chat.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;
//根据用户名返回id
    @GetMapping("getId/{name}")
    public R getId(@PathVariable("name") String name){
        Integer userId=userService.getIdByName(name);
        return R.ok().data("userId",userId);
    }
}
