import java.util.ArrayList;

public class diceProblem {
    public static void main(String[] args) {
        dice("", 4);
        ArrayList<String> ans = diceList("", 4);
        System.out.println(ans);
    }
    static void dice(String emp,int target){
        if (target == 0) {
            System.out.println(emp);
            return;
        }
        for (int i = 1; i<=6 && i<=target; i++) {
            dice(emp+i, target-i);
        }
    }

    static ArrayList<String> diceList(String emp,int target){
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(emp);
            return list;
        }
        ArrayList<String> result = new ArrayList<>();
        for (int i = 1; i<=6 && i<=target; i++) {
            result.addAll(diceList(emp+i, target-i));
        }
        return result;
    }
}
