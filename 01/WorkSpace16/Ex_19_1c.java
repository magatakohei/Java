public class Ex_19_1c {
  public int calcSalary(long workingTime) {
    final long ONE_HOUR_BY_MILLI_SEC = 1000 * 60 * 60; // 1時間のミリ秒換算
    final int HOURLYWAGE = 900;
    final int BORDER_HOUR = 8;
    final double OVERTIME_WAGE_RATE = 1.25;

    int workingHour = (int) (workingTime / ONE_HOUR_BY_MILLI_SEC); // 時間に換算
    int salary = 0;

    if (workingHour < BORDER_HOUR) {
      salary = (int) (HOURLYWAGE * workingTime / ONE_HOUR_BY_MILLI_SEC);
    } else {
      long overtimeHour = workingTime - BORDER_HOUR * ONE_HOUR_BY_MILLI_SEC;
      salary += (HOURLYWAGE * BORDER_HOUR);
      salary += (HOURLYWAGE * overtimeHour / ONE_HOUR_BY_MILLI_SEC * OVERTIME_WAGE_RATE);
    }
    return salary;
  }
}
