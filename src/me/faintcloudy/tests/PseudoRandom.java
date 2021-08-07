package me.faintcloudy.tests;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PseudoRandom {
    public PseudoRandom()
    {

    }

    Random random = new Random();

    public double random()
    {
        double lastResult = 0.99;
        List<Double> doubles = new ArrayList<>();
        for (int i = 0;i<100;i++)
        {
            lastResult = result(lastResult);
            doubles.add(lastResult);
        }
        System.out.println(doubles);
        return doubles.get(random.nextInt(1));
    }

    public double result(double lastResult)
    {
        return 3.57 * lastResult * (1 - lastResult);
    }
}
