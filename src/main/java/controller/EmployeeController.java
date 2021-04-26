package controller;

import model.Department;
import org.omg.CORBA.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import service.employee.IEmployeeService;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private IEmployeeService employeeService;

    @ModelAttribute("department")
    public List<Department> getDepartmentInf(){
        List<Department> allDepartment =getAllDepartment();
        return allDepartment;
    }

    private List<Department> getAllDepartment() {
        List<Department> departmentList = new ArrayList<>();
        departmentList.add(new Department(1, "Sale"));
        departmentList.add(new Department(2, "Management"));
        departmentList.add(new Department(3, "Marketing"));
        return departmentList;
    }
}
