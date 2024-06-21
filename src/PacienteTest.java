
import java.util.Date;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import paciente.PacienteFactory;
import paciente.Tipo;

public class PacienteTest {
    @Test
    public void testAgregarPaciente() throws Exception {
        PacienteFactory pf = new PacienteFactory();
        AdministradorSistema.getInstance().registrarPaciente(
                pf.generatePaciente("Juan", "Perez", "Lima 123", "23367899", "OSDE", new Date(),
                        new String("luismartinez@gmail.com"), Tipo.REGULAR, 45001377));
        assertEquals("Juan", AdministradorSistema.getInstance().getPacientes().get(0).getNombre());
    }
}
