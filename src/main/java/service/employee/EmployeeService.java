package service.employee;

import model.Employee;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeService implements IEmployeeService {
    private static List<Employee> employees;
    static {
        employees = new ArrayList<>();
        employees.add(new Employee(0L,"Vinh", true));
        employees.add(new Employee(1L,"Thu", false));
        employees.add(new Employee(2L,"Thuy Minh", false));
        employees.add(new Employee(3L,"ICD", false));
    }


    @Override
    public List<Employee> findAll() {
        return employees;
    }

    @Override
    public Employee findById(int id) {
        return employees.get(id);
    }

    @Override
    public boolean update(Employee employee) {
        employees.add(employee);
        return false;
    }

    @Override
    public boolean save(Employee employee, int id) {
        employees.set(id,employee);
        return false;
    }
}
