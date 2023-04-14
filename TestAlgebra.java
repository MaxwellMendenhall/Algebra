import java.util.Arrays;
import java.util.Random;

public class TestAlgebra {
	
	static Random rand = new Random();

    public static void main(String[] args) {

    	double[] x = {1, 2, 3};
    	
    	double[] y = {4, 5, 6};
    	
    	//prints out the "x" array as a toString 
    	System.out.println("Array x numbers = "+Arrays.toString(x) + "\n" + "Array y numbers = "+Arrays.toString(y));
    	
    	Node node = randOperator(randOperator(flipCoin(), flipCoin()), randOperator(flipCoin(), flipCoin()));
    	System.out.println(node + " = " + node.eval(x));
    	
    	Node node1 = randOperator(randOperator(flipCoin(), flipCoin()), randOperator(flipCoin(), flipCoin()));
    	System.out.println(node1 + " = " + node1.eval(y));

        Node node2 = randOperator(randOperator(randOperator(flipCoin(), flipCoin()), randOperator(flipCoin(), flipCoin())), randOperator(randOperator(flipCoin(), flipCoin()), randOperator(flipCoin(), flipCoin())));
    	System.out.println(node2 + " = " + node2.eval(y));
    	
		
    }
    public static Node flipCoin() {
    	int randCoin = rand.nextInt(2)+1;
    	if(randCoin == 1) {
    		return randConstant();
    	}else if(randCoin == 2) {
    		return randVariable();
    	}
		return null;
    }
    public static Node randVariable() {
        int randInt = rand.nextInt(3) + 1;
        switch(randInt) {
        case 1: return new Variable(0);
        case 2: return new Variable(1);
        case 3: return new Variable(2);
        }
        return null;
    }
    public static Node randVariable0() {
    	return new Variable(0);
    }
    public static Node randVariable1() {
    	return new Variable(1);
    }
    public static Node randVariable2() {
    	return new Variable(2);
    }
    public static Binop randOperator(Node l, Node r) {
    	int randInt = rand.nextInt(4) + 1;
    	switch(randInt) {
    	case 1: return new Plus(l,r);
    	case 2: return new Divide(l,r);
    	case 3: return new Minus(l,r);
    	case 4: return new Mult(l,r);
    	}
    	return null;
    		
    }
    public static Node randConstant() {
    	int constant = rand.nextInt(20) + 1;
    	
    	return new Const(constant);
    }
}
