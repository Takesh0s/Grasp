package Cinegrafista;

public class Cinegrafista {
    private Camera camera;

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    public void gravar() {
        camera.filmar();
    }

    public static void main(String[] args) {
        Cinegrafista cinegrafista = new Cinegrafista();
        cinegrafista.setCamera(new CameraHD());
        cinegrafista.gravar();

        cinegrafista.setCamera(new Camera4K());
        cinegrafista.gravar();
    }
}