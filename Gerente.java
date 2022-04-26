public class Gerente extends Funcionario implements Autenticavel {

    private AutenticacaoUtil autenticador;

    public Gerente(){
        this.autenticador = new AutenticacaoUtil();
    }
    
    
    public double getBonificacao(){
        System.out.println("Aqui é a bonificação do Gerente");

        return super.getSalario();

    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha)
    {
        boolean autenticou = this.autenticador.autentica(senha);
        return autenticou;
    }


}
