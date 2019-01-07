package com.ricemen.study.simpleboard.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.Connection;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"file:/src/main/resources/spring/**/*.xml"})
@ContextConfiguration(locations = {"classpath:/spring/**/*.xml"})
public class HomeControllerTest {

    @Autowired
    private DataSource dataSource;

    @Test
    public void connectDb() throws Exception {
        try(Connection con = dataSource.getConnection()) {

            System.out.println(con);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme