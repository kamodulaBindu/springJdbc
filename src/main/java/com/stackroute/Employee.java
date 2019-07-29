package com.stackroute;

public class Employee {
    private int empId;
    private String empName;
    private long empSalary;
    private String empGender;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public long getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(long empSalary) {
        this.empSalary = empSalary;
    }

    public String getEmpGender() {
        return empGender;
    }

    public void setEmpGender(String empGender) {
        this.empGender = empGender;
    }

    public Employee() {
        setEmpId(empId);
        setEmpName(empName);
        setEmpSalary(empSalary);
        setEmpGender(empGender);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + empId +
                ", employeeName='" + empName + '\'' +
                ", employeeSalary=" + empSalary +
                ", employeeGender='" + empGender + '\'' +
                '}';
    }


}
