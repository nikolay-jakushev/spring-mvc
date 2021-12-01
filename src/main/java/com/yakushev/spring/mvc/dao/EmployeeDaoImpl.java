package com.yakushev.spring.mvc.dao;

import com.yakushev.spring.mvc.model.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



import java.util.List;

@Repository
public class EmployeeDaoImpl implements EmployeeDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Employee> getAllEmployee() {
            Session session = sessionFactory.getCurrentSession();
            List<Employee> getEmployee = session.createQuery("from Employee",
                    Employee.class).getResultList();
            return  getEmployee;
    }
}
