package chapter21.exception.homework;

public class UsernameLengthException extends Exception{
    public UsernameLengthException(){}
    public UsernameLengthException(String s){
        super(s);
    }
}
