package employee;

public class BasePlusCommissionEmployee extends CommissionedEmployee{

    private double baseSalary;


    public BasePlusCommissionEmployee(String firstN, String lastN, String socialSN, double grossSales, double commmissionRate, double baseSalary){
        super(firstN, lastN, socialSN, grossSales, commmissionRate);
        this.baseSalary = baseSalary;
    }


    @Override
    public double earnings(){
        return getBaseSalary() + super.earnings();
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
