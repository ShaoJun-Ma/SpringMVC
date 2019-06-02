package demo03;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController02 {
    @RequestMapping("/test02")
    public void testDemo(@RequestParam("username")String name,@RequestParam(value = "age",required = false)Integer age){
        System.out.println("age:"+age+" "+"name:"+name);
        System.out.println("测试成功！！");
    }
}
