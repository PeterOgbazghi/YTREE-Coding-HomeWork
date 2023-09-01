package model;

public class Pair {

    private int number;
    private float probability;

    public Pair(int number, float probability) {
        this.number = number;
        this.probability = probability;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public float getProbability() {
        return probability;
    }

    public void setProbability(float probability) {
        this.probability = probability;
    }
}
