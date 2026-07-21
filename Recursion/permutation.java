import java.util.ArrayList;

public class permutation {
    public static void main(String[] args) {
        permutations("", "abc");
        ArrayList<String> answer = permutationsList("", "abc");
        System.out.println(answer);
        int counting = permutationsCount("", "abc");
        System.out.println(counting);
    }
    static void permutations(String emp,String str){
        if (str.isEmpty()) {
            System.out.println(emp);
            return;
        }
        char ch = str.charAt(0);
        for (int i = 0; i <= emp.length(); i++) {
            String f = emp.substring(0, i);
            String s = emp.substring(i,emp.length());
            permutations(f + ch + s, str.substring(1));
        }
    }
    //ArrayList type output
    static ArrayList<String> permutationsList(String emp,String str){
        if (str.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(emp);
            return list;
        }
        char ch = str.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i <= emp.length(); i++) {
            String f = emp.substring(0, i);
            String s = emp.substring(i,emp.length());
            ans.addAll(permutationsList(f + ch + s, str.substring(1)));
        }
        return ans;
    }
    //count 
    static int permutationsCount(String emp,String str){
        if (str.isEmpty()) {
            return 1;
        }
        char ch = str.charAt(0);
        int count = 0;
        for (int i = 0; i <= emp.length(); i++) {
            String f = emp.substring(0, i);
            String s = emp.substring(i,emp.length());
            count = count + permutationsCount(f + ch + s, str.substring(1));
        }
        return count;
    }
}
