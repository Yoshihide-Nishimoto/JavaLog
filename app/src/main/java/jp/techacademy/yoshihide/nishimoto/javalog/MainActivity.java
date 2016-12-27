package jp.techacademy.yoshihide.nishimoto.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int num = 10 + 3 - 2 * 3 / 3;
        Log.d("javatest", " 10 + 3 - 2 * 3 / 3 = " + String.valueOf(num));

        boolean flag1 = true;
        boolean flag2 = false;

        Log.d("javatest", "flag1 && flag2 = " + String.valueOf(flag1 && flag2));
        Log.d("javatest", "flag1 || flag2 = " + String.valueOf(flag1 || flag2));

        int num2 = 10;
        int num3 = 20;

        Log.d("javatest", "num2 < num3 = " + String.valueOf(num2 < num3));

        String str = "hello!" + "world!";
        Log.d("javatest", "str = " + str);

        num = 60;

        if (num >= 90) {
            Log.d("javatest", "優");
        } else if (num >= 75) {
            Log.d("javatest", "良");
        } else if (num >= 60) {
            Log.d("javatest", "可");
        } else {
            Log.d("javatest", "不可");
        }

        int drink = 2;

        switch (drink) {
            case 0:
                Log.d("javatest", "コーヒーを注文しました");
                break;
            case 1:
                Log.d("javatest", "紅茶を 注文しました");
                break;
            case 2:
                Log.d("javatest", "ミルクを注文しました");
                break;
            default:
                Log.d("javatest", "オーダーミスです");
                break;
        }

        for (int i = 1; i < 6; i++) {
            Log.d("javatest", "for文の " + String.valueOf(i) + "回目");
        }

        num = 1;

        while (num < 6) {
            Log.d("javatest", "while文の " + String.valueOf(num) + "回目");
            num++;
        }

        int[] points = new int[5];
        points[0] = 10;
        points[1] = 6;
        points[2] = 15;
        points[3] = 23;
        points[4] = 17;

        for (int i = 0; i < points.length; i++) {
            Log.d("javatest", String.valueOf(points[i]));
        }

        int sum = total(5,10);

        Log.d("javatest", String.valueOf(sum));

        Dog dog = new Dog("クッキー",2);

        dog.say();

        Log.d("javatest", "犬の名前は" + dog.name + "です。");
        Log.d("javatest", "犬の年齢は" + dog.age + "歳です。");

        Dog.introduce();
        Log.d("javatest", Dog.to_jp + "のクラス変数です。");

        BigDog bigdog = new BigDog("カブレラ",12);
        bigdog.say();
        Log.d("javatest","犬の年齢は"+bigdog.age+"歳です。");
        Log.d("javatest","犬の名前は"+bigdog.name+"です。");

        dog.move();

        Human human = new Human("西本",31,"競馬");
        human.say();
        human.think();

    }

    private int total(int first,int last) {

        int sum = 0;
        for (int i = first; i <= last; i++){
            sum = sum + i;
        }

        return sum;

    }
}
