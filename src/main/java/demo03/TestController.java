package demo03;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//@RequestParam
@Controller
public class TestController {
    @RequestMapping("/test01")
    public void test01(Integer id,@RequestParam("username")String name){
        System.out.println("RequestParam测试成功");
        System.out.println("id："+id+" "+"姓名："+name);
    }
}
