package dao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import modelo.Paciente;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PacienteDAOTest {

    private PacienteDAO pacienteDAO;

    public PacienteDAOTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        pacienteDAO = new PacienteDAO();

    }

    @After
    public void tearDown() {
    }

    @Test
    public void testPaciente() throws Exception {
        //Fazendo alguns testes, por exemplo, se a lista não está nula, outra seria se a lista é maior que 10 registros.
        ArrayList<Paciente> listaPacientes = pacienteDAO.buscarPaciente();
        assertNotNull(listaPacientes);
        assertTrue(listaPacientes.size()>10);
        
    }
    @Test 
    public void testEncontraPacientePeloCpf() throws Exception{
        String cpf = "456.789.123-00";
        
        ArrayList<Paciente> listaPacientes = pacienteDAO.buscarPacienteFiltro("where CPF = '" + cpf + "'");
        assertNotNull(listaPacientes);
    }
    @Test
	public void testCadastrarPaciente() throws Exception {
		System.out.println("testCadastrarPaciente");

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Paciente pac = new Paciente();
                
                pac.setNome("TesteName");
                pac.setEndereco("Rua testerua 172");
                pac.setDataNascimento(sdf.parse("01/02/2023"));
		pac.setTelefone("(51)88888-7777");
		pac.setCpf("123.456.789-00");
		pac.setRg("5049113359");
		pac.setConvenio(1);
		

		PacienteDAO instance = new PacienteDAO();
		instance.cadastrarPaciente(pac);
                
                 Assert.assertNotNull(pac); // verificando se o objeto do tipo Paciente não é nulo
                 Assert.assertEquals("TesteName", pac.getNome()); // verificando se o nome do objeto do tipo Paciente é igual ao nome que foi inserido no banco de dados   
	}

}
