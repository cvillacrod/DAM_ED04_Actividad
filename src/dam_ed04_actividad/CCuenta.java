/*
 * Clase CuentaCorriente de la Tarea ED04
 * @author - Cristina Villacastin
 * @version - 15-2-22
 */

package dam_ed04_actividad;

/**
 *
 * @author villr
 */
public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;     

    /**
     * Metodo constructor de la cuenta, con el nombre, cuenta, saldo y el interes dado
     * @param nom
     * @param cue
     * @param sal
     * @param tipo de interes
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Metodo para poner nombre  a la cuenta
     * @param nom
     */
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }

    /**
     * Metodo para obtener el nombre de la cuenta
     * @return nombre de la cuenta
     */
    public String obtenerNombre()
    {
        return getNombre();
    }
    /**
     * Metodo para obtener el saldo de la cuenta
     * @return saldo de la cuenta
     */
    public double estado()
    {
        return getSaldo();
    }

   /**
    * Metodo para ingresar una cantidad a la cuenta
    * @param cantidad
    * @throws Exception 
    */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Metodo para sacar una cantidad de la cuenta
     * @param cantidad
     * @throws Exception 
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Metodo para obtener la cuenta, llamando al getter de cuenta
     * @return la cuenta
     */
    public String obtenerCuenta()
    {
        return getCuenta();
    }

    /**
     * Metodo para obtener el nombre de la cuenta
     * @return el nombre de la cuenta
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Metodo para dar nombre a la cuenta
     * @param nombre  de la cuenta
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo para obtener la cuenta
     * @return la cuenta
     */
    public String getCuenta() {
        return cuenta;
    }
    /**
     * Metodo para dar la cuenta
     * @param cuenta 
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Metodo para obtener el saldo de la cuenta
     * @return 
     */
    public double getSaldo() {
        return saldo;
    }
    /**
     * Metodo para dar el saldo a la cuenta
     * @param saldo 
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    /**
     * Metodo para obtener el tipo de interes de la cuenta
     * @return tipo de interes
     */
    public double getTipoInterés() {
        return tipoInterés;
    }
    /**
     * Metodo para dar el tipo de interes de la cuenta
     * @param tipoInterés de la cuenta
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
    
    
}
