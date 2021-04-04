import java.sql.Time;

public class Ex_19_1a {
  public static void main(String[] args) {

    // バイトの開始時間と終了時間をコマンドライン引数から受け取る
    Time startTime = Time.valueOf(args[0]);
    Time finishTime = Time.valueOf(args[1]);

    // getTimeメソッドを使って労働時間をミリ秒（0.001秒単位）で取得する
    // ※getTime()メソッドの戻り値はlong型であることに注意
    long workingTime = finishTime.getTime() - startTime.getTime();
    Ex_19_1b instanceB = new Ex_19_1b();
    int restTime = instanceB.getRestTime(workingTime);
    long workingTimeWithoutRest = workingTime - restTime;

    Ex_19_1c instanceC = new Ex_19_1c();
    int salary = instanceC.calcSalary(workingTimeWithoutRest);
    System.out.println(salary);
  }
}
