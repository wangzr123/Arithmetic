import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;
import java.util.function.Function;

public class ArithmeticMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入生成题目的个数（1-10000）");
        int excNum = scanner.nextInt();
        System.out.println("请输入题目的最大数值（一般是1或其他自然数）");
        int value = scanner.nextInt();

        for ( int i=0; i<excNum ; i++){
            System.out.println(newExc(value));
        }


//        Fraction f1 = new Fraction(5, 2);
//        Fraction f2 = new Fraction(2, 4);
//        System.out.println(FtoT(f1.simplify()));
//        System.out.println(FtoT(f2.simplify()));
//        System.out.println(FtoT(f1.add(f2)));
//        System.out.println(FtoT(f1.minus(f2)));
//        System.out.println(FtoT(f1.multiply(f2)));
//        System.out.println(FtoT(f1.divide(f2)));

    }
    //假分数转换成真分数
    private static String FtoT(Fraction fraction) {
        int i = 0;
        int Numerator = fraction.getNumerator();
        int Denominator = fraction.getDenominator();

        while (Numerator >= Denominator){
            Numerator -= Denominator;
            i++;
        }
        if(i==0){
            return Numerator + "/" + Denominator;
        }else if(Numerator == 0){
            return i +"";
        }
        else {
            return i+"`"+Numerator + "/" + Denominator;
        }
    }
    //
    private static String  newExc(int value) {
        //
        int randomNum1 = 1 + (int)(Math.random() * (4));
        int randomNum2 = 1 + (int)(Math.random() * (4));
        //
        String str1 = " ";
        String str2 = " ";
        //
        if (randomNum1 == 1){
            str1 = "+";
        }else if(randomNum1 == 2){
            str1 = "-";
        }else if(randomNum1 == 3){
            str1 = "*";
        }else {
            str1 = "/";
        }
        //
        if (randomNum2 == 1){
            str2 = "+";
        }else if(randomNum2 == 2){
            str2 = "-";
        }else if(randomNum2 == 3){
            str2 = "*";
        }else {
            str2 = "/";
        }
        //
        int FenZi1 = 1 + (int)(Math.random() * (value));
        int FenMu1 = 1 + (int)(Math.random() * (value));
        Fraction Fnum1 = new Fraction(FenZi1, FenMu1);
        String num1 = FtoT(Fnum1);
        //
        int FenZi2 = 1 + (int)(Math.random() * (value));
        int FenMu2 = 1 + (int)(Math.random() * (value));
        Fraction Fnum2 = new Fraction(FenZi2, FenMu2);
        String num2 = FtoT(Fnum2);
        //
        int FenZi3 = 1 + (int)(Math.random() * (value));
        int FenMu3 = 1 + (int)(Math.random() * (value));
        Fraction Fnum3 = new Fraction(FenZi3, FenMu3);
        String num3 = FtoT(Fnum3);
        //
        return "("+num1+")"+" "+str1+" "+"("+num2+")" +" "+ str2 +" "+ "("+num3+")" + " = ";


    }

}
