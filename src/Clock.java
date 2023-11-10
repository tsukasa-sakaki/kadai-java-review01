
public class Clock {

    public static void main(String[] args) {
      //int型2つの引数を持つgetSecondsメソッドを呼び出す
        int seconds = getSeconds(18, 32, 47);
        System.out.println(seconds);
    }

    //int型引数を3つ受け取るaddメソッドの定義（戻り値なし）
    public static int getSeconds(int hours, int minutes, int seconds) {
        int result = 60 * 60 * hours + 60 * minutes + seconds;
        return result;
    }

}
