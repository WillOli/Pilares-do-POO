public class Mensageiros {
    public static void main(String[] args) {
        FacebookMessenger fbc = new FacebookMessenger();
        fbc.enviarMensagem();
        fbc.receberMensagem();
        MSNMessenger msn = new MSNMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();
        Telegram tlg = new Telegram();
        tlg.enviarMensagem();
        tlg.receberMensagem();
    }
}