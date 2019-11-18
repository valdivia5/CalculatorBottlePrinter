public class Calculator {
    private Integer number1;
    private Integer number2;

    public Calculator(Integer number1, Integer number2){
        this.number1 = number1;
        this.number2 = number2;
    }

    public int add(){
        return this.number1 + this.number2;
    }

    public int subtract() {
        return this.number1 - number2;
    }

    public int multiply() {
        return this.number1 * this.number2;
    }

    public double divide() {
        double double1 = this.number1.doubleValue();
        double double2 = this.number2.doubleValue();
        return double1 / double2;
    }
}
