public class Pasajero implements Comparable<Pasajero> {
    private String nombre;
    private int numeroAsiento;
    private String tipoAsiento;
    private Boolean checkin;
    private int prioridad;
    private void transformarPrioridad(){
        if(tipoAsiento.compareToIgnoreCase("ECONOMICA")==0){
            prioridad=3;
        }else if(tipoAsiento.compareToIgnoreCase("EJECUTIVA")==0){
            prioridad=2;
        }else{
            prioridad=1;
        }
    }

    public Pasajero(String nombre, int numeroAsiento, String tipoAsiento) {
        this.nombre = nombre;
        this.numeroAsiento = numeroAsiento;
        this.tipoAsiento = tipoAsiento;
        checkin=false;
        transformarPrioridad();
    }

    public void setCheckin(Boolean checkin) {
        this.checkin = checkin;
    }

    @Override
    public String toString() {
        return "Pasajero " +
                "nombre: " + nombre +
                ", No. Asiento: " + numeroAsiento +
                ", Categoria: '" + tipoAsiento +
                ", checkin: " + checkin +"\n";
    }


    @Override
    public int compareTo(Pasajero o) {
        return Integer.compare(prioridad,o.prioridad);
    }
}
