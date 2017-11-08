package sh.rise;

import java.util.Random;

public class Die {

    private int result;
    private static final int MIN = 1;

    public void roll(){
        Random rand = new Random();
        result = rand.nextInt(5) + 1;
    }

    public int getNumDots(){
        return result;
    }
}
