public class test {
    public static void main(String[] args) {
        PacienteTest pt = new PacienteTest();
        try {
            pt.testAgregarPaciente();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
