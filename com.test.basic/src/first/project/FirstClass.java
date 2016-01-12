package first.project;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
/*w  w  w.ja  v  a2  s.c  o m*/
public class FirstClass {
  public static void main(String[] args) {
    Collection<String> names = new ArrayList<>();//new LinkedList<>();
    System.out.printf("Size = %d, Elements = %s%n", names.size(), names);
    names.add("XML");
    names.add("HTML");
    names.add("CSS");
    System.out.printf("Size   = %d, Elements   = %s%n",
        names.size(), names);
    names.remove("CSS");
    System.out.printf("Size   = %d, Elements   = %s%n",
        names.size(), names);
    names.clear();
    System.out.printf("Size   = %d, Elements   = %s%n",
        names.size(), names);
  }
}