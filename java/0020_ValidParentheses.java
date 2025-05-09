import java.util.Map;
import java.util.HashMap;
import java.util.Stack;

class Solution {
	 /**
     * LeetCode 20 – Valid Parentheses
     * Approach: Stack + HashMap
     * Time complexity: O(n)
     * Space complexity: O(n)
     */
    public boolean isValid(String s) { 
        Map<Character,Character> map = new HashMap<>();
        Stack<Character> stack = new Stack<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
		//c is a closing bracket - check if it matches the last opening
                char top = stack.isEmpty() ? '*' : stack.pop();
                if(map.get(c) != top)
                    return false; 
            }
            else{
		//c is an opening bracket - push it to stack
                stack.push(c);
            }
        }
	// if stack is empty, all brackets were matched
        return stack.isEmpty();

        }

    }

