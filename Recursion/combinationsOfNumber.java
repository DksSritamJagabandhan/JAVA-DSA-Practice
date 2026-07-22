import java.util.ArrayList;

public class combinationsOfNumber {
    public static void main(String[] args) {
        pad("", "12");
        ArrayList<String> answer = padList("", "12");
        System.out.println(answer);
    }
    static void pad(String emp,String str){
        if (str.isEmpty() ) {
            System.out.println(emp);
            return;
        }
        int digit = str.charAt(0)-'0'; //this convert '2' to 2
        for (int i = (digit - 1)*3 ; i < digit * 3; i++) {
            char ch = (char) ('a'+i);
            pad(emp + ch, str.substring(1));
        }
    }
    // returning in arraylist
    static ArrayList<String> padList(String emp,String str){
        if (str.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(emp);
            return list;
        }
        int digit = str.charAt(0)-'0'; //this convert '2' to 2
        ArrayList<String> ans = new ArrayList<>();
        for (int i = (digit - 1)*3 ; i < digit * 3; i++) {
            char ch = (char) ('a'+i);
            ans.addAll(padList(emp + ch, str.substring(1)));
        }
        return ans;
    }
}
