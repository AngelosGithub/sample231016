package com.example.sample1.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;
@Component
public class TodoDao {

    @Autowired
    private DataSource dataSource;

    public List<Todo> list() {
        return null
    }
}
