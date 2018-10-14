import java.util.Scanner;

class Main1001 {
    static int sum(int n){
        int total = 0;
        for(int i=0; i<=n; ++i){
            total += i;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        while(reader.hasNext()){
            int n = reader.nextInt();
            System.out.println(sum(n));
            System.out.println();
        }
    }
}
