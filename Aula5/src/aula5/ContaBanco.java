package aula5;
public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    
    public void estadoAtual(){
        System.out.println("-------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
        
    }
    
       public ContaBanco(){
        this.saldo = 0;
        this.status = false;
    }    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if("CC".equals(t)){
            this.setSaldo(50);
        }
        else if("CP".equals(t)){
            this.setSaldo(150);
        }   
        System.out.println("Conta aberta com sucesso! ");
    }
    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Conta nao pode ser fechada ainda tem dinheiro");
        }
        else if (this.getSaldo() < 0){
            System.out.println("Conta nao pode ser fechada pois tem debito");                
        }
        else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso! ");
        }
        }
    
    public void depositar(float v){
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado com sucesso na conta de " + this.getDono());
        }
        else{
            System.out.println("Impossivel depositar em uma conta fechada");
    }
    }
    public void sacar(double v){
        if (this.getStatus()){
            if (this.getSaldo() >= v){
                this.setSaldo(this.getSaldo()-v);
                System.out.println("Saque realizado na conta de" + this.getDono());
            }
            else{
               System.out.println("Saldo insuficiente");
            }
            }
        else{
            System.out.println("Impossivel sacar de uma conta !");
        }
        }
    
    public void pagarMensal(){
        int v = 0;
        if("CC".equals(this.getTipo())){
            v = 12;
        }
        else if("CP".equals(this.getTipo())){
            v = 20;
        }
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso" + this.getDono());
            }
            else{
                System.out.println("Impossivel pagar uma conta fechada");
            }
        }
        
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getDono() {
        return dono;
    }    
    
    public void setDono(String d) {
        this.dono = d;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double s) {
        this.saldo = s;
    }
    
     public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
     
}
