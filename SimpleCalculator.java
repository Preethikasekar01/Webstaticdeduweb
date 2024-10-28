import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        double num1 =scanner.nextDouble();
        System.out.println("Enter second number:");
        double num2 = scanner.nextDouble();
        System.out.println("Enter an operator(+,-,*,/):");
        char operator = scanner.next().charAt(0);

        double result;
        //Perform operator based on the entered operator
        if (operator=='+') {
          result = num1 + num2;
          System.out.println("Result:"+result);
        }else if (operator =='-') {
            result = num1-num2;
            System.out.println("Result:"+result);
        }else if (operator =='*') {
             result =num1 * num2;
             System.out.println("Result:"+result);
        }else if (operator =='/') {

            if(num2 !=0) {
                result=num1 / num2;
                System.out.println("Result:"+result);
            }else{
                System.out.println("Error:Division by zero.");
              }    
            }else{
                System.out.println("invalid operator.");
            }
           scanner.close();       
        }     

        }
