import java.util.Scanner;
class Main {

    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);
        String str= "";
        System.out.println("What is your name?");
        str=kb.nextLine();
        System.out.println("Hello, "+str+", nice to meet you!");
    }
}
