/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package model;

import java.util.Date;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PC
 */
public class HoaDonTest {
    
    public HoaDonTest() {
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
     * Test of getMa_hd method, of class HoaDon.
     */
    @Test
    public void testGetMa_hd() {
        System.out.println("getMa_hd");
        HoaDon instance = new HoaDon();
        int expResult = 0;
        int result = instance.getMa_hd();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMa_hd method, of class HoaDon.
     */
    @Test
    public void testSetMa_hd() {
        System.out.println("setMa_hd");
        int ma_hd = 0;
        HoaDon instance = new HoaDon();
        instance.setMa_hd(ma_hd);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMa_kh method, of class HoaDon.
     */
    @Test
    public void testGetMa_kh() {
        System.out.println("getMa_kh");
        HoaDon instance = new HoaDon();
        int expResult = 0;
        int result = instance.getMa_kh();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMa_kh method, of class HoaDon.
     */
    @Test
    public void testSetMa_kh() {
        System.out.println("setMa_kh");
        int ma_kh = 0;
        HoaDon instance = new HoaDon();
        instance.setMa_kh(ma_kh);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getChiet_khau method, of class HoaDon.
     */
    @Test
    public void testGetChiet_khau() {
        System.out.println("getChiet_khau");
        HoaDon instance = new HoaDon();
        int expResult = 0;
        int result = instance.getChiet_khau();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setChiet_khau method, of class HoaDon.
     */
    @Test
    public void testSetChiet_khau() {
        System.out.println("setChiet_khau");
        int chiet_khau = 0;
        HoaDon instance = new HoaDon();
        instance.setChiet_khau(chiet_khau);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getThanh_tien method, of class HoaDon.
     */
    @Test
    public void testGetThanh_tien() {
        System.out.println("getThanh_tien");
        HoaDon instance = new HoaDon();
        int expResult = 0;
        int result = instance.getThanh_tien();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setThanh_tien method, of class HoaDon.
     */
    @Test
    public void testSetThanh_tien() {
        System.out.println("setThanh_tien");
        int thanh_tien = 0;
        HoaDon instance = new HoaDon();
        instance.setThanh_tien(thanh_tien);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNgay method, of class HoaDon.
     */
    @Test
    public void testGetNgay() {
        System.out.println("getNgay");
        HoaDon instance = new HoaDon();
        Date expResult = null;
        Date result = instance.getNgay();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNgay method, of class HoaDon.
     */
    @Test
    public void testSetNgay() {
        System.out.println("setNgay");
        Date ngay = null;
        HoaDon instance = new HoaDon();
        instance.setNgay(ngay);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMonanList method, of class HoaDon.
     */
    @Test
    public void testGetMonanList() {
        System.out.println("getMonanList");
        HoaDon instance = new HoaDon();
        Map<MonAn, Integer> expResult = null;
        Map<MonAn, Integer> result = instance.getMonanList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMonanList method, of class HoaDon.
     */
    @Test
    public void testSetMonanList() {
        System.out.println("setMonanList");
        Map<MonAn, Integer> monanList = null;
        HoaDon instance = new HoaDon();
        instance.setMonanList(monanList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
