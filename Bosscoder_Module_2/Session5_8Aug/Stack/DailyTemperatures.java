package Bosscoder_Module_2.Session5_8Aug.Stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class DailyTemperatures {
  public int[] dailyTemperatures(int [] temperatures) {
// code here
ArrayList<Integer> a=new ArrayList<>();
Stack<Integer> s=new Stack();
for(int i=temperatures.length-1;i>=0;i--)
{
while (!s.isEmpty() && temperatures[s.peek()]<=temperatures[i])
{
s.pop();
}
if (s.isEmpty()) a.add(0);
else  a.add(s.peek()-i);
s.push(i);
Collections.reverse(a);
return
a.stream().mapToInt(Integer::intValue).toArray();
}}
}
