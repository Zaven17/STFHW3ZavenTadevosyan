public class FourMethods {
    //Method 1
    public static boolean stringCompare(String a, String b){
        boolean result = true;
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i) != b.charAt(i)){
                result = false;
            }
        }
        return result;
    }

    //Method 2
    public static String isEven(int a){
        if (a % 2 == 0)
           return  "The number is even";
        else
            return "The number is odd";
    }
    //Method 3
    public static String Menu(int a){
        String result;
        switch (a){
            case 1:
                result = "Opening Contacts...";
                break;
            case 2:
                result = "Opening Messages...";
                break;
            case 3:
                result = "Opening Instagram...";
                break;
            case 4:
                result ="Opening Facebook...";
                break;
            default:
                result = "No input";
                break;
        }
        return result;
    }

    //Method 4
    public static int factorial(int a){
        if (a == 0 || a == 1){
            return 1;
        }else {
            for (int i = a-1; i > 1; i--) {
                a *= i;
            }
        }
        return a;
    }
}
