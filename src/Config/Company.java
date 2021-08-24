
package Config;

//import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;



public class Company {
    
    //Atributos
    public static ArrayList<Employee> person;//Se declara arreglo dinámico
    
    //Constructor
    public Company(){
        person = new ArrayList<Employee>();
    }

    public static ArrayList<Employee> getPerson() {
        return person;
    }
    
    //CREATE/Agregar
    public void Insert(long dni, String n, String d, Date date, String f){ // Agrega una persona a la tabla
        Employee m = new Employee(dni,n,d,date,f);
        person.add(m);
    }
    
    //READ/Consultar
    public static Object[][] queryResult(){ //Envia toda la tabla de person
        Object[][] table = new Object[person.size()][5]; //[filas][columnas]
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        int cont = 0;
        for (Employee i : person) {
            table[cont][0] = i.getDNI();
            table[cont][1] = i.getName();
            table[cont][2] = i.getDependency();
            table[cont][3] = formatter.format(i.getDate().getTime());
            table[cont][4] = i.getFile();
            cont++;
        }
        return table;
    }
    
    //Buscar por ID
    public Object[][] searchID(long id) { //Devuelve una fila la cual corresponde al ID que se envia
        Object[][] table = new Object[1][5];
        for (Employee i : person) {
            if (i.getDNI() == id) {
                table[0][0] = i.getDNI();
                table[0][1] = i.getName();
                table[0][2] = i.getDependency();
                table[0][3] = i.getDate();
                table[0][4] = i.getFile();
            }
        }
        return table;
    }
    
    //UPDATE/modificar
    public void Update(long dni,String n, String d, Date date, String f) {
        for (Employee i : person) {
            if (i.getDNI() == dni) {
                i.setName(n);
                i.setDependency(d);
                i.setDate(date);
                i.setFile(f);
            }
        }
    }
    
    //DELETE/Eliminar
    public void Delete(long dni) {
        for (Employee i : person) {
            if (i.getDNI() == dni) {
                person.remove(i);
                break;
            }
        }
    }
    
    

}
