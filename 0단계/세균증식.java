class Solution {
  public int solution(int n, int t) {
      int answer = 0;
      while(t !=0)
      {
        n = n*2;
        answer = n;
        t--;
      }
      return answer;
  }
}
