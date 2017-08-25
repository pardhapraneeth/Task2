package praneeth.com.task2;

/**
 * Created by Veda on 25/08/17.
 */

public class Converter {

    public static double Farenheit(Double c){

            return ((c * 9 / 5.0) + 32);

    }
    public static double Celcius(Double f){

        return ((f - 32)*5)/9;

    }
    public static double miles(Double k){

        return 0.62137119*k;
    }
}
