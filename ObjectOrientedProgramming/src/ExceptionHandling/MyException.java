package ExceptionHandling;

public class MyException extends Exception{
//Creating my own exception
    public MyException(String message){
        super(message);
    }
}
