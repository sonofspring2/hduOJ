import java.util.Scanner;

class Main {
    static String add(String s1 , String s2){
        s1 = new StringBuilder(s1).reverse().toString();
        s2 = new StringBuilder(s2).reverse().toString();
        if(s1.length() < s2.length()){
            String tmp = s1;
            s1 = s2;
            s2 = tmp;
        }
        int n1 = s1.length(), n2 = s2.length();

        StringBuilder sb = new StringBuilder();
        int carry = 0;
        for(int i=0; i<n2; ++i){
            int cur = s2.charAt(i)-'0'+s1.charAt(i)-'0'+carry;
            char c = (char)((cur %10)+'0');
            sb.append(c);
            carry = cur /10;
        }
        for(int i=n2; i<n1; ++i){
            int cur = s1.charAt(i)-'0'+carry;
            char c = (char)((cur %10)+'0');
            sb.append(c);
            carry = cur /10;
        }
        if(carry >0){
            sb.append('1');
        }

        sb = sb.reverse();
        return sb.toString();
    }

    public static void main(String... args){
        Scanner reader = new Scanner(System.in);
        int cases = 0;
        cases = reader.nextInt();
        for(int i=1; i<=cases; ++i){
            String s1 = reader.next();
            String s2 = reader.next();
            System.out.println("Case "+i+":");

            System.out.println(s1 +" + "+s2+" = "+add(s1,s2));
            if(i!=cases) System.out.println();
        }

    }
}
