public class Mensageiros {
    public static void main(String[] args) {
        System.out.println("FACEBOOK");
        FacebookMessenger fbc = new FacebookMessenger();
        fbc.enviarMensagem();
        fbc.receberMensagem();

        System.out.println("MSN");
        MSNMessenger msn = new MSNMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();

        System.out.println("Telegram");
        Telegram tlg = new Telegram();
        tlg.enviarMensagem();
        tlg.receberMensagem();
    }
}