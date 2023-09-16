class MacFactory implements AbstractFactory {
    public Boton crearBoton() {
        return new BotonMac();
    }

    public Ventana crearVentana() {
        return new VentanaMac();
    }
}