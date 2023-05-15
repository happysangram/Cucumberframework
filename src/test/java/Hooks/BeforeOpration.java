package Hooks;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import org.junit.BeforeClass;

public class BeforeOpration {

    @BeforeAll
    public static void Before() {
        System.out.println("BeforeALL");
    }

    @AfterAll
    public static void After() {
        System.out.println("AfterALL");
    }
}
