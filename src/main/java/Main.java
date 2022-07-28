public class Main {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.newFormula()
                .addOperand(15)
                .addOperand(30)
                .calculate(Calculator.Operation.SUM)
                .result());

        Ints intsCalc = new IntsCalculator();   //применение адаптера
        System.out.println(intsCalc.mult(4, 5));
        System.out.println(intsCalc.sum(10, 22));
        System.out.println(intsCalc.pow(2, 10));
    }
}
