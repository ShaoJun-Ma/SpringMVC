package demo01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//请求参数
@Controller
public class TestController03 {
    @RequestMapping(value = "/test03",params = {"username","password"})
    public String test03(){
        System.out.println("params success");
        return "/success.jsp";
    }
}
