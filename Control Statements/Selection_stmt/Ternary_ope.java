package Selection_stmt;
public class Ternary_ope {

    public static void main(String[] args) {
        int age = 7;
        String result = (age >= 18)? "Adult" : "Minor";
        System.out.println(result);

        int num = 7;
        String result1 = (num == 7)? "Both are same" : "Not same";
        System.out.println(result1);
    }
}