package org.learnjava.httpclientTestCase;

import org.learnjava.http2client.HttpExample;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HttpClientTestCase {

    HttpExample httpExample = new HttpExample();

    @Test
    public void testHttpExample() throws Exception {

        var userDetails = httpExample.getUserDetailsById();

        assertEquals(1, userDetails.userId());
        assertEquals(1, userDetails.id());
        assertEquals("delectus aut autem", userDetails.title());
        assertFalse(userDetails.completed());
    }

    @Test
    public void testHttpExample1() throws Exception {

        var userDetails = httpExample.getUserDetailsByIdAsync().join();

        assertEquals(1, userDetails.userId());
        assertEquals(1, userDetails.id());
        assertEquals("delectus aut autem", userDetails.title());
        assertFalse(userDetails.completed());
    }


}