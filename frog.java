public class main {
    public static void main(String[] args){
        int[] jump = {5, 3, 2 };
        int[] interval = {2, 3, 5 };
        int x = 0;
        int inputs = 17;   //Distance that supposed to travel tests : 10, 11 , 15, 17, 20 , 22
        int time = 0;
        int distance = 0;
        System.out.println("Steps = ");
        while(x < inputs) {
            for (int i = 0; i < jump.length; ++i){
                System.out.println(jump[i]);
                x += jump[i];
                if (x < inputs){
                    time += interval[i];
                } else {
                    if (x == inputs){
                        distance = x;
                        break;
                    } else {
                        distance = x;
                        break;
                    }
                }
            }

        }

        System.out.println("Total Distance = " + distance);
        System.out.println("Total waiting time = " + time);
    }
}
