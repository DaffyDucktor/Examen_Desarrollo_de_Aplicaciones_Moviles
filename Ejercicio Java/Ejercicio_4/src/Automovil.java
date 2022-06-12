public class Automovil {
    private String marca;
    private String fechaLanzamiento;
    private String modelo;
    private String capacidad;
    private String asientos;
    private boolean detPuntosCiegos;
    private boolean controlCrucero;

    public Automovil() {
    }

    public Automovil(String marca, String fechaLanzamiento, String modelo, String capacidad, String asientos, boolean detPuntosCiegos, boolean controlCrucero) {
        this.marca = marca;
        this.fechaLanzamiento = fechaLanzamiento;
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.asientos = asientos;
        this.detPuntosCiegos = detPuntosCiegos;
        this.controlCrucero = controlCrucero;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(String fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getAsientos() {
        return asientos;
    }

    public void setAsientos(String asientos) {
        this.asientos = asientos;
    }

    public boolean isDetPuntosCiegos() {
        return detPuntosCiegos;
    }

    public void setDetPuntosCiegos(boolean detPuntosCiegos) {
        this.detPuntosCiegos = detPuntosCiegos;
    }

    public boolean isControlCrucero() {
        return controlCrucero;
    }

    public void setControlCrucero(boolean controlCrucero) {
        this.controlCrucero = controlCrucero;
    }
}
