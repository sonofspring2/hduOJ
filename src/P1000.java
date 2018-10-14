import java.util.Scanner;

class Main1000{
    static int add(int a, int b){
        return a+b;
    }

    public static void main(String... args){
        Scanner reader = new Scanner(System.in);
        while(reader.hasNext()){
            int a = reader.nextInt();
            int b = reader.nextInt();
            System.out.println(add(a,b));
        }

    }
}