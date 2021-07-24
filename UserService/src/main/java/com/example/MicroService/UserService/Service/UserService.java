package com.example.MicroService.UserService.Service;

import com.example.MicroService.UserService.Model.Department;
import com.example.MicroService.UserService.Model.DepartmentUser;
import com.example.MicroService.UserService.Model.User;
import com.example.MicroService.UserService.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private RestTemplate restTemplate;

    public User saveUser(User user) {
        return userRepo.save(user);
    }

    public DepartmentUser getUser(Long userId) {
        Optional<User> user = userRepo.findById(userId);
        if(user.isPresent()) {
            Department dept = restTemplate.getForObject("http://apigatewayservice/department/"+user.get().getDepartmentId() , Department.class);
            System.out.println("Department - " + dept);
            System.out.println("User is - " +  user);
            return new DepartmentUser(user.get() , dept);
        }
        else
            return null;
    }
}
