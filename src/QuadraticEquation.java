public class QuadraticEquation {
    double number1;
    double number2;
    double number3;

    QuadraticEquation(double number1, double number2, double number3) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }
    double denTa() {
        return number2 * number2 - 4 * number1 * number3;
    }
    double getRoot1() {
          return (-number2 + Math.sqrt(this.denTa())) / 2 * number1;
    }
    double   getRoot2() {
         return (-number2 - Math.sqrt(this.denTa()) )/ 2 * number1;

    }

}
