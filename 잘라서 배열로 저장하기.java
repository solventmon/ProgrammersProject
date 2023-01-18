import java.util.ArrayList;
import java.util.Collections;

class Solution {
  public ArrayList<String> solution(String my_str, int n) {

      ArrayList<String> arr = new ArrayList<String>();

      int m = 0;
      int k = 1;

      for(int j =0; j <= my_str.length()/n; j++)
      {
        if(n*k >= my_str.length())
        {
          arr.add(my_str.substring(m));
        }
        else{
          arr.add(my_str.substring(m,n * k)); // 0 6 6 12 12 18
        }

        arr.remove("");
        m +=n;
        k++;
      }

      return arr;
  }
}