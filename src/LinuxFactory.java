class LinuxFactory implements AbstractFactory {
    public Boton crearBoton() {
        return new BotonLinux();
    }

    public Ventana crearVentana() {
        return new VentanaLinux();
    }
}