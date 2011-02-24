/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.jcomputacao.impressao.zebra;

import java.io.UnsupportedEncodingException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import sun.io.CharToByteConverter;
import org.junit.Test;
import static org.junit.Assert.*;
import sun.io.MalformedInputException;


/**
 *
 * @author Murilo
 */
public class ContentToByteTest {

    public ContentToByteTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void hello() throws UnsupportedEncodingException, MalformedInputException {
        String frase = "O rei filósofo classificou de ordinária a família do general espartano";
        byte[] byteArray = frase.getBytes("UTF8");
        char[] charArray = frase.toCharArray();
        byte[] byteArray2 = CharToByteConverter.getConverter("UTF8").convertAll(charArray);
        assertArrayEquals(byteArray2, byteArray);

    }

}