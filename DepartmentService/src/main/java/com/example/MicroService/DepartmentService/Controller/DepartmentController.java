package com.example.MicroService.DepartmentService.Controller;

import com.example.MicroService.DepartmentService.Model.Department;
import com.example.MicroService.DepartmentService.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentService deptService;

    @PostMapping
    public Department addDepartment(@RequestBody Department dept) {
        return deptService.addDepartment(dept);
    }

    @GetMapping("/{deptId}")
    public Department getDepartment(@PathVariable("deptId") Long deptId){
        return deptService.getDepartment(deptId);
    }

}
