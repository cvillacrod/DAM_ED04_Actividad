/**
 * Tarea ED04
 * @author - Cristina Villacastin
 * @version - 15-2-22
 */

package dam_ed04_actividad;

public class Main {

    public static void main(String[] args) {
        operativa_cuenta();
    }
    
    /**
     * Metodo para operar en cuenta, que retira e ingresa saldo a ésta.
     */
    public static void operativa_cuenta()
    {
        CCuenta cuentaCristina;
        double saldoActual;
        float importe;

        cuentaCristina = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuentaCristina.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuentaCristina.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuentaCristina.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
