class Clasf_Pacientes {
    public static void clasificarpaciente(Paciente paciente) {
        if (paciente.getSin() > 10) {
            paciente.setStado("paciente crítico");
        } else if (paciente.getSin() >= 5 && paciente.getSin() <= 10) {
            paciente.setStado("paciente urgente");
        } else if (paciente.getSin() < 5) {
            paciente.setStado("paciente no crítico");
        }
    }
}

