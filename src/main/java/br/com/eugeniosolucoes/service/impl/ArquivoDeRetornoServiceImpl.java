/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.eugeniosolucoes.service.impl;

import br.com.eugeniosolucoes.service.ArquivoDeRetornoService;
import br.com.eugeniosolucoes.view.model.DadosBoletoPagoModel;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author eugenio
 */
public class ArquivoDeRetornoServiceImpl implements ArquivoDeRetornoService {

    private static final Logger LOG = Logger.getLogger( ArquivoDeRetornoServiceImpl.class.getName() );

    @Override
    public List<DadosBoletoPagoModel> lerArquivoDeRetorno( File file ) {
        try ( Scanner scanner = new Scanner( file ) ) {
            return criarLista( scanner );
        } catch ( FileNotFoundException ex ) {
            LOG.log( Level.SEVERE, ex.getMessage(), ex );
            throw new IllegalStateException( "Arquivo não encontrado!" );
        }
    }

    @Override
    public List<DadosBoletoPagoModel> lerArquivoDeRetorno( InputStream file ) {
        Scanner scanner = new Scanner( file );
        return criarLista( scanner );
    }

    private List<DadosBoletoPagoModel> criarLista( Scanner scanner ) {
        List<DadosBoletoPagoModel> model = new ArrayList<>();
        StringBuilder arquivo = new StringBuilder();
        StringBuilder erro = new StringBuilder();
        int cont = 0;
        List<String> lista = new ArrayList<>( 
                Arrays.asList( 
                        "003876-06", 
                        "004038-06", 
                        "003352-06", 
                        "004178-04",
                        "003986-06",
                        "003945-06",
                        "003965-06" ));
        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();
            if ( linha.charAt( 13 ) == 'T' && lista.contains( linha.substring( 54, 63 ) ) ) {
                System.out.println( linha );
                System.out.println( scanner.nextLine() );
            }
            cont++;
        }
        return model;

    }

    @Override
    public void processarBaixaDeBoleto( DadosBoletoPagoModel boletoPagoModels ) {
        throw new UnsupportedOperationException( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void processarBaixaDeBoleto( List<DadosBoletoPagoModel> boletoPagoModels ) {
        throw new UnsupportedOperationException( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

}
