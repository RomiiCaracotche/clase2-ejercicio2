public class Cuenta {
    private int numero;
    private long dni;
    private double saldo;

    public Cuenta(int numero, long dni, float saldo) {
        this.numero = numero;
        this.dni = dni;
        this.saldo = saldo;
    }

    public Cuenta() {}

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void ingresar(double valor) {
        this.saldo = this.saldo + valor;
    }

    public void retirar(double valor) {
        if(valor > this.saldo) {
            this.saldo = 0;
        }
        else {
            this.saldo = this.saldo - valor;
        }
    }

    public void extraccionRapida() {
        this.saldo = this.saldo * 0.8;
    }

    public double consultarSaldo() {
        return this.saldo;
    }

    public String consultarDatos() {
        return "Numero de cuenta: " +this.numero+ ", Dni del titular: " +this.dni+ ", Saldo de la cuenta: " +this.saldo;
    }

}
