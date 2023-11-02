package _04_01;

import _04_02.before.GoodMorningGreeting;
import _04_02.before.HelloWorldGreeting;

public class Main {

    public static void main(String[] args) {
        HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
        helloWorldGreeting.printMessage();
        GoodMorningGreeting goodMorningGreeting = new GoodMorningGreeting();
        goodMorningGreeting.printMessage();
    }

}
