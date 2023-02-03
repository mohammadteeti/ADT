package ValidParantheses;
import java.util.Stack;

public class ValidParanthesesTest {
    
    public static void main(String[] args) {

        ValidParanthesesTest v = new ValidParanthesesTest();
        if(args != null) 
            if(args.length!=0)
                System.out.println(v.isValid(args[0]));
        
    }

    public boolean isValid(String s) {

        if (isClose(s.charAt(0)))
            return false;
        
        Stack<Character> stack =new Stack<>();
        char p=s.charAt(0);
        stack.add(p);

        for (int i =1;i<s.length();i++){
            p=s.charAt(i);
            if (isClose(p)){
                if(stack.isEmpty())
                    return false;
                
                if(isSame(stack.peek(),p)){
                    stack.pop();

                }
                else 
                    return false;
            }
            else {
                stack.add(p);
            }

        }

        return stack.isEmpty();
    }


    boolean isClose(char p){
        return p=='}' || p== ')' || p==']';
    }

    boolean isOpen(char p){
        return !isClose(p);
    }

    boolean isSame(char inStack , char p){
        return (inStack=='{' && p=='}') ||
                (inStack=='(' && p==')') ||
                (inStack=='[' && p==']') ;
        
    }


    
}


