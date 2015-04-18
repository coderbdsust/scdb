package com.coderbd.scdb.web.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.coderbd.scdb.web.ScdbApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ScdbApplication.class)
@WebAppConfiguration
public class ScdbApplicationTests {

	@Test
	public void contextLoads() {
	}

}
