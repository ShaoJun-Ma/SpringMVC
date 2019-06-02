package demo04;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//REST

@Controller
public class TestController {
    //get请求
    @RequestMapping(value = "/test01/{id}",method = RequestMethod.GET)
    public void testRest(@PathVariable("id")Integer id){
        System.out.println("test GET:"+id);
        System.out.println("测试GET成功！！");
    }

    //put请求
    @RequestMapping(value = "/test01",method = RequestMethod.POST)
    public void testRest(){
        System.out.println("测试POST成功！！");
    }

    //delete请求
    @RequestMapping(value = "/test01/{id}",method = RequestMethod.DELETE)
    public void testDelete(@PathVariable("id") Integer id){
        System.out.println("test delete:"+id);
        System.out.println("测试DELETE成功！！");
    }

    //put请求
    @RequestMapping(value = "/test01/{id}",method = RequestMethod.PUT)
    public void testPut(@PathVariable("id") Integer id){
        System.out.println("test put:"+id);
        System.out.println("测试PUT成功！！");
    }

}
