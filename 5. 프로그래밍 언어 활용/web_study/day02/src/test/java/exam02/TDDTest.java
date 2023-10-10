package exam02;

import org.junit.jupiter.api.*;

public class TDDTest {
    @BeforeAll
    static void beforeAll() {
        System.out.println("BeforeAll");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("AfterAll");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("BeforeEach");
    }

    @AfterEach
    void afterEach() {
        System.out.println("AfterEach");
    }

    @Test
    void test1() {
        System.out.println("test1");
    }

    @Test
    void Test2() {
        System.out.println("test2");
    }
}
