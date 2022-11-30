import java.time.LocalTime;

// TODO add logging
public class Main {
    public static void main(String[] args) throws Exception {
        int work_period = 60 * 60 * 1000;
        int lunch_period = 30 * 60 * 1000;
        System.out.println(LocalTime.now() + " Good morning - your new great workday has started!");
        SoundUtils.tone(440,2000, 0.8);
        Thread.sleep(work_period);
        System.out.println("Stretch!");
        SoundUtils.tone(1000);
        Thread.sleep(work_period);
        System.out.println("Get moving!");
        SoundUtils.doubleTone(1000);
        Thread.sleep(work_period);
        System.out.println("Stretch!");
        SoundUtils.tone(1000);
        Thread.sleep(work_period);
        System.out.println("It's lunchtime - enjoy your meal!");
        SoundUtils.tone(440,2000, 0.8);

        Thread.sleep(lunch_period);

        System.out.println("Back to work!");
        SoundUtils.tone(440,2000, 0.8);
        Thread.sleep(work_period);
        System.out.println("Stretch!");
        SoundUtils.tone(1000);
        Thread.sleep(work_period);
        System.out.println("Get moving!");
        SoundUtils.doubleTone(1000);
        Thread.sleep(work_period);
        System.out.println("Stretch!");
        SoundUtils.tone(1000);
        Thread.sleep(work_period);
        System.out.println(LocalTime.now() + " Good bye - time to go!");
        SoundUtils.tone(440,2000, 0.8);
    }
}
