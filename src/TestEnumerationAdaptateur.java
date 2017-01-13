import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

/**
 * Created by association on 13/01/17.
 */
public class TestEnumerationAdaptateur {
    public static void main(String[] args) {
        ArrayList myList = new ArrayList();

        for (int i = 0; i < 5; i++) {
            myList.add(i);
        }

        Iterator iterator = myList.iterator();

        Enumeration enumeration = new IteratorEnumeration(iterator);

        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

    }
}
