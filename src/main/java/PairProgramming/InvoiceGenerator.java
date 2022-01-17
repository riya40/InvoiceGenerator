package PairProgramming;

public class InvoiceGenerator {
    private int Minimun_cost;
    private double Minimun_cost_Perkilometer = 10;
    int cost_pertime = 1;

    public double calculateFare(double distance, int time){
        double total_fare = distance*Minimun_cost_Perkilometer+time*cost_pertime;
        if(total_fare < Minimun_cost_Perkilometer){
            return Minimun_cost_Perkilometer;
        }
        else {
            return total_fare;
        }
    }
}