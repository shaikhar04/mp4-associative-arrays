import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;
import structures.AssociativeArray;

public class Tests() {
  @Test
  public static void arsalShaikhTest1() {
    
    // Checking if size field is recorded correctly
    AssociativeArray<String, String> arr = new AssociativeArray<String, String>;
    assertEquals("Size variable initialized to zero", arr.size(), 0);

      arr.set("A", "Aligator"); // size = 1
    assertEquals("Array size increases to 1", arr.size());

    arr.set("B", "Bear"); // size = 2
    arr.set("C", "Cat"); // size = 3
    arr.set("D", "Dog"); // size = 4
    assertEquals("Array size increases to 4", arr.size(), 4);
    
    arr.get("A");
    assertEquals("Get does not change array size", arr.size(), 4);
    
    arr.set("A", "Ant");
    assertEquals("Replacing a value does not change array size", arr.size(), 4)

    arr.hasKey("A");
    assertEquals("hasKey method does not change array size ", arr.size(), 4);

    arr.remove("Z");
    assertEquals("removing a non existant key does nothing", arr.size(), 4);

    arr.remove("A"); // size = 3
    assertEquals("Remove decreases array size", arr.size(), 3);
  } // arsalShaikhTest1()

  @Test
  public static void arsalShaikhTest2() {} // arsalShaikhTest2()

  @Test
  public static void arsalShaikhEdge1() {

    // Does the size method behave appropriately with null values
    AssociativeArray<String, String> arr = new AssociativeArray<String, String>;
    try {
      arr.set(1, null);
      assertEquals("Correctly counts pairs with null values", arr.size(), 1);
    } catch (Exception e) {
      fail("Does not accept value as null");
    }
  } // arsalShaikhEdge1()
}