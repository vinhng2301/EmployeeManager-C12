package controller;

import model.Employee;
import model.EmployeeForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import service.employee.IEmployeeService;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private IEmployeeService employeeService;

    @Autowired
    private Environment environment;

    @GetMapping("")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView("list", "list", employeeService.findAll());
        return  modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showFormCreate(){
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("s", new EmployeeForm());
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView create(@ModelAttribute EmployeeForm s) throws IOException {

        int id = employeeService.findAll().size();
        s.setId(id);
        MultipartFile multipartFile = s.getAvatar();
        String avatar = multipartFile.getOriginalFilename();
        String thu_muc_anh = environment.getProperty("file_upload").toString();
        FileCopyUtils.copy(multipartFile.getBytes(), new File(thu_muc_anh+avatar));
        Employee s1 = new Employee((long) s.getId(), s.getName(), avatar, s.isGender());
        s1.setId((long) id);
        employeeService.update(s1);
        ModelAndView modelAndView = new ModelAndView("create", "s", new Employee());
        modelAndView.addObject("mess", "Tao moi thanh cong" + s.getName());
        return modelAndView;
    }
    @GetMapping("/detail/{id}")
    public ModelAndView detail(@PathVariable Integer id){
        ModelAndView modelAndView = new ModelAndView("detail");
        modelAndView.addObject("id", id);
        modelAndView.addObject("name", "Nguyen Duc Vinh");
        modelAndView.addObject("gender", true);
        return modelAndView;
    }
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String showFormEdit(@PathVariable int id, ModelMap modelMap){
        Employee employee  = employeeService.findById(id);
        modelMap.addAttribute("employee", employee);
        return "edit";
    }

    @PostMapping("/edit/{id}")
    public ModelAndView editStudent(@PathVariable int id, @ModelAttribute Employee employee){
        employee.setId((long) id);
        employeeService.save(employee, id);
        return new ModelAndView("list", "list", employeeService.findAll());
    }






    //    @ModelAttribute("department")
//    public List<Department> getDepartmentInf(){
//        List<Department> allDepartment =getAllDepartment();
//        return allDepartment;
//    }
//
//    private List<Department> getAllDepartment() {
//        List<Department> departmentList = new ArrayList<>();
//        departmentList.add(new Department(1, "Sale"));
//        departmentList.add(new Department(2, "Management"));
//        departmentList.add(new Department(3, "Marketing"));
//        return departmentList;
//    }

}
