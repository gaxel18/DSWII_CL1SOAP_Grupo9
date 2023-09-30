package pe.edu.cibertec.DSWII_CL1SOAP_Grupo9.converter;


import org.springframework.stereotype.Component;
import pe.edu.cibertec.DSWII_CL1SOAP_Grupo9.model.Paciente;
import pe.edu.cibertec.ws.objects.Pacientews;

import java.util.ArrayList;
import java.util.List;

@Component
public class PacienteConvert {

    public Paciente convertPacienteWsToPaciente(Pacientews pacientews) {
        Paciente paciente = new Paciente();
        paciente.setIdpaciente(pacientews.getIdpaciente());
        paciente.setNompaciente(pacientews.getNompaciente());
        paciente.setApepaciente(pacientews.getApepaciente());
        paciente.setDocpaciente(pacientews.getDocpaciente());
        paciente.setFechanacpaciente(pacientews.getFechanacpaciente());
        paciente.setEmailPaciente(pacientews.getEmailpaciente());
        return paciente;
    }

    public Pacientews convertPacienteToPacienteWs(Paciente paciente) {
        Pacientews pacientews = new Pacientews();
        pacientews.setIdpaciente(paciente.getIdpaciente());
        pacientews.setNompaciente(paciente.getNompaciente());
        pacientews.setApepaciente(paciente.getApepaciente());
        pacientews.setDocpaciente(paciente.getDocpaciente());
        pacientews.setFechanacpaciente(paciente.getFechanacpaciente());
        pacientews.setEmailpaciente(paciente.getEmailPaciente());
        return pacientews;
    }

    public List<Paciente> convertPacienteWsToPaciente(
            List<Pacientews> pacientewsList) {
        List<Paciente> pacienteList = new ArrayList<>();
        for (Pacientews pacientews : pacientewsList) {
            pacienteList.add(convertPacienteWsToPaciente(pacientews));
        }
        return pacienteList;
    }

    public List<Pacientews> convertPacienteToPacienteWs(
            List<Paciente> pacienteList) {
        List<Pacientews> pacientewsList = new ArrayList<>();
        for (Paciente paciente : pacienteList) {
            pacientewsList.add(convertPacienteToPacienteWs(paciente));
        }
        return pacientewsList;
    }
}