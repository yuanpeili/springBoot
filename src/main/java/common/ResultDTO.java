package common;

import java.io.PrintWriter;
import java.io.StringWriter;

public class ResultDTO<T> {


    private int code;

    private String error;

    private String message;

    private Exception exception;

    private T object;


    /**
     * 接口调用成功，不需要返回对象
     */
    public static <T> ResultDTO<T> newSuccess() {
        ResultDTO<T> result = new ResultDTO<>();
        return result;
    }

    /**
     * 接口调用成功，有返回对象
     */
    public static <T> ResultDTO<T> newSuccess(T object) {
        ResultDTO<T> result = new ResultDTO<>();
        result.setObject(object);
        return result;
    }

    /**
     * 接口调用失败，有错误码和描述，没有返回对象
     */
    public static <T> ResultDTO<T> newFailure(int code, String message) {
        ResultDTO<T> result = new ResultDTO<>();
        result.setCode(code != 0 ? code : -1);
        result.setMessage(message);
        return result;
    }

    /**
     * 接口调用失败，有错误字符串码和描述，没有返回对象
     */
    public static <T> ResultDTO<T> newFailure(String error, String message) {
        ResultDTO<T> result = new ResultDTO<>();
        result.setCode(-1);
        result.setError(error);
        result.setMessage(message);
        return result;
    }

    /**
     * 转换或复制错误结果
     */
    public static <T> ResultDTO<T> newFailure(ResultDTO<?> failure) {
        ResultDTO<T> result = new ResultDTO<>();
        result.setCode(failure.getCode() != 0 ? failure.getCode() : -1);
        result.setError(failure.getError());
        result.setMessage(failure.getMessage());
        result.setException(failure.getException());
        return result;
    }

    /**
     * 接口调用失败，返回异常信息
     */
    public static <T> ResultDTO<T> newException(Exception e) {
        ResultDTO<T> result = new ResultDTO<>();
        result.setCode(-1);
        result.setException(e);
        result.setMessage(e.getMessage());
        return result;
    }


    /**
     * 判断返回结果是否成功
     */
    public boolean success() {
        return code == 0;
    }

    /**
     * 判断返回结果是否有结果对象
     */
    public boolean hasObject() {
        return code == 0 && object != null;
    }

    /**
     * 判断返回结果是否有异常
     */
    public boolean hasException() {
        return exception != null;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Exception getException() {
        return exception;
    }

    public void setException(Exception exception) {
        this.exception = exception;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Result");
        if (object != null) {
            result.append("<" + object.getClass().getSimpleName() + ">");
        }
        result.append(": {code=" + code);
        if (object != null) {
            result.append(", object=" + object);
        }
        if (error != null) {
            result.append(", error=" + error);
        }
        if (message != null) {
            result.append(", message=" + message);
        }
        if (exception != null) {
            StringWriter stringWriter = new StringWriter();
            exception.printStackTrace(new PrintWriter(stringWriter));
            result.append(", exception=" + stringWriter.toString());
        }
        result.append(" }");
        return result.toString();
    }
}
