package cn.jdwa.exception;

/**
 * Created by czz on 2019/9/21.
 */
public class SysException extends Exception{
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public SysException(String msg) {
        this.msg = msg;
    }
}
