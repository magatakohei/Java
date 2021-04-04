import java.sql.Time;

public class Ex_19_2a {
  public int getSalary(Time startTime, Time finishTime) {

    // getTimeメソッドを使って労働時間をミリ秒（0.001秒単位）で取得する
    // ※getTime()メソッドの戻り値はlong型であることに注意
    long workingTime = finishTime.getTime() - startTime.getTime();
    Ex_19_1b instanceB = new Ex_19_1b();
    int restTime = instanceB.getRestTime(workingTime);
    long workingTimeWithoutRest = workingTime - restTime;

    Ex_19_1c instanceC = new Ex_19_1c();
    int salary = instanceC.calcSalary(workingTimeWithoutRest);
    return salary;
  }
}
