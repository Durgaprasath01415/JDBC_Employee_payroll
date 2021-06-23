import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class EmployeePayrollServiceTest{

//    @Test
//    public void givenEmployees_WhenWrittenToFile_ShouldMatchEmployeeEntries(){
//        EmployeePayrollData[] arrayOfEmps ={
//                new EmployeePayrollData(1,"Jeff Bezos",100000.0),
//                new EmployeePayrollData(2,"Bill Gates",200000.0),
//                new EmployeePayrollData(3,"Mark Zuckerberg",300000.0),
//        };
//        EmployeePayrollService employeePayrollService;
//        employeePayrollService = new EmployeePayrollService(Arrays.asList(arrayOfEmps));
//        employeePayrollService.writeEmployeeData(EmployeePayrollService.IOService.FILE_IO);
//        employeePayrollService.printData(EmployeePayrollService.IOService.FILE_IO);
//        long entries = employeePayrollService.countEntries(EmployeePayrollService.IOService.FILE_IO);
//        Assert.assertEquals(3,entries);
//    }

    @Test
    public void givenEmployeePayrollInDB_WhenRetrieved_ShouldMatchEmployeeCount() {
        EmployeePayrollService employeePayrollService = new EmployeePayrollService();
        List<EmployeePayrollData> employeePayrollData = employeePayrollService.readEmployeePayrollData(EmployeePayrollService.IOService.DB_IO);
        Assert.assertEquals(3,employeePayrollData.size());
    }
}
