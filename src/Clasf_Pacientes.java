class Clasf_Pacientes {
    public static void clasificarpaciente(Paciente paciente) {
        if (paciente.sintomas > 10) {
            paciente.estado = "paciente crítico";
        } else if (paciente.sintomas >= 5 && paciente.sintomas <= 10) {
            paciente.estado = "paciente urgente";
        } else if (paciente.sintomas < 5) {
            paciente.estado = "paciente no crítico";
        }
    }
}


