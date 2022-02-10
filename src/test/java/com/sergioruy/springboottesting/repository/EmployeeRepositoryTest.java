package com.sergioruy.springboottesting.repository;

import com.sergioruy.springboottesting.model.Employee;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class EmployeeRepositoryTest {

    @Autowired
    private EmployeeRepository employeeRepository;

//    @DisplayName("Junit test for save Employee Operation")
    @Test
    public void givenEmployeeObject_whenSave_thenReturnedSavedEmployee() {

        //given - is a precondition or a setup
        Employee employee = Employee.builder()
                .firstName("Sergio")
                .lastName("Ruy")
                .email("sergio@gmail.com")
                .build();

        //when - is the action or the behavior we are going to test
        Employee employeeSaved = employeeRepository.save(employee);

        //then - verify the result
        assertThat(employeeSaved).isNotNull();
        assertThat(employeeSaved.getId()).isGreaterThan(0);
    }

//    @DisplayName("Junit test for get all Employees Operation")
//    @Test
//    public void givenEmployeeObject_whenGetAllEmployees_thenReturnedAllEmployees() {
//
//        //given - is a precondition or a setup
//        Employee employee = Employee.builder()
//                .firstName("Sergio")
//                .lastName("Ruy")
//                .email("sergio@gmail.com")
//                .build();
//
//        //when - is the action or the behavior we are going to test
//        Employee employeeSaved = employeeRepository.findAll(employee);
//
//        //then - verify the result
//        assertThat(employeeSaved).isNotNull();
//        assertThat(employeeSaved.getId()).isGreaterThan(0);
//    }

}