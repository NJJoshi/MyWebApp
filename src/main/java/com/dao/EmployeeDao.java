package com.dao;

import com.entity.Employee;

import java.util.List;

/**
 * Created by Nirav on 31-01-2016.
 */
public interface EmployeeDao {
    public void addEmployee(Employee emp);
    public Employee getEmployee(Employee filterCriteria);
    public int deleteEmployee(Employee emp);
}
