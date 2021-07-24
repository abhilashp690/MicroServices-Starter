package com.example.MicroService.DepartmentService.Repository;

import com.example.MicroService.DepartmentService.Model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department , Long> {

}
