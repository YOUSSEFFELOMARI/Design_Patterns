package CreationalPatterns.Prototype;

public class RegEmployee extends EmployeePrototype {
    @Override
    public EmployeePrototype ShallowCopy() throws CloneNotSupportedException {
        return (RegEmployee) this.clone();
    }

    @Override
    public EmployeePrototype DeepCopy() throws CloneNotSupportedException {
        RegEmployee regEmployee=new RegEmployee();
        regEmployee= (RegEmployee) this.clone();
        regEmployee.address=new Address(
                address.street, address.City
        );
        return regEmployee;
    }
}
