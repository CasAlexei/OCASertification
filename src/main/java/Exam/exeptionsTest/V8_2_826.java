package Exam.exeptionsTest;

public class V8_2_826 {

        public static void main(String[] args) {
            try {
                doTest();
            }
//            catch (ArrayIndexOutOfBoundsException are){
//                System.out.println("at line9: " + are);
//            }
//            catch (RuntimeException rte){
//                System.out.println("at line12: " + rte);
//            }
            catch (MyException me) {
                System.out.println("at line15: " + me);
            }
        }

    static void doTest() throws MyException {
        int[] array = new int[10];
        array[10] = 1000;
        doAnotherTest();
    }

    static void doAnotherTest() throws MyException {
        throw new MyException("Exception from doAnotherTest");
    }

    static class MyException extends Exception {
        public MyException(String msg) {
            super(msg);
        }
    }
}
