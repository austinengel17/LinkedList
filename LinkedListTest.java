import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {

    @Test
    void insertTest(){
        assertAll(
                ()->{
                    LinkedList list = new LinkedList();
                    list.insert(10);
                    assertEquals(list.getElementAtIndex(0).data, 10);
                },
                ()->{
                    LinkedList list = new LinkedList();
                    for(int i = 0; i < 100; i++){
                        list.insert(i);
                    }
                    for(int i = 0; i < 100; i++){
                        assertEquals(list.getElementAtIndex(i).data, i);
                    }
                }
        );
    }
    @Test
    void deleteTest() {
        assertAll(
                ()-> {
                    LinkedList list = new LinkedList();
                    for (int i = 0; i < 5; i++) {
                        list.insert(i);
                    }
                    list.delete(2);
                    assertEquals(list.getElementAtIndex(2).data, 3);
                },
                ()-> {
                    LinkedList list = new LinkedList();
                    for (int i = 0; i < 5; i++) {
                        list.insert(i);
                    }
                    list.delete(0);
                    assertEquals(list.getElementAtIndex(0).data, 1);
                },
                ()-> {
                    LinkedList list = new LinkedList();
                    for (int i = 0; i < 5; i++) {
                        list.insert(i);
                    }
                    list.delete(4);
                    assertThrows(IndexOutOfBoundsException.class, ()->{list.getElementAtIndex(4);});
                }
        );
    }
}
