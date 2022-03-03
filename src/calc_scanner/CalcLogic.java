package calc_scanner;

public class CalcLogic {
    double num1;
    double num2;

    public CalcLogic(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Double dodawanie() {
       return this.num1 + this.num2;
    }

}
