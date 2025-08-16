package tricky;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

    public static void main(String[] args) {

        List<String[]> employee = Arrays.asList(
                new String[]{"1001", "Tom"},
                new String[]{"1002", "Raju"},
                new String[]{"1003", "Kumar"}
        );

        List<String[]> department = Arrays.asList(
                new String[]{"3001", "IT"},
                new String[]{"3002", "HR"},
                new String[]{"3003", "Admin"}
        );

        List<String[]> empDepartment = Arrays.asList(
                new String[]{"1001", "3001"},
                new String[]{"1002", "3002"},
                new String[]{"1003", "3003"}
        );

        Thread empThread = new Thread(()->
        {
            for(String []e: employee)
            {
                System.out.println(e[1]);
            }
        });
        Thread departmentThread = new Thread(()->{
            
            System.out.println("name with depts");
            Map <String, String> empWithDept = new HashMap<>();
            for(String []data : empDepartment)
            {
                empWithDept.put(data[0], data[1]);
            }

            Map <String, String> empDept = new HashMap<>();
            for(String []words : department)
            {
                empDept.put(words[0], words[1]);
            }
            for(String []emp : employee)
            {
                String empId = emp[0];
                String empName = emp[1];
                String deptId = empWithDept.get(empId);
                String deptName = empDept.get(deptId);
                System.out.println(empName+"---------->"+deptName);
            }
        }

        );


       empThread.start();
       departmentThread.start();




    }
}
