package exception;
//自定义运行时异常类（编译时异常改继承Exception即可）
public class MyRuntimeException extends RuntimeException{
    public MyRuntimeException(){}
    public MyRuntimeException(String message){
        super(message);
    }

}
