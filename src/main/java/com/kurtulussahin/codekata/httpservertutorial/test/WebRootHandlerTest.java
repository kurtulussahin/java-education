package com.kurtulussahin.codekata.httpservertutorial.test;

import com.kurtulussahin.codekata.httpservertutorial.httpserver.core.io.WebRootHandler;
import com.kurtulussahin.codekata.httpservertutorial.httpserver.core.io.WebRootNotFoundException;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class WebRootHandlerTest {

    private WebRootHandler webRootHandler;
    private Method checkIfEndsWithSlashMethod;
    private String webRootPath = "src/main/java/com/kurtulussahin/codekata/httpservertutorial/WebRoot";
    private String indexHtmlPath = "src/main/java/com/kurtulussahin/codekata/httpservertutorial/WebRoot/index.html";

    @BeforeAll
    public void beforeClass() throws WebRootNotFoundException, NoSuchMethodException {

        webRootHandler = new WebRootHandler(webRootPath);
        Class<WebRootHandler> cls = WebRootHandler.class;
        checkIfEndsWithSlashMethod=cls.getDeclaredMethod("CheckIfEndsWithSlash", String.class);
        checkIfEndsWithSlashMethod.setAccessible(true);
    }

    @Test
    void constructorGoodPath() {
        try {
            WebRootHandler webRootHandler = new WebRootHandler("src/main/java/com/kurtulussahin/codekata/httpservertutorial/WebRoot");
        }catch(WebRootNotFoundException e){
            fail(e);
        }
    }

    @Test
    void constructorBadPath() {
        try {
            WebRootHandler webRootHandler = new WebRootHandler("badPath/main/java/com/kurtulussahin/codekata/httpservertutorial/WebRoot");
            fail();
        }catch(WebRootNotFoundException e){
        }
    }

    @Test
    void checkIfEndsWithSlashMethodGood() {
        try{
            boolean result = (Boolean) checkIfEndsWithSlashMethod.invoke(webRootHandler, indexHtmlPath);
            assertFalse(result);
        }catch(IllegalAccessException e){
            fail(e);
        }catch (InvocationTargetException e){
            fail(e);
        }
    }

    @Test
    void checkIfEndsWithSlashMethodTrue() {
        try{
            boolean result = (Boolean) checkIfEndsWithSlashMethod.invoke(webRootHandler, "src/main/java/com/kurtulussahin/codekata/httpservertutorial/WebRoot//");
            assertTrue(result);
        }catch(IllegalAccessException e){
            fail(e);
        }catch (InvocationTargetException e){
            fail(e);
        }
    }

}
