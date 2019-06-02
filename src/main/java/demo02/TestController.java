package demo02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
//@PathVariable的使用
@Controller
public class TestController {
    @RequestMapping("/user/{id}")
    public void userTest(@PathVariable("id")Integer id){
        System.out.println("数字："+id);
        System.out.println("测试成功！！");
    }
}
