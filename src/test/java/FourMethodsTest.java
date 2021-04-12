import org.testng.annotations.Test;


import static org.testng.Assert.assertEquals;

public class FourMethodsTest {
    //Method 1
    @Test
    public void stringCompare(){
       String a = "Zaven";
       String b = "Zaven";
       String c = "barev";
       boolean result = FourMethods.stringCompare(a,b);
       boolean result1 = FourMethods.stringCompare(a,c);
       assertEquals(false,result1);
       assertEquals(true, result);
    }

    //Method 2
    @Test
    public void isEven(){
        int a = 3;
        int b = 6;
        String result = FourMethods.isEven(a);
        String result1 = FourMethods.isEven(b);
        assertEquals("The number is even",result1);
        assertEquals("The number is odd", result);
    }
    //Method 3
    @Test
    public void Menu(){
       int a = 1;
       int b = 2;
       int c = 3;
       int d = 4;
       int e = 13;
       String result = FourMethods.Menu(a);
       String result1 = FourMethods.Menu(b);
       String result2 = FourMethods.Menu(c);
       String result3 = FourMethods.Menu(d);
       String result4 = FourMethods.Menu(e);
       assertEquals("Opening Contacts...", result);
       assertEquals("Opening Messages...", result1);
       assertEquals("Opening Instagram...", result2);
       assertEquals("Opening Facebook...", result3);
       assertEquals("No input", result4);

    }

    //Method 4
    @Test
    public  void factorial(){

        int b = 0;
        int c = 1;
        int a = 5;
        int result = FourMethods.factorial(a);
        int result1 = FourMethods.factorial(b);
        int result2 = FourMethods.factorial(c);
        assertEquals(120,result);
        assertEquals(1,result1);
        assertEquals(1,result2);

    }

}
