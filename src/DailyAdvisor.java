public class DailyAdvisor implements Advisor{
    @Override
    public void advise(Day day) {
        switch (day) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY -> {
                System.out.println("Робіть перерви кожні 45 хвилин.");
                break;
            }
            case FRIDAY -> {
                System.out.println("Happy Friday!");
                break;
            }
            case SATURDAY, SUNDAY -> {
                System.out.println("Вихідні — чудовий час відвідати парк");
                break;
            }
        }
    }
}
