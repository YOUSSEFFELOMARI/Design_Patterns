package CreationalPatterns.Prototype;

public class TempEmployee extends EmployeePrototype {
    @Override
    public EmployeePrototype ShallowCopy() throws CloneNotSupportedException {
        return (TempEmployee) this.clone();
    }

    @Override
    public EmployeePrototype DeepCopy() throws CloneNotSupportedException {
        TempEmployee tempEmployee=new TempEmployee();
        tempEmployee= (TempEmployee) this.clone();
        tempEmployee.address=new Address(
                address.street, address.City
        );
        return tempEmployee;
    }

}
