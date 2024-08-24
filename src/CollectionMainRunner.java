import java.util.ArrayList;
import java.util.List;

public class CollectionMainRunner {
    public static void main(String[] args) {
        List<String> employeeFirstName = new ArrayList<>();
        employeeFirstName.add("John");
        employeeFirstName.add("Sam");
       /* Collections @Overrides toString(), so we don't see
        return getClass().getName() + "@" + Integer.toHexString(hashCode());*/
        System.out.println(employeeFirstName.toString());

    }
}

