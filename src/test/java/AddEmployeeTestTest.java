import com.dao.EmployeeDao;
import com.dao.hibernate.EmployeeDaoImpl;
import com.entity.Employee;
import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by Nirav on 31-01-2016.
 */
public class AddEmployeeTestTest extends TestCase {
    public void testaddEmployee()  throws Exception {
        ApplicationContext ctx = new FileSystemXmlApplicationContext("E:\\Apps\\Projects\\MyWebApp\\web\\WEB-INF\\applicationContext.xml");
        EmployeeDao employeeDao = (EmployeeDao)ctx.getBean("employeeDao");
        Employee emp = new Employee();
        emp.setName("Nirav Joshi");
        emp.setSalary(300d);
        employeeDao.addEmployee(emp);
    }

    public void testGetEmployee() throws Exception {
        ApplicationContext ctx = new FileSystemXmlApplicationContext("E:\\Apps\\Projects\\MyWebApp\\web\\WEB-INF\\applicationContext.xml");
        EmployeeDao employeeDao = (EmployeeDao)ctx.getBean("employeeDao");

        Employee selectEmp = new Employee();
        selectEmp.setName("Nirav Joshi");
        selectEmp.setSalary(300d);
        Employee employee = employeeDao.getEmployee(selectEmp);
        System.out.println(employee.getName() + ":" + employee.getSalary());

    }

}