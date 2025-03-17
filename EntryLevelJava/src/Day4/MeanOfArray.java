package Day4;

public class MeanOfArray {
    public double solution(int[] numbers) {
        double answer = 0;
        double sum = 0;
        for (int i=0; i<numbers.length; i++) {
            sum += numbers[i];
        }
        answer = sum / numbers.length;
        return answer;
    }
}
 class InnerMeanOfArray {
 
    public static void main(String[] args) {
        MeanOfArray moa = new MeanOfArray();
        int[] intArray = {1,2,3,4,5,6,7,8};
        double answer = moa.solution(intArray);
        System.out.println(answer);
    }   
 }
