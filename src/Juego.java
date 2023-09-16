class Juego {
    private AbstractFactory factory;

    public Juego(AbstractFactory factory) {
        this.factory = factory;
    }

    public void renderUI() {
        Boton boton = factory.crearBoton();
        Ventana ventana = factory.crearVentana();

        boton.render();
        ventana.render();
    }
}
