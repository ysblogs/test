package exception;

import common.ErrorEnum;

/**
 * Created by yizhenn on 2016/12/4.
 */
public class BaseException extends RuntimeException {
    private final ErrorEnum errorEnum;

    protected BaseException(ErrorEnum errorEnum) {
        this.errorEnum = errorEnum;
    }
}
