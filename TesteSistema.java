public class TesteSistema {
    public static void main(String[] args) {

        Gerente g = new Gerente();
        g.setSenha(2222);

        Administrador a = new Administrador();
        a.setSenha(222);

        SistemaInterno sistemaInterno = new SistemaInterno();
        sistemaInterno.autentica(g);
        sistemaInterno.autentica(a);
    }
}
