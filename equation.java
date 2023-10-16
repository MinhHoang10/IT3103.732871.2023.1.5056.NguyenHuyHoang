//Nguyen Huy Hoang 20215056
import java.util.Scanner;

public class equation {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Equation Solver");
        System.out.println("1. Solve a first-degree equation ( ax + b = 0)");
        System.out.println("2. Solve a system of first-degree equation (a11x1 + a12x2 = b1 a21x1 + a22x2 = b2)");
        System.out.println("3. Solve second-degree equation (ax^2 + bx + c = 0)");
        System.out.println("Enter your choice : ");
        int choice = scanner.nextInt();

        if ( choice == 1 ){
            System.out.println("Enter the value of a :");
            double a = scanner.nextDouble();
            System.out.println("Enter the value of b : ");
            double b = scanner.nextDouble();
            if ( a == 0) {
                if ( b != 0) {
                    System.out.println("Equation has no solution");
                } else {
                    System.out.println("Equation has infinity solution");
                } 
            }else {
                    System.out.println("Equation has 1 solution : " + -b/a);
                }
        }

        else if ( choice == 2) {
            System.out.println("Enter the value of system equation");
            double a11 = scanner.nextDouble();
            double a12 = scanner.nextDouble();
            double b1 = scanner.nextDouble();
            double a21 = scanner.nextDouble();
            double a22 = scanner.nextDouble();
            double b2 = scanner.nextDouble();
            double determinant = a11 * a22 - a12 * a21;
            double determinant1 = b1 * a22 - b2 * a11 ;
            double determinant2 = b1 * a21 - b2 * a12;
            if ( determinant == 0 ){
                if (determinant1 == 0 && determinant2 == 0){
                    System.out.println("System equation has infinity solution");
                } else {
                    System.out.println("System equation has no solution");
                }
            } else {
                double x1 = ( b1 * a22 - b2 * a12) / ( a11 * a22 - a12 * a21);
                double x2 = ( b1 * a21 - b2 * a11) / ( a12 * a21 - a22 * a11);
                System.out.println("System equation has 2 solution x1 = " + x1 + " x2 = " + x2);
            }

        }
        else if ( choice == 3){
            System.out.println("Enter the value of a :");
            double a = scanner.nextDouble();
            System.out.println("Enter the value of b :");
            double b = scanner.nextDouble();
            System.out.println("Enter the value of c :");
            double c = scanner.nextDouble();
            if ( a == 0 ){
                if ( b == 0) {
                if ( c != 0) {
                    System.out.println("Equation has no solution");
                } else {
                    System.out.println("Equation has infinite solutions");
                } 
            }else {
                    System.out.println("Equation has 1 solution : " + -c/b);
                }
            } else {
                double delta = b*b - 4*a*c;
                if ( delta < 0) {
                    System.out.println("Equation has no solution");
                } else if ( delta == 0){
                    System.out.println("Equation has 1 solution : " + -b/(2*a));
                } else {
                    double x1 = (-b + (Math.sqrt(delta))) / ( 2 * a);
                    double x2 = (-b - (Math.sqrt(delta))) / ( 2 * a);
                    System.out.println("Equation has 2 solutions : x1 = " + x1 + " and " + "x2 = " + x2);
                }
            }
        } else {
            System.out.println("Invalid choice");
        }
        scanner.close();
    }
}
