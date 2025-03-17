package Day4;

public class SharingPizza3 {

    public int solution(int slice, int n) {
        int r = n % slice;
        if(  r == 0 ) return n / slice;
        else return n / slice + 1;
    } 
}

class InnerSharingPizza3 {

    public static void main(String[] args) {
        SharingPizza3 sp3 = new SharingPizza3();
        int rs = sp3.solution(7, 10);
        System.out.println(rs);
    }
}
