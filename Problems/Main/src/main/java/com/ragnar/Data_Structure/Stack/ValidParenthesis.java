package com.ragnar.Data_Structure.Stack;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String test1 = "(){}[]"; // valid
        String test2 = "({[}])"; // invalid
        String test3 = "((()))"; // valid
        
        System.out.println("Is " + test1 + " valid? " + isValid(test1));
        System.out.println("Is " + test2 + " valid? " + isValid(test2)); 
        System.out.println("Is " + test3 + " valid? " + isValid(test3));
    }

    public static boolean isValid(String pareString){

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < pareString.length(); i++) {
            
            if (pareString.charAt(i) == '(' || pareString.charAt(i) == '{' || pareString.charAt(i) == '[') {
                stack.push(pareString.charAt(i));
            }
            else if(stack.isEmpty()){
                return false;
            }
            else{
                char top = stack.pop();
                char current = pareString.charAt(i);
                if (current == ')' &&  top != '(' || current == '}' &&  top != '{' || current == ']' &&  top != '[' ) {
                    return false;
                }
            }
        }


        return stack.isEmpty();
    }
}
