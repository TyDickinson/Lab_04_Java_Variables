public class Main
{
    public static void main(String[] args)
    {
        // intOperandA, intOperandB, intSum, intProduct, intDifference, intQuotient, intModulo
        int intOperandA = 8;
        int intOperandB = 2;
        int intSum = 0;
        int intDifference = 0;
        int intProduct = 0;
        int intQuotient = 0;
        int intModulo = 0;

        intSum = intOperandA + intOperandB;
        intDifference = intOperandA - intOperandB;
        intProduct = intOperandA * intOperandB;
        intQuotient = intOperandA / intOperandB;
        intModulo = intOperandA % intOperandB;

        System.out.println("The sum of " + intOperandA + " and " + intOperandB + " is " + intSum);
        System.out.println("The difference of " + intOperandA + " and " + intOperandB + " is " + intDifference);
        System.out.println("The product of " + intOperandA + " and " + intOperandB + " is " + intProduct);
        System.out.println("The quotient of " + intOperandA + " and " + intOperandB + " is " + intQuotient);
        System.out.println("The modulo of " + intOperandA + " and " + intOperandB + " is " + intModulo);

        // doubleOperandA, doubleOperandB, doubleSum, doubleProduct, doubleDifference, doubleQuotient, doubleModulo

        double doubleOperandA = 25.1;
        double doubleOperandB = 5.6;

        double doubleSum = doubleOperandA + doubleOperandB;
        double doubleDifference = doubleOperandA - doubleOperandB;
        double doubleProduct = doubleOperandA * doubleOperandB;
        double doubleQuotient = doubleOperandA / doubleOperandB;
        double doubleModulo = doubleOperandA % doubleOperandB;

        System.out.println("The sum of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum);
        System.out.println("The difference of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference);
        System.out.println("The product of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct);
        System.out.println("The quotient of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient);
        System.out.println("The modulo of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleModulo);
    }
}