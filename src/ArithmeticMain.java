import java.util.Scanner;


public class ArithmeticMain {

    public static void main(String[] args) {
        //提示用户输入的参数
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入生成题目的个数（1-10000）");
        int excNum = scanner.nextInt();
        System.out.println("请输入题目的最大数值（一般是1或其他自然数）");
        int value = scanner.nextInt();
        //生成多少道题目就循环多少次
        for ( int i=0; i < excNum ; i++){
            //把生成出来的题目写入文件
            GoFile.StringToFile(newExc(value));
        }

    }
    //假分数转换成真分数
    private static String FtoT(Fraction fraction) {
        int i = 0;
        int Numerator = fraction.getNumerator();
        int Denominator = fraction.getDenominator();
        //分子大于分母
        while (Numerator >= Denominator){
            Numerator -= Denominator;
            i++;
        }
        if(i==0 && Numerator!=0){
            //真分数
            return Numerator + "/" + Denominator;
        }else if(Numerator == 0){
            //整数
            return i +"";
        }
        else {
            //带分数
            return i+"`"+Numerator + "/" + Denominator;
        }
    }
    //生成四则运算和答案  并写入对应文件中
    public static String  newExc(int value) {
        //随机生成分子和分母，分子范围是小于value  分母指定小于100
        int FenZi1 = 1 + (int)(Math.random() * (value));
        int FenMu1 = 1 + (int)(Math.random() * (10));
        Fraction Fnum1 = new Fraction(FenZi1, FenMu1);
        String num1 = FtoT(Fnum1);
        //随机生成分子和分母，分子范围是小于value  分母指定小于100
        int FenZi2 = 1 + (int)(Math.random() * (value));
        int FenMu2 = 1 + (int)(Math.random() * (10));
        Fraction Fnum2 = new Fraction(FenZi2, FenMu2);
        String num2 = FtoT(Fnum2);
        //随机生成分子和分母，分子范围是小于value  分母指定小于100
        int FenZi3 = 1 + (int)(Math.random() * (value));
        int FenMu3 = 1 + (int)(Math.random() * (10));
        Fraction Fnum3 = new Fraction(FenZi3, FenMu3);
        String num3 = FtoT(Fnum3);
        //生成两个随机数（1.2.3.4）
        //1表示+  2表示-  3表示*  4表示/
        int randomNum1 = 1 + (int)(Math.random() * (4));
        int randomNum2 = 1 + (int)(Math.random() * (4));
        String str1 = " ";
        String str2 = " ";
        //结果的分数表示
        Fraction resultF = null;
        //判断是哪一个运算符号
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
        //判断是哪一个运算符号
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
        int randomNum3 = 1 + (int)(Math.random() * (2));
        if (randomNum3 == 1){
            //下面进行分组  因为是确定了是两个运算符的运算
            //使用有16种可能的四则运算
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
        }
        else {
            //1
            if (randomNum1 == 1){ resultF = Fnum1.add(Fnum2); }
            //2
            if (randomNum1 == 2){ resultF = Fnum1.minus(Fnum2); }
            //3
            if (randomNum1 == 3){ resultF = Fnum1.multiply(Fnum2);}
            //4
            if (randomNum1 == 4){ resultF = Fnum1.divide(Fnum2);}

        }



        assert resultF != null;
        if (resultF.getNumerator() < 0  || resultF.getNumerator()/ resultF.getDenominator() > value){
            //判断分子是否为负数  如果是就重新生成一个
            //判断结果是否大于value
            return newExc(value);
        }else {
            //计算结果并把结果写入文件
            GoFile.ResultToFile(FtoT(resultF));
            if (randomNum3 == 1){
                return "("+FtoT(Fnum1.simplify())+")"+" "+str1+" "+"("+FtoT(Fnum2.simplify())+")" +" "+ str2 +" "+ "("+FtoT(Fnum3.simplify())+")" + " = ";
            }else {
                return "("+FtoT(Fnum1.simplify())+")"+" "+str1+" "+"("+FtoT(Fnum2.simplify())+")" +" "+ " = ";
            }

        }

    }

}
