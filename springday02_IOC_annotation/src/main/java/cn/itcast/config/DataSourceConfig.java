package cn.itcast.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * 配置子类
 */
@PropertySource("classpath:jdbc.properties")
public class DataSourceConfig {

    @Value("${jdbc.driver}")
    private String Driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;

    /*创建一个方法,获取数据源对象*/
    @Bean("dataSource")
    public DataSource getDataSource(){
        DruidDataSource ds =new DruidDataSource();
        ds.setDriverClassName(Driver);
        ds.setUrl(url);
        ds.setUsername(username);
        ds.setPassword(password);
        return ds;
    }
    @Bean("dataSource1")
    public DataSource getDataSource1(){
        DruidDataSource ds =new DruidDataSource();
        ds.setDriverClassName(Driver);
        ds.setUrl(url);
        ds.setUsername(username);
        ds.setPassword(password);
        return ds;
    }
    @Bean("jdbcTempalte")
    public JdbcTemplate getJDBCTemplate(@Qualifier("dataSource") DataSource dataSource){//@Autowired
        return new JdbcTemplate(dataSource);
    }
}
