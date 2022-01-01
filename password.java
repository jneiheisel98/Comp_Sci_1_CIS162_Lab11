
/**
 * Write a description of class password here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class password
{
    // instance variables - replace the example below with your own
    public boolean isPasswordValid(String password){
    boolean number = false;
    boolean uppercase = false;
    boolean lowercase = false;
    
    for (int i = 0; i<password.length(); i++){
    if(Character.isUpperCase(password.charAt(i))){
    uppercase = true;
    }
    if(Character.isLowerCase(password.charAt(i))){
    lowercase = true;
    }
    if(Character.isDigit(password.charAt(i))){
    number = true;
    }
    }
    return number && password.length()>=8 && uppercase && lowercase;
    }
    public boolean isAllDigits (String str){
    for (int i = 0; i<str.length(); i++){
        if(!Character.isDigit(str.charAt(i))){
        return false;
        }
    }
    return true;
}
}