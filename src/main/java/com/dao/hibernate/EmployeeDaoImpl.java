package com.dao.hibernate;

import com.dao.EmployeeDao;
import com.entity.Employee;
import org.hibernate.FlushMode;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by Nirav on 31-01-2016.
 */
public class EmployeeDaoImpl implements EmployeeDao {
    private Logger logger = Logger.getLogger("com.dao.hibernate.EmployeeDaoImpl");

    HibernateTemplate hibernateTemplate;

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Transactional
    public void addEmployee(Employee emp) {
        logger.info("Inside addEmployee");
        if(emp == null)
            return;
        hibernateTemplate.getSessionFactory().getCurrentSession().setFlushMode(FlushMode.AUTO);
        hibernateTemplate.save(emp);
        logger.info("Employee has been added");
    }


    public Employee getEmployee(Employee filterCriteria) {
        logger.info("Inside getEmployee");
        if(filterCriteria == null)
            return null;
        Employee emp = hibernateTemplate.get(Employee.class, filterCriteria.getId());
        return emp;
    }

    public int deleteEmployee(Employee emp) {
        logger.info("Inside deleteEmployee");
        if(emp == null)
            return -1;
        hibernateTemplate.delete(emp);
        return 0;
    }
}
