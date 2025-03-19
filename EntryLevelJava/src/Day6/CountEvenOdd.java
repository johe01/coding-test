package Day6;

public class CountEvenOdd {
    public int[] solution(int[] num_list) {
        int[] answer = {0, 0};
        for (int i = 0; i<num_list.length; i++){
            int num = num_list[i];
            if(0 == num%2) answer[0] +=1;
            else if(1 == num%2) answer[1] +=1;
        }
        return answer;
    }
}
