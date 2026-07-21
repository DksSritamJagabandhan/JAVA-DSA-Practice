import java.util.ArrayList;

public class subsequence {
    public static void main(String[] args) {
        subseq("", "abc");
        ArrayList<String> ans = subseqList("", "abc");
        System.out.println(ans);
    }
    static void subseq(String empty,String str){ 
        if (str.isEmpty()) {
            System.out.println(empty);
            return;
        }
        char ch = str.charAt(0);
        subseq(empty+ch, str.substring(1));
        subseq(empty, str.substring(1));
    }
    static ArrayList<String> subseqList(String empty,String str){
        if (str.isEmpty()) {
            ArrayList<String> list=new ArrayList<>();
            list.add(empty);
            return list;
        }
        char ch = str.charAt(0);
        ArrayList<String> left = subseqList(empty+ch, str.substring(1));
        ArrayList<String> right = subseqList(empty, str.substring(1));
        left.addAll(right);
        return left;
    }
}
