package jp.techacademy.yoshihide.nishimoto.javalog;

import android.util.Log;

public class Human extends Animal implements Thinkable{

    private String hobby;

    public Human(String name, int age, String hobby) {
        super.name = name;
        super.age = age;
        this.hobby = hobby;
    }

    @Override
    public void think() {
        Log.d("javatest", "私は" + this.hobby + "について考える。");
    }

    // メンバ関数
    public void say() {
        Log.d("javatest", "私の名前は" + this.name + "です。年は" + this.age + "歳です。");
    }

}
