
public class Main {
    public static void main(String[] args) {
//Task 2
        int initial = 100;
        int replenishment = 1000;
        int bonus;
        if (replenishment > 1000) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }
        int account = initial + replenishment + bonus;
        System.out.println("Account =" + account);
    }
}

