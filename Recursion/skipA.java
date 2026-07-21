public class skipA {
    public static void main(String[] args) {
        String s="abccad";
        func(" ", s);
    }
    static void func(String empty,String s){
        if (s.isEmpty()) {
            System.out.println(empty);
            return;
        }
        char ch = s.charAt(0);
        if (ch == 'a'){
            func(empty,s.substring(1));
        }else{
            func(empty + ch, s.substring(1));
        }
    }
}
