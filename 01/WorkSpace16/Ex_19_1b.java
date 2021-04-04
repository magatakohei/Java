class Ex_19_1b {
  int getRestTime(long workingTime) {
    final long ONE_HOUR_BY_MILLI_SEC = 1000 * 60 * 60; // 1時間のミリ秒換算
    final long ONE_MIN_BY_MILLI_SEC = 1000 * 60; // 1分のミリ秒換算

    int restTime = 0;
    // ミリ秒で取得した労働時間を○時間△分の形式に直す
    int workingHour = (int) (workingTime / ONE_HOUR_BY_MILLI_SEC); // 時間に換算

    if (6 < workingHour && workingHour < 8) {
      restTime = 45 * (int) ONE_MIN_BY_MILLI_SEC;
    } else if (workingHour >= 8) {
      restTime = 60 * (int) ONE_MIN_BY_MILLI_SEC;
    }
    return restTime;
  }
}
