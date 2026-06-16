import java.util.*;

class Main {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()) {

            if(ch=='(' || ch=='{' || ch=='[') { //adding the first ele
                stack.push(ch);
            }
            else {

                if(stack.isEmpty())   //eg.}  return false coz stack is empty
                    return false;

                char top = stack.pop();

                if(ch==')' && top!='(') return false; ///first opening {} comes out not {
                if(ch=='}' && top!='{') return false;
                if(ch==']' && top!='[') return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(isValid(s));
    }
}
