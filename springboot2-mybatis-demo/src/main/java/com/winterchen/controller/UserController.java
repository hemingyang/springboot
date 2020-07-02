package com.winterchen.controller;

import com.winterchen.model.UserDomain;
import com.winterchen.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
/*
 * 
     * @ClassName: UserController
     * @Description: TODO(这里用一句话描述这个类的作用)
     * @author hemin
     * @date 2020年7月2日
     *
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @PostMapping("/add")
    public int addUser(UserDomain user){
        return userService.addUser(user);
    }

    @ResponseBody
    @GetMapping("/all")
    public Object findAllUser(
            @RequestParam(name = "pageNum", required = false, defaultValue = "1")
                    int pageNum,
            @RequestParam(name = "pageSize", required = false, defaultValue = "10")
                    int pageSize){
        return userService.findAllUser(pageNum,pageSize);
    }
    /*
     * @ResponseBody接收参数{userid}
     */
    @DeleteMapping("/delUser/{userId}")@ResponseBody
    public void delUser(@PathVariable Integer userId) {
    	userService.delUser(userId);
    }
    
    @GetMapping("/selectUser/{userId}")@ResponseBody
    public UserDomain selectUser(@PathVariable Integer userId) {
    	return userService.selectUser(userId);
    }
    
    @PostMapping("/updateUser/{userId}")@ResponseBody
    public void updateUser(UserDomain userDomain) {
			userService.updateUser(userDomain);	
    }
}
