package com.java.dsa.leetCode;

import java.util.Stack;

/*
You are keeping the scores for a baseball game with strange rules. At the beginning of the game, you start with an empty record.

You are given a list of strings operations, where operations[i] is the ith operation you must apply to the record and is one of the following:

An integer x.
Record a new score of x.
'+'.
Record a new score that is the sum of the previous two scores.
'D'.
Record a new score that is the double of the previous score.
'C'.
Invalidate the previous score, removing it from the record.
Return the sum of all the scores on the record after applying all the operations.

The test cases are generated such that the answer and all intermediate calculations fit in a 32-bit integer and that all operations are valid.



Example 1:

Input: ops = ["5","2","C","D","+"]
Output: 30
Explanation:
"5" - Add 5 to the record, record is now [5].
"2" - Add 2 to the record, record is now [5, 2].
"C" - Invalidate and remove the previous score, record is now [5].
"D" - Add 2 * 5 = 10 to the record, record is now [5, 10].
"+" - Add 5 + 10 = 15 to the record, record is now [5, 10, 15].
The total sum is 5 + 10 + 15 = 30.
 */
public class BaseBallGame {
    public static void main(String[] args) {
        /*ArrayList<Integer> result=new ArrayList<>();
      for(int i=0;i<operations.length;i++)
      {
        int value=0;
        try{
          value=Integer.parseInt(operations[i]);
          result.add(value);
        }catch(Exception e)
        {
         if(operations[i].equals("D"))
        {
         int size=result.size();
         int val= result.get(size-1);
         result.add(val*2);
        }
        else if(operations[i].equals("+"))
        {
         int size=result.size();
         result.add(result.get(size-1)+result.get(size-2));
        }
        else if(operations[i].equals("C"))
        {
         int size=result.size();
         result.remove(size-1);
        }
        }


      }

      return result.stream().collect(Collectors.summingInt(Integer::intValue));
      */
        String [] operations={"5","2","C","D","+"};
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<operations.length;i++)
        {
            if(operations[i].equals("D"))
            {
                int prev=stack.peek();
                stack.push(prev*2);
            }
            else if(operations[i].equals("+"))
            {
                int top=stack.pop();
                int prev=stack.peek();
                stack.push(top);
                stack.push(top+prev);
            }
            else if(operations[i].equals("C"))
            {
                stack.pop();
            }
            else
            {
                stack.push(Integer.parseInt(operations[i]));
            }
        }
        int sum=0;
        while(!stack.isEmpty())
        {
            sum+=stack.pop();
        }
        System.out.println("Total Sum is :"+sum);

    }
}
