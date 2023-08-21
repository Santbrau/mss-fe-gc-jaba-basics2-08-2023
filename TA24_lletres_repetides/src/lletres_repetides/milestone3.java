package lletres_repetides;

public class milestone3 {

	public static void main(String[] args) {
        int hour = 0;
        int minutes = 0;
        int seconds = 0;
        
        while (true) {
            System.out.printf("%02d:%02d:%02d%n", hour, minutes, seconds);
            seconds++;
            if (seconds == 60) {
                seconds = 0;
                minutes++;
                if (minutes == 60) {
                    minutes = 0;
                    hour++;
                    if (hour == 24) {
                        hour = 0;
                    }
                }
            }
            
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}