package jp.techacademy.critical_bug.javalog;

import android.util.Log;

public class Human extends Animal implements Thinkable {

    private String hobby;

    Human(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    @Override
    public void say() {
        Log.d("javatest", "私の名前は" + name + "です。年は" + age + "歳です。");
    }

    @Override
    public void think() {
        Log.d("javatest", "私は" + hobby + "について考える");
    }
}
