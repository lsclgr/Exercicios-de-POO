
package projetocontabancaria;

public class ContaBancaria {
    private String nomecliente; 
    private int numero;
    private int agencia;
    private double saldo;
    private boolean especial;

    private static int quantidadeContas = 1;
    
    public ContaBancaria(String nomecliente, int agencia, double saldo, boolean especial) {
        this.nomecliente = nomecliente;
        this.numero = quantidadeContas;
        this.agencia = agencia;
        this.saldo = saldo;
        this.especial = especial;
        quantidadeContas++;
    }

    public ContaBancaria() {
        this.saldo = 0;
        this.especial = false;
    }

    public String getNomecliente() {
        return nomecliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isEspecial() {
        return especial;
    }        
            
    public void deposito(double valorDeposito){
        this.saldo += valorDeposito;
    } 
    
    public boolean saque(double valorSaque){
        if(this.especial == true || this.saldo >= valorSaque){
            this.saldo -= valorSaque;
            if(this.saldo < 0){
            System.out.println("Você está no cheque especial!!!");
        }       
            return true;
        }else{
            return false;
        }
    }
    public void extratoConta(){
        System.out.println("Cliente: " + this.nomecliente);
        System.out.println("Saldo da conta: " + this.saldo);
    }
    public void transferencia(ContaBancaria destino, double valorTransferencia) {
        if (this.especial == true || this.saldo >= valorTransferencia) {
            this.saldo -= valorTransferencia;
            destino.deposito(valorTransferencia);
        }
        if (this.saldo < 0) {
            System.out.println("Você está no cheque especial!!!");
        }
    }
}
