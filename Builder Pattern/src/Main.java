//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       User user = new User.Builder("sky","yash").age(25).phone("1234").build();
        System.out.println(user.toString());
    }
}