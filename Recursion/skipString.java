public class skipString {
    public static void main(String[] args) {
        String ans = func("bananaapplemango");
        System.out.println(ans);
    }
    static String func(String s){
        if (s.isEmpty()) {
            return "";
        }
        if ( s.startsWith("apple")){
            return func(s.substring(5));
        }else{
            return s.charAt(0)+func(s.substring(1));
        }
    }
}
