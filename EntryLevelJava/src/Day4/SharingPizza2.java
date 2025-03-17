package Day4;

public class SharingPizza2 {
    // 6과 n의 최대 공약약수 구하기

    // 최대공약수
    public static int gcd(int a, int b) {
        if(b == 0) {
            return a;
        }
        return gcd(b, a%b);
    }

    public int solution(int n) {
        // int answer = (6/gcd(6, n)) * n / 6 ;
        int answer = n/gcd(6, n) ;
        return answer;
    } 
    
}

 class InnerSharingPizza2 {

    public static void main(String[] args) {
        SharingPizza2 sp2 = new SharingPizza2();
        int r = sp2.solution(10);
        System.out.println(r);
    }
}
