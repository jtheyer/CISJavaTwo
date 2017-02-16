 /**
* Page 445 #11.2
 * Person, Student, Faculty, and Staff classes...
 * @author 55heyerjt01
 */
package Week4;

import java.time.LocalDate;


public class Person {
    private String name;
    private String address;
    private String phone;
    private String email;

    public Person() {
    }

    public Person(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", address=" + address + ", phone=" + phone + ", email=" + email + '}';
    }
    
    class Student extends Person {
        final String status; 
        
        public Student(String status){
            this.status = status;
        }
    }
    
    class Employee extends Person {
        private String office;
        private double salary;
        private LocalDate hireDate;

        public Employee() {
            super();
        }

        public Employee(String office, double salary, LocalDate hireDate, String name, String address, String phone, String email) {
            super(name, address, phone, email);
            this.office = office;
            this.salary = salary;
            this.hireDate = hireDate;
        }

        public LocalDate getHireDate() {
            return hireDate;
        }

        public void setHireDate(LocalDate hireDate) {
            this.hireDate = hireDate;
        }

        public String getOffice() {
            return office;
        }

        public void setOffice(String office) {
            this.office = office;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        @Override
        public String toString() {
            return super.toString() + "Employee{" + "office=" + office + ", salary=" + salary + ", hireDate=" + hireDate + '}';
        }
    } 
    
    class Faculty extends Employee {
        private String officeHours;
        private String rank;

        public Faculty() {
        }

        public Faculty(String officeHours, String rank) {
            this.officeHours = officeHours;
            this.rank = rank;
        }

        public Faculty(String officeHours, String rank, String office, double salary, LocalDate hireDate, String name, String address, String phone, String email) {
            super(office, salary, hireDate, name, address, phone, email);
            this.officeHours = officeHours;
            this.rank = rank;
        }

        public String getRank() {
            return rank;
        }

        public void setRank(String rank) {
            this.rank = rank;
        }

        public String getOfficeHours() {
            return officeHours;
        }

        public void setOfficeHours(String officeHours) {
            this.officeHours = officeHours;
        }

        @Override
        public String toString() {
            return "Faculty{" + getName() +'}'; //"Faculty" + getName();
        }
        
    }
    
    class Staff extends Employee {
        private String title;

        public Staff() {
        }

        public Staff(String title, String office, double salary, LocalDate hireDate, String name, String address, String phone, String email) {
            super(office, salary, hireDate, name, address, phone, email);
            this.title = title;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
        
        public String toString(){
            return "Staff " + getName();
        }
    }
}
