package com.solt.service;

import com.solt.config.DataSourceConfig;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.List;

@Service
public class EmployeeData {

    private JdbcTemplate jdbcTemplate;
    public EmployeeData(DataSource dataSource){
        jdbcTemplate=new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
    }

    public List<String> listEmail(){
        return jdbcTemplate.queryForList("select email from employee",
                String.class);
    }
}
