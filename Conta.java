public  abstract class Conta{
    protected int numero;
    protected Cliente titular;
    protected double saldo;

    public Conta(int numero, Cliente titular){
        this.numero = numero;
        this.setTitular(titular);;
    }
    
    public void depositar(double valor){
        this.saldo = this.getSaldo() + valor;
    }
    
    public abstract boolean sacar(double valor);
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public int getNumero(){
        return this.numero;
    }
    
    public Cliente getTitular(){
        return this.titular;
    }
    
    public void setTitular(Cliente titular){
        this.titular = titular;
    }
}