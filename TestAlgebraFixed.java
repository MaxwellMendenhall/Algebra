/**
 * Code Test Author: David G. Cooper
 * Purpose: Test Homework 6
 */
public class TestAlgebraFixed {

    public static void main(String[] args) {
        Node n1 = new Variable(0);
        Node n2 = new Const(3.1);
        Node n3 = new Const(1.3);
        Node n4 = new Variable(1);
        Node n5 = new Const(2.0);
        Node n6 = new Const(2.3);
        Node n7 = new Variable(2);

        Node n8 = new Minus(n1, n2);
        Node n9 = new Divide(n4, n5);
        Node n10 = new Minus(n3,n9);
        Node n11 = new Minus(n6,n7);
        Node n12 = new Mult(n10,n11);
        Node n13 = new Plus(n8,n12);
        
        double[] x = {10.1,0.6,0.3};
        System.out.println("When {X0,X1,X2} = {" + x[0] + "," + x[1] + "," + x[2] + "}:");
        System.out.println(n13.toString() + " = "+ n13.eval(x));
        System.out.println("The answer above should evaluate to 9.0");
        if(Math.abs(n13.eval(x) - 9.0) < 0.00001) {
            System.out.println("Test (a) Passes");
        } else {
            System.out.println("Test (a) Fails");
        }

        double[] y = {3.1,0.0,1.3};
        System.out.println("When {X0,X1,X2} = {" + y[0] + "," + y[1] + "," + y[2] + "}:");
        System.out.println(n13.toString() + " = "+ n13.eval(y));
        System.out.println("The answer above should evaluate to 1.3");
        if(Math.abs(n13.eval(y) - 1.3) < 0.00001) {
            System.out.println("Test (b) Passes");
        } else {
            System.out.println("Test (b) Fails");
        }
    }
}
