public class Calculator {
    private double firstNumber;
    private double secondNumber;


    public Calculator(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

        public double add(){
            return firstNumber + secondNumber;

        }

        public double subtract(){
        return firstNumber - secondNumber;
    }
        public double divide(){
        return firstNumber/secondNumber;
        }

        public double multiply(){
        return firstNumber*secondNumber;
        }
}
