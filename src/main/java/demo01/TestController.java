package demo01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//输出HelloWorld
@Controller
public class TestController {
    @RequestMapping("/hello")
    public String helloWorld(){
        System.out.println("hello world");
        return "/success.jsp";
    }
}
