package experiments;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import structures.AssociativeArray;

public class MyTest {
  @Test
  public void arsalShaikhTest1() {
      // Checking if size field is recorded correctly
      AssociativeArray<String, String> arr = new AssociativeArray<>();
      try {
          assertEquals("Size variable initialized to zero", 0, arr.size());
      } catch (Exception e) {
          fail("arr.size() method does not run");
      }

      try {
          arr.set("A", "Aligator"); // size = 1
          assertEquals("Array size increases to 1", 1, arr.size());
      } catch (Exception e) {}

      try {
          arr.set("B", "Bear"); // size = 2
          arr.set("C", "Cat"); // size = 3
          arr.set("D", "Dog"); // size = 4
          assertEquals("Array size increases to 4", 4, arr.size());
      } catch (Exception e) {}

      try {
          arr.get("A");
          assertEquals("Get does not change array size", 4, arr.size());
      } catch (Exception e) {}

      try {
          arr.set("A", "Ant");
          assertEquals("Replacing a value does not change array size", 4, arr.size());
      } catch (Exception e) {}

      try {
          arr.hasKey("A");
          assertEquals("hasKey method does not change array size", 4, arr.size());
      } catch (Exception e) {}

      try {
          arr.remove("Z");
          assertEquals("removing a non existant key does nothing", 4, arr.size());
      } catch (Exception e) {}

      try {
          arr.remove("A"); // size = 3
          assertEquals("Remove decreases array size", 3, arr.size());
      } catch (Exception e) {}
  } // arsalShaikhTest1()

  @Test
  public void arsalShaikhTest2() {
      AssociativeArray<Integer, String> arr = new AssociativeArray<>();
      try {
          arr.set(1, "a");
          arr.set(2, "b");
          arr.set(3, "c");
          arr.set(4, "d");
      } catch (Exception e) {}

      try {
          assertEquals("hasKey finds key in the array", "a", arr.get(1));
      } catch (Exception e) {}
  } // arsalShaikhTest2()

  @Test
  public void arsalShaikhEdge1() {
      // Does the size method behave appropriately with null values
      AssociativeArray<String, String> arr = new AssociativeArray<>();
      try {
          arr.remove(null);
      } catch (Exception e) {
          fail("arr.remove() throws exception on null values");
      }
  } // arsalShaikhEdge1()
}
