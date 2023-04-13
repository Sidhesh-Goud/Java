import java.util.*;
class Age{
    public static void vote (int age){
        if(age<18)
            throw new ArithmeticException("You are not eligible");
        else
            System.out.println("Eligible");
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        vote(sc.nextInt());
    }
}