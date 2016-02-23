/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.eugeniosolucoes.view.forms;

import br.com.eugeniosolucoes.app.Main;
import br.com.eugeniosolucoes.util.MyFilter;
import br.com.eugeniosolucoes.util.MyStrings;
import br.com.eugeniosolucoes.util.TratadorArquivoRemessa;
import java.awt.Desktop;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.joda.time.LocalDateTime;

/**
 *
 * @author eugenio
 */
public class MainForm extends BaseForm {

    static final Logger LOG = Logger.getLogger( MainForm.class.getName() );

    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
        setup();
    }

    private void setup() {
        mostrarAjuda( jpConteudo );
        exibirModoTeste();
        setExtendedState( MAXIMIZED_BOTH );
        try {
            resizeBackGround();
        } catch ( IOException ex ) {
            LOG.log( Level.SEVERE, ex.getMessage(), ex );
        }
    }

    private void exibirModoTeste() {
        if ( Main.isTestMode() ) {
            this.setTitle( String.format( "%s (MODO TESTE ATIVADO: BANCO: %s - EMAIL: %s)", this.getTitle(), Main.getDBTest(), Main.getEmailTest() ) );
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpConteudo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBarMain = new javax.swing.JMenuBar();
        jMenuTesouraria = new javax.swing.JMenu();
        mItemEnvioBoletos = new javax.swing.JMenuItem();
        mItemPrepararArqRemessa = new javax.swing.JMenuItem();
        jMenuSistema = new javax.swing.JMenu();
        jMenuConfiguracoes = new javax.swing.JMenu();
        mItemConfigEnvioDeBoletos = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        jpConteudo.setLayout(new java.awt.BorderLayout());

        jLabel1.setIconTextGap(0);
        jLabel1.setName(""); // NOI18N
        jpConteudo.add(jLabel1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jpConteudo, java.awt.BorderLayout.CENTER);

        jMenuTesouraria.setMnemonic('T');
        jMenuTesouraria.setText("Tesouraria");

        mItemEnvioBoletos.setMnemonic('B');
        mItemEnvioBoletos.setText("Envio de Boletos");
        mItemEnvioBoletos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemEnvioBoletosActionPerformed(evt);
            }
        });
        jMenuTesouraria.add(mItemEnvioBoletos);

        mItemPrepararArqRemessa.setMnemonic('P');
        mItemPrepararArqRemessa.setText("Preparar Arquivo de Remessa");
        mItemPrepararArqRemessa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemPrepararArqRemessaActionPerformed(evt);
            }
        });
        jMenuTesouraria.add(mItemPrepararArqRemessa);

        jMenuBarMain.add(jMenuTesouraria);

        jMenuSistema.setMnemonic('S');
        jMenuSistema.setText("Sistema");

        jMenuConfiguracoes.setMnemonic('C');
        jMenuConfiguracoes.setText("Configurações");

        mItemConfigEnvioDeBoletos.setText("Envio de Boletos...");
        mItemConfigEnvioDeBoletos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemConfigEnvioDeBoletosActionPerformed(evt);
            }
        });
        jMenuConfiguracoes.add(mItemConfigEnvioDeBoletos);

        jMenuSistema.add(jMenuConfiguracoes);
        jMenuSistema.add(jSeparator1);

        mItemSair.setMnemonic('r');
        mItemSair.setText("Sair");
        mItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemSairActionPerformed(evt);
            }
        });
        jMenuSistema.add(mItemSair);

        jMenuBarMain.add(jMenuSistema);

        setJMenuBar(jMenuBarMain);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemSairActionPerformed
        System.exit( 0 );
    }//GEN-LAST:event_mItemSairActionPerformed

    private void mItemEnvioBoletosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemEnvioBoletosActionPerformed
        new BoletoForm( this, "Envio de Boletos", true ).setVisible( true );
    }//GEN-LAST:event_mItemEnvioBoletosActionPerformed

    private void mItemConfigEnvioDeBoletosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemConfigEnvioDeBoletosActionPerformed
        new ConfigEnvioDeBoletoForm( this, "Configuração de Envio de Boletos", true ).setVisible( true );
    }//GEN-LAST:event_mItemConfigEnvioDeBoletosActionPerformed

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        try {
            resizeBackGround();
        } catch ( Exception e ) {
            LOG.log( Level.SEVERE, e.getMessage(), e );
        }
    }//GEN-LAST:event_formComponentResized

    private void mItemPrepararArqRemessaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemPrepararArqRemessaActionPerformed
        JFileChooser arquivo = new JFileChooser();
        arquivo.setDialogTitle( "Selecione o arquivo de remessa a ser preparado." );
        arquivo.setDialogType( JFileChooser.OPEN_DIALOG );
        arquivo.setFileFilter( new MyFilter( "txt" ) );
        arquivo.setFileSelectionMode( JFileChooser.FILES_AND_DIRECTORIES );
        arquivo.setApproveButtonText( "Abrir" );

        int r = arquivo.showOpenDialog( null );

        if ( r == JFileChooser.APPROVE_OPTION ) {
            try {
                //txtListaDeEmail.setText( arquivo.getSelectedFile().getCanonicalPath() );
                JOptionPane.showMessageDialog( this, "Favor aguardar a geração do arquivo!" , this.getTitle(), JOptionPane.INFORMATION_MESSAGE );
                TratadorArquivoRemessa tar = new TratadorArquivoRemessa();
                File f = arquivo.getSelectedFile();
                String conteudo = tar.corrigirArquivo( f );
                String nomeArquivo = tar.criarNovoArquivo( f.getCanonicalPath(), conteudo );
                MyStrings.exibeMensagem( String.format( "Arquivo de Remessa preparado com sucesso!%nLocal: %s", nomeArquivo ) );
            } catch ( Exception ex ) {
                JOptionPane.showMessageDialog( this, "Houve erro ao gerar o arquivo!\nSerá exibido o arquivo de log com os problemas!" , this.getTitle(), JOptionPane.ERROR_MESSAGE );
                exibirLogErroRemessa( ex );
            }
        }
    }//GEN-LAST:event_mItemPrepararArqRemessaActionPerformed

    private void exibirLogErroRemessa( Exception ex ) {
        try {
            LOG.log( Level.SEVERE, ex.getMessage(), ex );
            String nomeArquivoLog = String.format( "log-arquivo-remessa%s.txt", TratadorArquivoRemessa.SUFIXO_ARQUIVO_LOG.format( LocalDateTime.now().toDate() ) );
            try ( FileWriter writer = new FileWriter( nomeArquivoLog ) ) {
                writer.append( ex.getMessage() );
            } catch ( IOException ex1 ) {
                LOG.log( Level.SEVERE, ex.getMessage(), ex1 );
            }
            Desktop.getDesktop().open( new File( nomeArquivoLog ));
        } catch ( IOException ex1 ) {
            LOG.log( Level.SEVERE, ex.getMessage(), ex1 );
        }
    }

    private void resizeBackGround() throws IOException {
        BufferedImage image = ImageIO.read( getClass().getResourceAsStream( "/imagens/background.jpg" ) );
        ImageIcon imageIcon = new ImageIcon( fitImage( image, getWidth(), getHeight() ) );
        jLabel1.setIcon( imageIcon );
    }

    private Image fitImage( Image img, int w, int h ) {
        BufferedImage resizedimage = new BufferedImage( w, h, BufferedImage.TYPE_INT_RGB );
        Graphics2D g2 = resizedimage.createGraphics();
        g2.setRenderingHint( RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR );
        g2.drawImage( img, 0, 0, w, h, null );
        g2.dispose();
        return resizedimage;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBarMain;
    private javax.swing.JMenu jMenuConfiguracoes;
    private javax.swing.JMenu jMenuSistema;
    private javax.swing.JMenu jMenuTesouraria;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPanel jpConteudo;
    private javax.swing.JMenuItem mItemConfigEnvioDeBoletos;
    private javax.swing.JMenuItem mItemEnvioBoletos;
    private javax.swing.JMenuItem mItemPrepararArqRemessa;
    private javax.swing.JMenuItem mItemSair;
    // End of variables declaration//GEN-END:variables
}
