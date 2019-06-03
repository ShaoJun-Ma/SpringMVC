package demo05;

//import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @RequestMapping("/hello")
    @ResponseBody
    public User hello(){
        return new User(1,"2",2);
    }

//    @RequestMapping("/hello2")
//    @ResponseBody
//    public String hello2(){
//        return JSON.toJSONString(new User(1,"2",2));
//    }
//
//    @RequestMapping("/hello3")
//    @ResponseBody
//    public String hello3(@RequestBody User user){
//        System.out.println(user);
//        return "ok";
//    }
}
