package employee;

public class HourlyEmployee extends Employee{
    //wage
    //hours
    private double wage;
    private double hours;

    public HourlyEmployee(String firstN, String lastN, String socialSN, double wage, double hours){
        super(firstN, lastN, socialSN);
        this.wage = wage;
        this.hours = hours;
    }

    //earnings method
    @Override
    public double earnings(){
        return getWage() * getHours();
    }




    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }



    //toString
    @Override
    public String toString() {
        return super.toString();
    }

}
