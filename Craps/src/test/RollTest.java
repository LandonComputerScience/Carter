package test;

import sh.rise.Die;



public class RollTest {

    public static void main(String[] args) {
        Die die = new Die();
        for (int i = 0; i < 6; i++){
            die.roll();
            System.out.println("Roll " + i + ": " + die.getNumDots());
        }
    }

}
