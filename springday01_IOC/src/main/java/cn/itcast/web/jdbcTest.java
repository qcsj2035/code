package cn.itcast.web;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

public class jdbcTest {

    @Test
    public void test01() throws SQLException {
        ApplicationContext app =new ClassPathXmlApplicationContext("applicationContext.xml");
        DataSource dataSource = app.getBean("dataSource", DataSource.class);
        System.out.println(dataSource.getConnection());
    }
}
