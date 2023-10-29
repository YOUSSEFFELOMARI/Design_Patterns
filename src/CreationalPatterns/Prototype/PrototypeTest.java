package CreationalPatterns.Prototype;

import java.io.Console;

public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {

        EmployeePrototype tempEmployee1=new TempEmployee();
        tempEmployee1.name="youssef";
        tempEmployee1.id=1;
        tempEmployee1.address=new Address("an-fa","Casa");

        EmployeePrototype tempEmployee2 = tempEmployee1.DeepCopy();
        System.out.println("=========== Tmp Employee 1 Values ===========");
        System.out.println(tempEmployee1);
        System.out.println();
        System.out.println("=========== Tmp Employee 2 copy ===========");
        System.out.println(tempEmployee2);

        System.out.println();
        tempEmployee2.address.setCity("Agadir");

        System.out.println("\u001B[32m"+"=========== Tmp Employee 1 Values ===========");
        System.out.println("\u001B[32m"+tempEmployee1);
        System.out.println();
        System.out.println("\"\\u001B[32m\"+=========== Tmp Employee 2 copy ===========");
        System.out.println("\u001B[32m"+tempEmployee2);

    }
}
