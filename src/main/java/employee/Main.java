package employee;

public class Main {
    public static void main(String[] args) {


        Employee hourEmployee = new HourlyEmployee("Yuzuru", "Soma", "343-44-7255", 350.00, 25.00);

        Employee salaryEmployee = new SalariedEmployee("Tony", "Stark", "555-33-5545", 200000.00);

        Employee commissionEmployee = new CommissionedEmployee("Wade", "Wilson", "666-33-4434", 100, 20);

        Employee basePlusComEmployee = new BasePlusCommissionEmployee("Zee", "Thompsonowak", "777-77-7777", 5000.00, 0.5, 165.50);


        //System.out.println(hourEmployee.earnings());

        //System.out.println(hourEmployee.getFirstName());

        //System.out.println(((CommissionedEmployee) commissionEmployee).getCommissionRate());

        System.out.println(commissionEmployee.earnings());

        System.out.println("================================================");
        Employee[] staff = new Employee[]{hourEmployee, salaryEmployee, commissionEmployee, basePlusComEmployee};


        for(Employee eStaff : staff){
            System.out.println( eStaff.getFirstName() + " | Earnings: $" + eStaff.earnings());
        }




    /*
    DO NOT FORGET

    Create a Main - inside main create an array of each type of employee and
    print out their earnings using the earnings method

     */


    }
}
