public class Swap{

        public static void main(String[] args){
                swapNumbers(6, 9);
        }

        public static void swapNumbers(int x, int y){
                x=x-y;
                y=x+y;
                x=y-x;
                System.out.println("x = " +x+ " y = " +y);
        }
}
