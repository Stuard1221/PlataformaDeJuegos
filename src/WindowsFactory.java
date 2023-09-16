class WindowsFactory implements AbstractFactory {
    public Boton crearBoton() {
        return new BotonWindows();
    }

    public Ventana crearVentana() {
        return new VentanaWindows();
    }
}
