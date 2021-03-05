package com.company;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;



public class Main {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, ClassNotFoundException, NoSuchFieldException {

        IHealth health = new IHealth(){
            @Override
            public void down() {
                System.out.println("U are getting better");
            }
        };
        health.Up();
        health.down();

        final TrainConstructer user = TrainConstructer.class.getConstructor(double.class, double.class, double.class).newInstance(110, 100, 5);
        Field userWeight = TrainConstructer.class.getDeclaredField("weight");
        Field userStrengh = TrainConstructer.class.getDeclaredField("strengh");
        Field userKm = TrainConstructer.class.getDeclaredField("km");
        System.out.println(userWeight + " " + userStrengh + " " + userKm);
        System.out.println(user);
        System.out.println();

    }

}
