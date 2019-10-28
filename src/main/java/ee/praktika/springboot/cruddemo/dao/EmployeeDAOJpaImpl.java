package ee.praktika.springboot.cruddemo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import ee.praktika.springboot.cruddemo.entity.Employee;

@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO {

    private EntityManager entityManager;

    public EmployeeDAOJpaImpl( EntityManager theEntityManager ) {
        entityManager = theEntityManager;
    }

    @Override
    public List<Employee> findAll(){

        //create a query
        Query theQuery = entityManager.createQuery( "from Employee" );

        //excecute the query to get result in
        List<Employee> employees = theQuery.getResultList();

        //return the result
        return employees;
    }

    @Override
    public Employee findById( int theId ){
        return null;
    }

    @Override
    public void save( Employee theEmployee ){
    }

    @Override
    public void deleteById( int theId ){
    }
}
