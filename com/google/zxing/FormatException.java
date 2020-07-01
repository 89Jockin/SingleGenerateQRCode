package com.google.zxing;

/**
 * @date: 2020/7/1 下午12:58
 * Description: $
 */
public final class FormatException extends Exception  {
    protected static final boolean isStackTrace =
            System.getProperty("surefire.test.class.path") != null;
    protected static final StackTraceElement[] NO_TRACE = new StackTraceElement[0];
    private static final FormatException INSTANCE = new FormatException();
    static {
        INSTANCE.setStackTrace(NO_TRACE); // since it's meaningless
    }

    private FormatException() {
    }

    private FormatException(Throwable cause) {
        super(cause);
    }

    public static FormatException getFormatInstance() {
        return isStackTrace ? new FormatException() : INSTANCE;
    }

    public static FormatException getFormatInstance(Throwable cause) {
        return isStackTrace ? new FormatException(cause) : INSTANCE;
    }

    @Override
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }
}
