package employee;

public class SalariedEmployee extends Employee {

    //weekly salary
    private double weeklySal; //weekly salary


    public SalariedEmployee(String firstN, String lastN, String socialSN, double weeklySal){
        super(firstN, lastN, socialSN);
        this.weeklySal = weeklySal;
    }


    @Override
    public double earnings(){
        return getWeeklySal(); //use get method so that anyone could get it from anywhere
    }



    public double getWeeklySal() {
        return weeklySal;
    }

    public void setWeeklySal(double weeklySal) {
        this.weeklySal = weeklySal;
    }



    @Override
    public String toString() {
        return super.toString();
    }
}
