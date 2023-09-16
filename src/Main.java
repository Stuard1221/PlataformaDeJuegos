public class Main {
    public static void main(String[] args) {
        // Paso 5: Implementa el juego y muestra los elementos de la interfaz de usuario.
        AbstractFactory windowsFactory = new WindowsFactory();
        Juego juegoParaWindows = new Juego(windowsFactory);
        juegoParaWindows.renderUI();

        AbstractFactory macFactory = new MacFactory();
        Juego juegoParaMac = new Juego(macFactory);
        juegoParaMac.renderUI();

        AbstractFactory linuxFactory = new LinuxFactory();
        Juego juegoParaLinux = new Juego(linuxFactory);
        juegoParaLinux.renderUI();
    }
}