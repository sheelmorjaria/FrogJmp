

public class FrogJmp {

    public static void main(String[] args) {
        Solution solver = new Solution();
        System.out.println(solver.solution(10, 85, 30));
    }
    static class Solution {
        public int solution(int X, int Y, int D){
            int distance = Y - X;
            int jumps = distance / D;
            if (distance % D != 0) {
                jumps++;
            }
            return jumps;
        }
    }


}
