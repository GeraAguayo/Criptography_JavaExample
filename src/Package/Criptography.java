package Package;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;


public class Criptography {
    int userNumber;
    private int FinalNumber;

    public int codeNumber(){

        ArrayList<Integer> digits = new ArrayList<Integer>();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number, digit by digit");

        //Ask for the user number
        for(int i= 0; i < 4; i++){
            try{
                int digit;
                System.out.print("Enter your digit: ");
                digit = input.nextInt();
                digits.add(digit);

            }catch (InputMismatchException ime){
                digits.clear();
                System.out.println("Enter only integer numbers");
                System.out.println("");
                codeNumber();
            }
        }


        //A copy of the decrypted data
        ArrayList<Integer> dataWhitoutEncryptation = new ArrayList<Integer>(digits);
        int a = dataWhitoutEncryptation.get(0);
        int b = dataWhitoutEncryptation.get(1);
        int c = dataWhitoutEncryptation.get(2);
        int d = dataWhitoutEncryptation.get(3);

        int oldNumber =  Integer.valueOf(String.valueOf(a) + String.valueOf(b) + String.valueOf(c) + String.valueOf(d) );


        //Add the digits to the array list
        int numberA = digits.get(0);
        int numberB = digits.get(1);
        int numberC = digits.get(2);
        int numberD = digits.get(3);

        //Encrypt the digits
        numberA = (numberA + 7) % 10;
        numberB = (numberB + 7) % 10;
        numberC = (numberC + 7) % 10;
        numberD = (numberD + 7) % 10;

        digits.clear();
        digits.add(0, numberC);
        digits.add(1, numberD);
        digits.add(2, numberA);
        digits.add(3, numberB);

        numberA = digits.get(0);
        numberB = digits.get(1);
        numberC = digits.get(2);
        numberD = digits.get(3);

        //Make all the array data one var
        int encryptedNumber = Integer.valueOf(String.valueOf(numberA) + String.valueOf(numberB) + String.valueOf(numberC) + String.valueOf(numberD) );

        System.out.println("The number you enter: "+oldNumber);
        System.out.println("Your encrypted number: "+encryptedNumber);




        return encryptedNumber;
    }



}
