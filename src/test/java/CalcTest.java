import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class CalcTest {

    @Test
    @DisplayName("Addition test")
    public void addTwoNumbers(){
        Calculator calculator = new Calculator();
        int actualResult = calculator.add(15,10);
        Assertions.assertEquals( 25, actualResult);
    }

    @Test
    @DisplayName("Subtraction test")
    public void subtractTwoNumbers(){
        Calculator calculator = new Calculator();
        int actualResult = calculator.subtract(35,10);
        Assertions.assertEquals( 25, actualResult);
    }

    @Test
    @DisplayName("Multiplication test")
    public void multiplyTwoNumbers(){
        Calculator calculator = new Calculator(); //test
        int actualResult = calculator.multiply(5,5);
        Assertions.assertEquals( 25, actualResult);
    }

    @Test
    @DisplayName("Division test")
    public void divideTwoNumbers(){
        Calculator calculator = new Calculator();
        int actualResult = calculator.divide(50,2);
        Assertions.assertEquals( 25, actualResult);
    }

}
