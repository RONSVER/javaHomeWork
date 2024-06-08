package org.example.prof.lessonTwentyThree;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class BoxTest {

    private Box box;

    //@BeforeAll - J5, @BeforeClass - J4
    //@BeforeEach - J5, @Before - J4

    @BeforeAll
    public static void initBeforeAll() {
        System.out.println("before all");
    }

    @BeforeEach
    public void init() {
        System.out.println("before each");
        box = new Box();
    }

    @Test
//    @Disabled // Ignore - J4
    public void testAddStringToBoxList() {
        box.addStringToList("hello");
        box.addStringToList("java");
        assertEquals(2, box.getStringList().size());

//        ----------------
//        assertTrue(); and false
//        assertNull();
//        assertNotEquals();
    }

    @Test
    public void testBoxInit() {
        assertEquals(0, box.getStringList().size());
    }

//    @AfterAll //AfterClass - J4
//    public static void downAfterAllTest() {
//        System.out.println("after all class");
//    }

    @AfterEach
    public void downAfterEachTest() {
        System.out.println("after all each");
    }

}