package com.ragnar.Data_Structure;

import java.util.HashMap;
import java.util.Stack;


public class StackExampleProblem {

    public static void main(String[] args) {
        String problem = "8/2+4/3*7";
        System.out.println(findSolution(problem));
    }

    private static int findSolution(String str){
        Stack<Integer> nums = new Stack<>();
        Stack<Character> opers = new Stack<>();
        
        HashMap<Character, Integer> precidence = new HashMap<>();
        precidence.put('+', 1);
        precidence.put('-', 1);
        precidence.put('*', 2);
        precidence.put('/', 2);

        int i=0;

        while(i<str.length()){
            
            if (Character.isDigit(str.charAt(i))) {
                String n = ""; 

                while (i < str.length() && Character.isDigit(str.charAt(i))) {
                    n += String.valueOf(str.charAt(i));
                    i++;
                }
                nums.push(Integer.parseInt(n));

            }
            else{
                while(!opers.empty() && precidence.get(opers.peek()) >= (precidence.get(str.charAt(i)))){
                    int num2 = nums.pop();
                    int num1 = nums.pop();
                    char op = opers.pop();
                    
                    if(op == '+'){ nums.push(num1 + num2);}
                    else if(op == '-'){ nums.push(num1 - num2);}
                    else if(op == '*'){ nums.push(num1 * num2);}
                    else if(op == '/'){ nums.push((int)(num1 / num2));}
                }
                opers.push(str.charAt(i));
                i++;   
            }
        }
        while (!opers.isEmpty()) {
            char op = opers.pop();
            int num2 = nums.pop();
            int num1 = nums.pop();

            if(op == '+'){ nums.push(num1 + num2);}
            else if(op == '-'){ nums.push(num1 - num2);}
            else if(op == '*'){ nums.push(num1 * num2);}
            else if(op == '/'){ nums.push((int)(num1 / num2));}
            i++;
            
        
        }
        return nums.pop();



    }
}
