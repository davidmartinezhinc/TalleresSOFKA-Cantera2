package sofka.clase.cuentabancaria;
/**
 * Representa un banco, el cual realiza acciones  sencillas como activar y desactivar
 * un numero de cuenta o cuenta bancaria.
 *
 * @autor David Martinez Hincapié
 */
public class BankAccount {
    private int accountNumber;
    protected boolean activated;

    /**
     * Se crea una instancia de la clase Employee
     */
    public BankAccount(){

    }

    /**
     * Es el constructor de esta clase con sus propiedades
     * @param accountNumber Primer atributo de la clase
     * @param activated Segundo atributo de la clase
     */
    public BankAccount(int accountNumber, boolean activated) {
        this.accountNumber = accountNumber;
        this.activated = activated;
    }

    public BankAccount(boolean activated) {
        this.activated = activated;
    }
    /**
     * Acá se generaron los getters and setters de la propiedade que tiene la clase BankAccount
     * @return
     */
    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }
    /**
     * Retorna todos los valores de los atributos como String debidamente ordenados a la hora de imprimir
     * @return
     */
    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", activated=" + activated +
                '}';
    }
}
