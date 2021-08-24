
package Config;

import java.util.Date;

public class Employee {
    
     //Atributos
    private long DNI;
    private String name;
    private String dependency;
    public Date date;
    private String file;
    
    //public static int contador = 1;
    
    //Constructor
    public Employee(long dni ,String n, String d, Date date, String f) {
        this.DNI = dni;
        this.name = n;
        this.dependency = d;
        this.date = date;
        this.file = f;
    }
    
    //getter y setter
    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDependency() {
        return dependency;
    }

    public void setDependency(String dependency) {
        this.dependency = dependency;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }   

    @Override
    public String toString() {
        return "Employee{" + ", name=" + name + ", dependency=" + dependency + ", date=" + date + ", file=" + file + '}';
    }
    
    
}
