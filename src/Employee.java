public class Employee {
    String employeeName;
    int employeeNumber;
    String dob;
    String address;
    Designation designation;
    int organisation;
    Employee(){

    }

    Employee(String name, int number, String dob, String address, Designation designation, int Organization) {
        this.employeeName = name;
        this.employeeNumber = number;
        this.dob = dob;
        this.address = address;
        this.designation = designation;
        this.organisation = Organization;

    }
    void setEmployeeName(String name){
        employeeName=name;
    }

    void setEmployeeNumber(int num){
        employeeNumber=num;
    }
    void setdob(String dob){
        this.dob=dob;
    }
    void setAddress(String address){
       this.address=address;
    }
    void setDesignation(Designation desig){
        designation=desig;
    }
    void  setOrganisation(int org){
        organisation=org;
    }


    String getEmployeeName(){
        return employeeName;
    }
    int getEmployeeNumber(){
        return employeeNumber;
    }
    String getDob(){
        return dob;
    }
    String getAddress(){
        return address;
    }
    Designation getDesignation(){
        return designation;
    }
    int getOrganisation(){
        return organisation;
    }
    public String toString(){
        return "\n" + employeeName+ "," + employeeNumber + " , "+dob+" , "+address+" , "+designation+" , "+organisation;
    }


}
