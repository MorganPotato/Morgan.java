import java.util.Timer;
import java.util.TimerTask;

public class Cronometro {

    int segundos = 0;

    Timer timer = new Timer();
    TimerTask task = new TimerTask() {
        public void run() {
            segundos++;
            System.out.println("segundos transcurridos: " + segundos);
        }
    };

    public void start() {
        timer.scheduleAtFixedRate(task, 1000, 1000);
    }

    public static void main(String[] args) {
        Cronometro cronometro = new Cronometro();
        cronometro.start();
    }
}