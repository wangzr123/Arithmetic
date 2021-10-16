import java.util.Scanner;


public class ArithmeticMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入生成题目的个数（1-10000）");
        int excNum = scanner.nextInt();
        System.out.println("请输入题目的最大数值（一般是1或其他自然数）");
        int value = scanner.nextInt();

        for ( int i=0; i<excNum ; i++){
            GoFile.StringToFile(newExc(value));
        }

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
    //生成四则运算和答案  并写入对应文件中
    private static String  newExc(int value) {
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

        int randomNum1 = 1 + (int)(Math.random() * (4));
        int randomNum2 = 1 + (int)(Math.random() * (4));
        //
        String str1 = " ";
        String str2 = " ";
        //
        Fraction resultF = null;
        //
        if (randomNum1 == 1){
            str1 = "+";
        }else if(randomNum1 == 2){
            str1 = "-";
        }else if(randomNum1 == 3){
            str1 = "*";
            Fnum1.multiply(Fnum2);
        }else {
            str1 = "/";
            Fnum1.divide(Fnum2);
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

        //1
        if (randomNum1 ==1 && randomNum2==1){ resultF = Fnum1.add(Fnum2).add(Fnum3);}
        //2
        if (randomNum1 ==1 && randomNum2==2){ resultF = Fnum1.add(Fnum2).minus(Fnum3);}
        //3
        if (randomNum1 ==1 && randomNum2==3){ resultF = Fnum2.multiply(Fnum3).add(Fnum1);}
        //4
        if (randomNum1 ==1 && randomNum2==4){ resultF = Fnum2.divide(Fnum3).add(Fnum1);}


        //5
        if (randomNum1 ==2 && randomNum2==1){ resultF = Fnum1.minus(Fnum2).add(Fnum3);}
        //6
        if (randomNum1 ==2 && randomNum2==2){ resultF = Fnum1.minus(Fnum2).minus(Fnum3);}
        //7
        if (randomNum1 ==2 && randomNum2==3){ resultF = Fnum1.minus(Fnum2.multiply(Fnum3));}
        //8
        if (randomNum1 ==2 && randomNum2==4){ resultF = Fnum1.minus(Fnum2.divide(Fnum3));}


        //9
        if (randomNum1 ==3 && randomNum2==1){ resultF = Fnum1.multiply(Fnum2).add(Fnum3);}
        //10
        if (randomNum1 ==3 && randomNum2==2){ resultF = Fnum1.multiply(Fnum2).minus(Fnum3);}
        //11
        if (randomNum1 ==3 && randomNum2==3){ resultF = Fnum1.multiply(Fnum2).multiply(Fnum3);}
        //12
        if (randomNum1 ==3 && randomNum2==4){ resultF = Fnum1.multiply(Fnum2).divide(Fnum3);}


        //13
        if (randomNum1 ==4 && randomNum2==1){ resultF = Fnum1.divide(Fnum2).add(Fnum3);}
        //14
        if (randomNum1 ==4 && randomNum2==2){ resultF = Fnum1.divide(Fnum2).minus(Fnum3);}
        //15
        if (randomNum1 ==4 && randomNum2==3){ resultF = Fnum1.divide(Fnum2).multiply(Fnum3);}
        //16
        if (randomNum1 ==4 && randomNum2==4){ resultF = Fnum1.divide(Fnum2).divide(Fnum3);}

        //
        assert resultF != null;
        if (resultF.getNumerator() < 0){
            return newExc(value);
        }else {
            GoFile.ResultToFile(FtoT(resultF));
            return "("+num1+")"+" "+str1+" "+"("+num2+")" +" "+ str2 +" "+ "("+num3+")" + " = ";
        }

    }

}
