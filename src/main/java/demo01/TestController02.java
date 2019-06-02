package demo01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//表单请求方式：post
@Controller
public class TestController02 {
    @RequestMapping(value = "/test02",method = RequestMethod.POST)
    public String test02(){
        System.out.println("method:post");
        return "/success.jsp";
    }
}
