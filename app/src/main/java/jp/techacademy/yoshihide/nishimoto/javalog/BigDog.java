package jp.techacademy.yoshihide.nishimoto.javalog;

import android.util.Log;

class BigDog extends Dog {

    //クラス変数
    static String to_jp = "犬";

    public BigDog(String name, int age) {
        super(name, age);
    }

    public static void introduce() {
        Log.d("javatest","これは犬型のクラスです。");
    }
}
