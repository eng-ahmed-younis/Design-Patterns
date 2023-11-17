package Structure_designe_patterns.composition.leaf;

import Structure_designe_patterns.composition.Department;

//The second leaf class, SalesDepartment, is similar:
public class SalesDepartment implements Department {

    private Integer id;
    private String name;

    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());
    }

    // standard constructor, getters, setters
}