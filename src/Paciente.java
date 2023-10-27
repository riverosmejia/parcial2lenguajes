class Paciente {
    int identificacion;
    int sintomas;
    String nombre;
    String estado;

    public Paciente(int identificacion, int sintomas, String nombre) {
        this.identificacion = identificacion;
        this.sintomas = sintomas;
        this.nombre = nombre;

        // Determina el estado del paciente según el número de síntomas
        if (sintomas > 10) {
            this.estado = "paciente crítico";
        } else if (sintomas >= 5) {
            this.estado = "paciente urgente";
        } else {
            this.estado = "paciente no crítico";
        }
    }
}