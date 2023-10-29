package CreationalPatterns.Prototype;

public abstract class EmployeePrototype implements Cloneable{
    public int id;
    public String name;
    public Address address;

    public abstract EmployeePrototype ShallowCopy() throws CloneNotSupportedException;
    public abstract EmployeePrototype DeepCopy() throws CloneNotSupportedException;

    @Override
    public String toString() {
        return "EmployeePrototype{ " +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Street=" + address.getStreet() +
                ", City=" + address.getCity() +
                " }";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
