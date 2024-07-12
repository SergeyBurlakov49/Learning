package Utils;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class DeathTimer {
    public static void main(String[] args) throws InterruptedException {
        LocalDateTime deathTime = LocalDateTime.of(2078, Month.JULY, 24, 0, 0);
        LocalDateTime bornTime = LocalDateTime.of(2003, Month.JULY, 24, 0, 0);
        Duration fromBornToDeath = Duration.between(bornTime, deathTime);
        for (;;){
            System.out.println();
            LocalDateTime now = LocalDateTime.now();
            Duration fromBornToNow = Duration.between(bornTime,now);
            Duration fromNowToDeath = Duration.between(now,deathTime);
            Double percent = (double) fromBornToNow.get(ChronoUnit.SECONDS) / (double) fromBornToDeath.get(ChronoUnit.SECONDS) * 100;
            System.out.printf("Прожитый процент жизни: %.7f%%%n", percent);
            long seconds = fromNowToDeath.getSeconds() % 60;
            long totalMinutes = fromNowToDeath.getSeconds() / 60;
            long minutes = totalMinutes % 60;
            long totalHours = totalMinutes / 60;
            long hours = totalHours % 24;
            long totalDays = totalHours / 24;
            Period period = Period.ofDays((int) totalDays);
            int days = period.getDays() % 30;
            int months = (period.getDays() % 365) / 30;
            int years = period.getDays() / 365;
            System.out.println("Осталось жить - " + seconds + " секунд, " + minutes + " минут, " + hours + " часов, "
            + days + " дней, " + months + " месяцев, " + years + " лет.");
            System.out.println(fromNowToDeath.getSeconds());
            Thread.sleep(1000);
        }
    }
}
