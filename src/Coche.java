public class Coche {
    private String marca;
    private String modelo;
    private int anio;

    public Coche(String marca, String modelo, int anio) {
        if (anio < 1886){
            System.out.println("El coche es bastante viejo");
            return;
        }

        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        System.out.println("Coche " + this.marca + " " + this.modelo + " es " + this.anio);
    }

    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}
