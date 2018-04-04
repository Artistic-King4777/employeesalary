package employee;

public class CommissionedEmployee extends Employee{

    private double grossSales;
    private double commissionRate;


    public CommissionedEmployee(String firstN, String lastN, String socialSN, double grossSales, double commmissionRate){
        super(firstN, lastN, socialSN);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    @Override
    public double earnings(){
        return ((commissionRate / 100) * grossSales);
    }


    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }



    @Override
    public String toString() {
        return super.toString();
    }

}
