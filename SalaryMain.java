import java.util.HashMap;

public class SalaryMain {
    public static void main(String[] args) {
        HashMap<String,Integer> Employees = new HashMap<>();

        Employees.put("Vansh",9999999);
        Employees.put("Shijo",10000);

        Employees.entrySet().stream().
                filter(e->e.getValue()>50000).forEach(e-> System.out.println("key = "+ e.getKey()+", values = " + e.getValue()));
    }
}
