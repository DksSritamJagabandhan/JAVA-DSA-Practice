public class reverseNum {
    public static void main(String[] args) {
        System.out.println(rev(4542));
    }
    static int sum=0;
    static int rev(int n){
        if (n==0){
            return sum;
        }
        int digit=n%10;
        sum=sum*10+digit;
        return rev(n/10);
    }
}
