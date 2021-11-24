package com.example.unittest.Controller;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * FileName:HelloControllerTest
 * Author:zhujinwei
 * Date: 2021年11月23日 0023 14:09:23
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class HelloControllerTest {
    @Autowired
    private WebApplicationContext webApplicationContext;
    private MockMvc mockMvc;
    @Before
    public void setUp()throws Exception
    {
        mockMvc= MockMvcBuilders.webAppContextSetup(webApplicationContext).build();

    }
    @Test
    public void hello()throws Exception
    {
        MvcResult mvcResult=mockMvc.perform(MockMvcRequestBuilders
                .get("/hello")
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .param("name","zhujinwei")
                .accept(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content()
                .string("hello zhujinwei"))
                .andDo(MockMvcResultHandlers.print()).andReturn();

        int status=mvcResult.getResponse().getStatus();
        String content=mvcResult.getResponse().getContentAsString();
        Assert.assertEquals(200,status);
        Assert.assertEquals("hello zhujinwei",content);

    }
}
