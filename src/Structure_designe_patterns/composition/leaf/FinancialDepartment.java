package Structure_designe_patterns.composition.leaf;

import Structure_designe_patterns.composition.Department;

// For the leaf components, let’s define classes for financial and sales departments:
public class FinancialDepartment implements Department {

    private Integer id;
    private String name;

    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());
    }

    // standard constructor, getters, setters
}