public class factorialrec {
    public static void main(String[] args) {
        System.out.println(factorialrec(5));
    }
    static int factorialrec(int n){
        if (n==0){
            return 1; 
        }
        return n*factorialrec(n-1);
    }
}
