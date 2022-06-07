package com.mycompany.aula011;
public final class Bolsista extends Aluno {
    //Atributos 
    private float bolsa;
    
    //Metodos
    public void Bolsista(){
        System.out.println("===============Bolsista=============");
    }
    public void renovarbolsa(){
        System.out.println(" Renovando a bolsa do aluno " + this.getNome());
    }

    @Override
    public void pagarMensalidade(){
        System.out.println(this.getNome() + " é bolsista o pagamento, é facilitado! ");
    }
    
    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

    
    
}
