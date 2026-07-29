package kunal.com;

public class Intro {
   public static void main(String[] args) {

        // A method/function calling another function/method in this program
        message1();
    }

    static void message1(){
        System.out.println("Hello world");
        message2();
    }

    static void message2(){
        System.out.println("Hello world");
        message3();
    }

    static void message3(){
        System.out.println("Hello world");
        message4();
    }

    static void message4(){
        System.out.println("Hello world");
        message5();
    }

    static void message5(){
        System.out.println("Hello world");
    }

}
