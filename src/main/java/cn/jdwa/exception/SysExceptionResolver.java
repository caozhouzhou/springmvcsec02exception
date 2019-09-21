package cn.jdwa.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by czz on 2019/9/21.
 */
public class SysExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        System.out.println("1111111111.... ..... .. .. . .. . .. .... .. .. . . ..");
        SysException ex = null;
        if (e instanceof SysException){
            ex = (SysException) e;
        } else {
            ex = new SysException("系统维护 ... ... ... ...");
        }
        ModelAndView mv = new ModelAndView();
        mv.addObject("errMsg",ex.getMsg());
        mv.setViewName("error");
        return mv;
    }
}
