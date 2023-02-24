package clases;

public class CuentaBancaria {
    //Atributos
    private int accountNumber;
    protected boolean activated;

    // Constructor
    public Fruta(int accountNumber, boolean activated) {
        this.accountNumber = accountNumber;
        this.activated = activated;
    }
    // Métodos
    public void setActived(boolean activated){
        this.activated = activated
    }
    public void getActived(){
        return activated;

    }

}