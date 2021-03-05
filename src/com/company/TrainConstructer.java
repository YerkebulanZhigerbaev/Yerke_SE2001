package com.company;

public class TrainConstructer implements IHealth {


    private double weight;
    private double strengh;
    private double km;

    public void HardestWorkerInTheGym() {
    }

    public TrainConstructer(double weight, double km,double strengh) {
        this.weight = weight;
        this.km = km;
        this.strengh = strengh;
    }

    public void power(){
        strengh++;
    }

    public void upForMonth(){
        strengh += (strengh * 0.5);
    }


    @Override
    public void down() {
        System.out.println("Sleep, skip trainings");
        strengh -= (strengh * 0.25);
    }

    @Override
    public String toString() {
        return "TrainConstructer{" +
                "weight=" + weight +
                ", strengh=" + strengh +
                ", km=" + km +
                '}';
    }
}
