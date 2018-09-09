/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dyplayer.hip.dao.ets;

import com.dyplayer.hip.rim.type.ets.Dict;
import com.dyplayer.hip.rim.type.ets.DictElement;
import java.util.Date;
import javax.annotation.Resource;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author duyi
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class DictMapperTest {
    @Resource
    private DictElementMapper dictElementMapper;
    
    public DictMapperTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of insert method, of class DictMapper.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        DictElement record = new DictElement();
        record.setBid("1");
        record.setDictId(1L);
        record.setElementName("123");
        record.setElementNo(1 + "");
        record.setElementRemark("1");
        record.setIsDefault("T");
        record.setLastUpdate(new Date());
        record.setValid("1");
        record.setWriteTime(new Date());
        int expResult = 0;
        int result = dictElementMapper.insert(record);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
