import org.junit.Test;

public class TestArithmetic {
    /**
     *Test 1:生成1个1以内的题目
     */
    @Test
    public void testFor1_1(){

        GoFile.StringToFile(ArithmeticMain.newExc(1));

        }

    /**
     *Test 2:生成1个5以内的题目
     */
    @Test
    public void testFor1_5(){

        GoFile.StringToFile(ArithmeticMain.newExc(5));

    }

    /**
     *Test 3:生成1个10以内的题目
     */
    @Test
    public void testFor1_10(){

        GoFile.StringToFile(ArithmeticMain.newExc(10));

    }

    /**
     *Test 4:生成5个10以内的题目
     */
    @Test
    public void testFor5_10(){

        for ( int i=0; i < 5 ; i++){
            GoFile.StringToFile(ArithmeticMain.newExc(10));
        }

    }

    /**
     *Test 5:生成100个50以内的题目
     */
    @Test
    public void testFor100_50(){

        for ( int i=0; i < 100 ; i++){
            GoFile.StringToFile(ArithmeticMain.newExc(50));
        }

    }
    /**
     *Test 6:生成1000个100以内的题目
     */
    @Test
    public void testFor1000_100(){

        for ( int i=0; i < 1000 ; i++){
            GoFile.StringToFile(ArithmeticMain.newExc(100));
        }

    }
    /**
     *Test 7:生成10000个1000以内的题目
     */
    @Test
    public void testFor10000_10000(){

        for ( int i=0; i < 10000 ; i++){
            GoFile.StringToFile(ArithmeticMain.newExc(10000));
        }

    }
    /**
     *Test 8:生成500个100以内的题目
     */
    @Test
    public void testFor500_100(){

        for ( int i=0; i < 500 ; i++){
            GoFile.StringToFile(ArithmeticMain.newExc(100));
        }

    }
    /**
     *Test 9:生成2个1以内的题目
     */
    @Test
    public void testFor2_1(){

        for ( int i=0; i < 2 ; i++){
            GoFile.StringToFile(ArithmeticMain.newExc(1));
        }

    }
    /**
     *Test 10:生成5000个1000以内的题目
     */
    @Test
    public void testFor5000_1000(){

        for ( int i=0; i < 5000 ; i++){
            GoFile.StringToFile(ArithmeticMain.newExc(1000));
        }
    }

}
