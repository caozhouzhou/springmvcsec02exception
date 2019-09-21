package cn.jdwa;

import cn.jdwa.exception.SysException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by czz on 2019/9/21.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/testException")
    public String testException() throws SysException{
        System.out.println("testException ... ... ... ... ... ...");
        try {
            int i = 10/0;
        }catch (Exception e){
            e.printStackTrace();
            throw new SysException("获取数据失败 ... ... ... ...");
        }
        return "success";
    }
}
