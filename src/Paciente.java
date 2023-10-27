class Paciente {
    private int identificacion;
    private int sintomas;
    private String nombre;
    private String estado;

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

    public int getIden(){

        return identificacion;

    }

        public int getSin(){

        return sintomas;

    }

        public String getName(){

        return nombre;

    }

        public String getStado(){

        return estado;

    }

    public void setStado(String s1){

        this.estado=s1;

    }
}