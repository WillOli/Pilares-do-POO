public class ServicoMensagemIstantanea {
    public void enviarMensagem() {
        validarConexaoInternet();
        System.out.println("Enviando mensagem");
        salvarHistorico();
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem");
    }
    private void validarConexaoInternet() {
        System.out.println("Conexão com sucesso!");
    }
    private void salvarHistorico() {
        System.out.println("Salvando historico");
    }

}
