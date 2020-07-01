package com.google.zxing;

/**
 * @date: 2020/7/1 下午1:51
 * Description: $
 */
public final class WriterException extends Exception {

    public WriterException() {
    }

    public WriterException(String message) {
        super(message);
    }

    public WriterException(Throwable cause) {
        super(cause);
    }

}