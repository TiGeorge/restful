package com.example.restfuldemo.payroll;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

@Component
public class EmployeeModelAssembler implements RepresentationModelAssembler<Employee,
        EntityModel<Employee>> {

    @Override
    public EntityModel<Employee> toModel(Employee employee) {
        return new EntityModel<>(employee,
                linkTo(methodOn(EmployeeController.class).all()).withRel("employees"));
    }
}
