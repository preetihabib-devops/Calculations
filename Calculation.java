class Operations {    
    int add(int a, int b) {
        return a + b;
    }

    int sub(int a, int b) {
        return a - b;
    }

    int mul(int a, int b) {
        return a * b;
    }

    int div(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error");
            return 0; 
        }
    }
}

public class Calculation {
    public static void main(String[] args) {
        Operations calc = new Operations(); 
        System.out.println("Addition: " + calc.add(9, 2));
        System.out.println("Subtraction: " + calc.sub(6, 3));
        System.out.println("Multiplication: " + calc.mul(2, 4));
        System.out.println("Division: " + calc.div(6, 3));
    }
}
