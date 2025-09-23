 import java.util.Scanner;
 class Labprogram1{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the coefficients: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if(a == 0){
            System.out.println("it is not a quadratic equation");
            System.out.println("enter again: ");
            int p = sc.nextInt();
            a = p;
        } 

        double d = (b*b - 4*a*c);
        double r1 = ((-b) + (Math.sqrt(d)))/(double)(2*a);
        double r2 = ((-b) - (Math.sqrt(d)))/(double)(2*a);

        if(d == 0){

            System.out.println("both roots are equal");
            System.out.println("root is" + r1);

        }

        else if(d > 0){

            System.out.println("roots are different");
            System.out.println("roots are" + r1 + " " + r2);

        }

        else{

            System.out.println("roots are imaginary");
            double a1 = (-b)/(double)(2*a);
            double a2 = (Math.sqrt(-d))/(double)(2*a);
            System.out.println("roots are " + a1 + "+" + a2 + "i");
            System.out.println("roots are " + a1 + "-" + a2 + "i");
        }




    }
}