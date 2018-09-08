/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dyplayer.hip.dao.ets;

import com.dyplayer.hip.rim.type.ets.Dict;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author duyi
 */
public class DictMapperTest {
    
    private DictMapper dictMapper;
    
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
        Dict record = new Dict();
        record.setbId("1");
        record.setDictName("1");
        record.setDictRemark("1");
        record.setDictType("1");
        record.setDictVersion("1");
        record.setLastUpdate(new Date());
        record.setRelationDict("1");
        record.setValid("1");
        record.setWriteTime(new Date());
        int expResult = 0;
        int result = dictMapper.insert(record);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
