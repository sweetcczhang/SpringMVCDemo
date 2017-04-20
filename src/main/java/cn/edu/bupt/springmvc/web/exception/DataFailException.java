package cn.edu.bupt.springmvc.web.exception;

import java.io.IOException;

public class DataFailException extends IOException {

    private final static String mes = "获取数据失败";

    public DataFailException() {
        super(mes);
    }

    public DataFailException(String gripe) {
        super(mes + gripe);
    }

}
