public class App {
    public static void main(String[] args) throws Exception {
        // DATA TYPES
        int x = 5;
        char c = 'c'; 
        double y = 5.5;
        boolean b = false;
        int w; //declaration
        w=76; //initialization
        int infractedStudents; //camelClasing
        final int CONNY = 5;

        System.out.println(w-3);
        w-=3;
        System.out.println(w);

        //COMPARISON
        boolean boo = false;
        System.out.println(!boo != false);

        //CONDITIONAL
        if(!boo) System.out.println("boo passed");

        //SHORT CIRCUT
        int divisor = 0;
        if(divisor !=0 && 5/divisor > 1) System.out.println("omg");


    }
}
