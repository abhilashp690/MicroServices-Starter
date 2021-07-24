package com.example.MicroService.DepartmentService.Service;

import com.example.MicroService.DepartmentService.Model.Department;
import com.example.MicroService.DepartmentService.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository deptRepository;

    public Department addDepartment(Department dpt){
        return deptRepository.save(dpt);
    }

    public Department getDepartment(long deptId) {
        Optional<Department> dept = deptRepository.findById(deptId);
        if(dept.isPresent())
            return dept.get();
        else
            return null;
    }
}
