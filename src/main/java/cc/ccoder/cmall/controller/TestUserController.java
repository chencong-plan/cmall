package cc.ccoder.cmall.controller;

import cc.ccoder.cmall.pojo.User;
import cc.ccoder.cmall.service.IUserService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author : ChenCong
 * @date : Created in 16:00 2018/2/27
 */

@Controller
public class TestUserController {

    @Autowired
    private IUserService iUserService;

    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    @ResponseBody
    public String login(@PathVariable("id") Integer id){
        User user = iUserService.selectByPrimaryKey(id);
        String result = JSON.toJSONString(user);
        return result;
    }
}
