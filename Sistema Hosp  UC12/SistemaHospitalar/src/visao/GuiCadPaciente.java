
package visao;

import dao.ConvenioDAO;
import dao.PacienteDAO;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import modelo.Convenio;
import modelo.Paciente;
import servicos.ConvenioServicos;
import servicos.ServicosFactory;

public class GuiCadPaciente extends javax.swing.JInternalFrame {

  
    public GuiCadPaciente() {
        initComponents();
        preencherCombo();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jlNome = new javax.swing.JLabel();
        jlCpf = new javax.swing.JLabel();
        jlEndereco = new javax.swing.JLabel();
        jtNome = new javax.swing.JTextField();
        jtEndereco = new javax.swing.JTextField();
        jlEspecialidade = new javax.swing.JLabel();
        jlDataNasc = new javax.swing.JLabel();
        jlTelefone = new javax.swing.JLabel();
        jlEmail1 = new javax.swing.JLabel();
        jtEmail1 = new javax.swing.JTextField();
        jlRG = new javax.swing.JLabel();
        jtRG = new javax.swing.JTextField();
        jcConvenio = new javax.swing.JComboBox<>();
        jtCpf = new javax.swing.JFormattedTextField();
        jtTelefone = new javax.swing.JFormattedTextField();
        jtDataNasc = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jbLimpar = new javax.swing.JButton();
        jbCadastrar1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("CADASTRO PACIENTE");

        jLayeredPane1.setBackground(new java.awt.Color(204, 255, 255));
        jLayeredPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLayeredPane1.setOpaque(true);

        jlNome.setText("Nome");
        jLayeredPane1.add(jlNome);
        jlNome.setBounds(40, 20, 60, 30);

        jlCpf.setText("CPF");
        jLayeredPane1.add(jlCpf);
        jlCpf.setBounds(40, 60, 90, 30);

        jlEndereco.setText("Endereço");
        jLayeredPane1.add(jlEndereco);
        jlEndereco.setBounds(40, 140, 60, 30);
        jLayeredPane1.add(jtNome);
        jtNome.setBounds(140, 20, 210, 30);
        jLayeredPane1.add(jtEndereco);
        jtEndereco.setBounds(140, 140, 210, 30);

        jlEspecialidade.setText("Convênio");
        jLayeredPane1.add(jlEspecialidade);
        jlEspecialidade.setBounds(40, 300, 100, 30);

        jlDataNasc.setText("Data Nascimento");
        jLayeredPane1.add(jlDataNasc);
        jlDataNasc.setBounds(40, 260, 100, 30);

        jlTelefone.setText("Telefone");
        jLayeredPane1.add(jlTelefone);
        jlTelefone.setBounds(40, 180, 50, 30);

        jlEmail1.setText("E-mail");
        jLayeredPane1.add(jlEmail1);
        jlEmail1.setBounds(40, 220, 90, 30);
        jLayeredPane1.add(jtEmail1);
        jtEmail1.setBounds(140, 220, 210, 30);

        jlRG.setText("RG");
        jLayeredPane1.add(jlRG);
        jlRG.setBounds(40, 100, 90, 30);
        jLayeredPane1.add(jtRG);
        jtRG.setBounds(140, 100, 210, 30);

        jLayeredPane1.add(jcConvenio);
        jcConvenio.setBounds(140, 300, 150, 30);

        try {
            jtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jLayeredPane1.add(jtCpf);
        jtCpf.setBounds(140, 60, 110, 30);

        try {
            jtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jLayeredPane1.add(jtTelefone);
        jtTelefone.setBounds(140, 182, 210, 30);

        try {
            jtDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jLayeredPane1.add(jtDataNasc);
        jtDataNasc.setBounds(140, 260, 60, 30);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("*");
        jLayeredPane1.add(jLabel1);
        jLabel1.setBounds(300, 270, 20, 20);
        jLayeredPane1.add(jLabel2);
        jLabel2.setBounds(260, 70, 0, 0);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("PREENCHIMENTO OBRIGATÓRIO *");
        jLayeredPane1.add(jLabel7);
        jLabel7.setBounds(40, 340, 230, 20);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("*");
        jLayeredPane1.add(jLabel8);
        jLabel8.setBounds(360, 150, 6, 20);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("*");
        jLayeredPane1.add(jLabel9);
        jLabel9.setBounds(360, 30, 20, 20);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("*");
        jLayeredPane1.add(jLabel10);
        jLabel10.setBounds(270, 70, 20, 20);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("*");
        jLayeredPane1.add(jLabel11);
        jLabel11.setBounds(300, 310, 20, 20);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("*");
        jLayeredPane1.add(jLabel12);
        jLabel12.setBounds(360, 190, 20, 20);

        jLayeredPane2.setBackground(new java.awt.Color(255, 255, 255));
        jLayeredPane2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLayeredPane2.setOpaque(true);

        jbLimpar.setText("limpar");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });
        jLayeredPane2.add(jbLimpar);
        jbLimpar.setBounds(290, 20, 140, 40);

        jbCadastrar1.setText("cadastrar");
        jbCadastrar1.setMinimumSize(new java.awt.Dimension(78, 20));
        jbCadastrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrar1ActionPerformed(evt);
            }
        });
        jLayeredPane2.add(jbCadastrar1);
        jbCadastrar1.setBounds(80, 20, 140, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                    .addComponent(jLayeredPane2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public boolean validarCpf(){
        try {
            PacienteDAO pacDAO = new PacienteDAO();
            ArrayList<Paciente> paciente = pacDAO.buscarPacienteFiltro("where CPF = '" + jtCpf.getText() + "'");
            if(paciente.isEmpty()){
                return true;
            }
            else{
                return false;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
     private void cadastrar() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Paciente pac = new Paciente();

            // Atribuindo valores aos atributos do Paciente com base nos campos preenchidos pelo usuário na tela
            if(jtEndereco.getText().length() >=201){
                throw new Exception("O endereço fornecido é muito longo. Por favor, insira um endereço com no máximo 200 caracteres");
            }
            if(jtNome.getText().length() >= 56){
                throw new Exception("O nome fornecido é muito longo. Por favor, insira um nome com no máximo 55 caracteres.");
            }
            if(validarCpf() == false){
                throw new Exception("o cpf informado já esta cadastrado");
            }
            pac.setNome(jtNome.getText());
            pac.setEndereco(jtEndereco.getText());
            pac.setDataNascimento(sdf.parse(jtDataNasc.getText()));
            pac.setTelefone(jtTelefone.getText());
            pac.setEmail(jtEmail1.getText());
            pac.setCpf(jtCpf.getText());
            pac.setRg(jtRG.getText());

            // Verificando se um convênio foi selecionado no JComboBox
            if (!(jcConvenio.getSelectedIndex() == 0)) {

                // Obtendo o nome do convênio selecionado pelo usuário
                String conv = jcConvenio.getSelectedItem().toString();

                // Criando objeto ConvenioDAO para buscar o convênio no banco de dados
                ConvenioDAO convDAO = new ConvenioDAO();

                // Buscando o convênio no banco de dados com base no nome selecionado pelo usuário
                Convenio convenio = convDAO.buscarConvenioFiltro(conv);

                // Atribuindo o ID do convênio ao paciente
                pac.setConvenio(convenio.getIdConvenio());

            } else {
                JOptionPane.showMessageDialog(this,
                        "Selecione um produto");
            } // fecha else

           // Criando objeto PacienteDAO para cadastrar o paciente no banco de dados
            PacienteDAO pacDAO = new PacienteDAO();
            pacDAO.cadastrarPaciente(pac);

            // Mensagem de sucesso
            JOptionPane.showMessageDialog(this, "Paciente cadastrado com sucesso!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "ERRO! " + e.getMessage());
        } // fecha catch

    }// fecha método
    //apaga valores dos campos
    private void limpar() {
        jtNome.setText("");
        jtCpf.setText("");
        jtRG.setText("");
        jtEndereco.setText("");
        jtTelefone.setText("");
        jtEmail1.setText("");
        jtDataNasc.setText("");
        jcConvenio.setSelectedItem("-Selecione-");
    }// fecha método

    
    // metodo para preencher o combo box com os produtos cadastrados no banco de dados
    private void preencherCombo() {
        try {

            // Buscando objeto ProdutoServicos
            ConvenioServicos ps = ServicosFactory.getConvenioServicos();

            /*
             * Criando um ArrayList<ProdutoVO> vazio
             * para receber o ArrayList com os dados
             */
            ArrayList<Convenio> p = new ArrayList<>();

            // Recebendo o ArrayList cheio em produtos
            p = ps.buscarConvenio();
            
            //Limpar itens existentes no JComboBox antes de preencher
            jcConvenio.removeAllItems();
            
            //Adicionar o item de seleção padrão
            jcConvenio.addItem("-Selecione-");
            
            // Adicionando os dados do ArrayList no JComboBox
            for (int i = 0; i < p.size(); i++) {

                // Adicionando o nome do convênio ao JComboBox
                jcConvenio.addItem(p.get(i).getNomeConvenio());

            } // fecha for

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Erro! " + e.getMessage());
        } // fecha catch
    }// fecha classe

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {
        limpar();
    }

    private void jbCadastrar1ActionPerformed(java.awt.event.ActionEvent evt) {
        if(validainput()){
            cadastrar();
            limpar();
            preencherCombo();
        }
        
    }
    public boolean validainput() {

		boolean validacao = true;

		String nome = jtNome.getText();

		if (nome.isEmpty()) {

			JOptionPane.showMessageDialog(null, "Necessário preencher o nome do Paciente!");
			return false;
		}

		if (nome.matches("va")) {
			JOptionPane.showMessageDialog(null, "Informe um nome válido!");
			return false;
		}

		String cpf = jtCpf.getText();
		if (!cpf.matches("[0-9]{3}[.][0-9]{3}[.][0-9]{3}[-][0-9]{2}")) {

			JOptionPane.showMessageDialog(null, "Informe o CPF!");
			return false;
		}

		String rg = jtRG.getText();
		if (!rg.isEmpty() && !rg.matches("[a-zA-Z0-9]+")) {
			JOptionPane.showMessageDialog(null, "Digite um RG válido.");
			return false;
		}

		String endereco = jtEndereco.getText();

		if (endereco.isEmpty()) {

			JOptionPane.showMessageDialog(null, "Necessário preencher o Endereço!");
			return false;
		}

		String telefone = jtTelefone.getText();
		if (!telefone.matches("[(][0-9]{2}[)][0-9]{4,5}-[0-9]{4}")) {

			JOptionPane.showMessageDialog(null, "Informe o telefone!");
			return false;
		}

		String email = jtEmail1.getText();
		if (!email.isEmpty() && !email.matches(".*@.*")) {
			JOptionPane.showMessageDialog(null, "Digite um endereço de e-mail válido.");
			return false;
		}

		String dataNasc = jtDataNasc.getText();
		if (!dataNasc.matches("^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$")) {
			JOptionPane.showMessageDialog(null, "Digite uma data válida!");
			return false;
		}
		if (jcConvenio.getSelectedIndex() <= 0) {

			JOptionPane.showMessageDialog(null, "Selecione um convênio!");
			return false;

		}

		return true;

	}



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JButton jbCadastrar1;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JComboBox<String> jcConvenio;
    private javax.swing.JLabel jlCpf;
    private javax.swing.JLabel jlDataNasc;
    private javax.swing.JLabel jlEmail1;
    private javax.swing.JLabel jlEndereco;
    private javax.swing.JLabel jlEspecialidade;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlRG;
    private javax.swing.JLabel jlTelefone;
    private javax.swing.JFormattedTextField jtCpf;
    private javax.swing.JFormattedTextField jtDataNasc;
    private javax.swing.JTextField jtEmail1;
    private javax.swing.JTextField jtEndereco;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtRG;
    private javax.swing.JFormattedTextField jtTelefone;
    // End of variables declaration//GEN-END:variables
}
