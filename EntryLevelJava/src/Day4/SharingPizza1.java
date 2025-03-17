package Day4;

public class SharingPizza1 {

    public int solution(int n) {
        if (n % 7 == 0) {
            return n / 7;
        } else return n / 7 + 1;
    }
}

class InnerSharingPizza1 {

    public static void main(String[] args) {
        SharingPizza1 sp1 = new SharingPizza1();
        int n = 9;
        int result = sp1.solution(n);
        System.out.println(result);
    }
}
