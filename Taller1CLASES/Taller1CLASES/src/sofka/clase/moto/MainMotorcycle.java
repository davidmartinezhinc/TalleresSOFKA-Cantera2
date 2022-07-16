package sofka.clase.moto;

public class MainMotorcycle {
    public static void main(String[] args) {
        Motorcycle motorcycle = new Motorcycle("xyz123","AKT","blue",true);
        Motorcycle motorcycle1 = new Motorcycle("xyz123","AKT125","red",false);

        boolean status = motorcycle.isStatus();
        boolean status1 = motorcycle1.isStatus();
        if (status==true){
            motorcycle.statusOn();

        }else {
            motorcycle.statusOff();

        }
        if (status1==true){

            motorcycle1.statusOn();
        }else {

            motorcycle1.statusOff();
        }
        System.out.println(motorcycle);
        System.out.println(motorcycle1);
    }
}
