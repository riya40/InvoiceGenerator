package PairProgramming;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class InvoiceGeneratorTest {

    @Test
    public void givenDistanceshouldreturnfare()
    {
        InvoiceGenerator invoicegenerator = new InvoiceGenerator();
        double distance = 25;
        int time = 5;
        double fare = invoicegenerator.calculateFare(distance, time);
        Assertions.assertEquals(25, fare, 0.0);

    }

    @Test
    public void givenlessDistance(){
    InvoiceGenerator invoicegenerator=new InvoiceGenerator();
    double distance=00;
    int time=5;
    double fare = invoicegenerator.calculateFare(distance,time);
        Assertions.assertEquals(5,fare,0.0);
}
}