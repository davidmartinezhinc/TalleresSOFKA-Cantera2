package sofka.clase.empleado;
/**
 * Representa un empleado al cual se le registran atributos específicos del trabajo
 *
 * @autor David Martinez Hincapié
 */
public class Employee {
    private String name ;
    private String lastName;
    private int salary;
    private int seniority;

    /**
     * Se crea una instancia de la clase Employee
     */
    public Employee(){

    }

    /**
     * Es el constructor de esta clase con 3 de sus propiedades
     * @param name Primer atributo de la clase empleado
     * @param lastName Segundo atributo de la clase empleado
     * @param salary Tercer atributo de la clase empleado
     */
    public Employee(String name, String lastName, int salary){
        this.name =name;
        this.lastName=lastName;
        this.salary=salary;
    }

    /**
     * Es el constructor de esta clase con sus propiedades
     * @param name Primer atributo de la clase empleado
     * @param lastName Segundo atributo de la clase empleado
     * @param salary Tercer atributo de la clase empleado
     * @param seniority Cuarto atributo de la clase empleado
     */
    public Employee(String name, String lastName, int salary,int seniority){

        this.name =name;
        this.lastName=lastName;
        this.salary=salary;
        this.seniority=seniority;
    }
    /**
     * Acá se generaron los getters and setters de las 4 propiedades que tiene la clase Employee
     * @return
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSeniority() {
        return seniority;
    }

    public void setSeniority(int seniority) {
        this.seniority = seniority;
    }
    /**
     * Retorna todos los valores de los atributos como String debidamente ordenados a la hora de imprimir
     * @return
     */
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", seniority=" + seniority +
                '}';
    }
}
