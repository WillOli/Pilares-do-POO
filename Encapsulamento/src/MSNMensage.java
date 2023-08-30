public class MSNMensage {
    public void enviaMensagem() {
        validarConexao();
        System.out.println("Mensagem enviada");
        salvarHistoricoMensagem();
    }
    public void receberMensagem() {
        System.out.println("Mensagem recebida");
    }

    private void validarConexao() {
        System.out.println("Conexão com sucesso!");
    }
    private void salvarHistoricoMensagem() {
        System.out.println("Historico salvo.");
    }
}
