package tutorial.schooljdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository("studentDao")
public class StudentDAOImpl implements StudentDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void insert(Student student) {

        String sql = "INSERT INTO STUDENT VALUES (?, ?, ?)";

        Object[] arg = {student.getRole_no(), student.getName(), student.getAddress()};

        int noOfRowInserted = jdbcTemplate.update(sql, arg);
        System.out.println("No of row inserted is "+noOfRowInserted);
    }
}
