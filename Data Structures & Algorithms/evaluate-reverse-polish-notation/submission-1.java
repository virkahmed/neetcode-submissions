class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> nums = new Stack<>();

        for (String token : tokens) { 
            try { 
                nums.push(Integer.parseInt(token));
            }
            catch(Exception e) { 
                int num2 = nums.pop();
                int num1 = nums.pop();
                if (token.equals("*"))
                    nums.push(num1*num2);
                if (token.equals("-"))
                    nums.push(num1-num2);
                if (token.equals("+"))
                    nums.push(num1+num2);
                if (token.equals("/"))
                    nums.push(num1/num2);
            

            }
        
        } 
        
        return nums.pop();



    }
}
