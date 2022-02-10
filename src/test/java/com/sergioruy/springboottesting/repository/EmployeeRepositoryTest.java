package com.sergioruy.springboottesting.repository;

import com.sergioruy.springboottesting.model.Employee;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

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

//  JUnit test for get all employees operation
    @Test
    public void givenEmployeesList_whenFindAll_thenEmployeesList() {

        //given - is a precondition or a setup
        Employee employee1 = Employee.builder()
                .firstName("Sergio")
                .lastName("Ruy")
                .email("sergio@gmail.com")
                .build();

        Employee employee2 = Employee.builder()
                .firstName("John")
                .lastName("Cena")
                .email("john@gmail.com")
                .build();

        employeeRepository.save(employee1);
        employeeRepository.save(employee2);

        //when - is the action or the behavior we are going to test
        List<Employee> employeeList = employeeRepository.findAll();

        //then - verify the result
        assertThat(employeeList).isNotNull();
        assertThat(employeeList.size()).isEqualTo(2);
    }

    //  Junit test for
        @Test
        public void given_when_then() {

            //given - is a precondition or a setup

            //when - is the action or the behavior we are going to test

            //then - verify the result

        }



}