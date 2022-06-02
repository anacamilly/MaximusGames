package visao;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.scene.control.cell.PropertyValueFactory; 
import dominio.*;

import java.net.URL;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

import persistencia.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.awt.Toolkit;

public class InterfaceController implements Initializable {


    private ObservableList<Jogadores> jogue = FXCollections.observableArrayList();
    private ObservableList<Desenvolvedores> desen = FXCollections.observableArrayList();
    private ObservableList<Game> Gm = FXCollections.observableArrayList();
    
    @FXML
    private Button BotaoAlterarDesenvolvedor;

    @FXML
    private Button BotaoAlterarGame;

    @FXML
    private Button BotaoAlterarJogador;

    @FXML
    private Button BotaoBuscarGame;
    
    @FXML
    private Button botao;
    
    @FXML
    private Button BotaoBuscarJogador;

    @FXML
    private Button BotaoCadastrarDesenvolvedor;

    @FXML
    private Button BotaoCadastrarGame;

    @FXML
    private Button BotaoCadastrarJogador;

    @FXML
    private Button BotaoConcluirAlteracaoDesenvolvedor;

    @FXML
    private Button BotaoConcluirAlteracaoGame;

    @FXML
    private Button BotaoConcluirAlteracaoJogador;

    @FXML
    private Button BotaoExcluirDesenvolvedor;

    @FXML
    private Button BotaoExcluirGame;

    @FXML
    private Button BotaoExcluirJogador;

    @FXML
    private Button BotaoNovaAlteracaoDesenvolvedor;

    @FXML
    private Button BotaoNovaAlteracaoGame;

    @FXML
    private Button BotaoNovaAlteracaoJogador;

    @FXML
    private Button BotaoNovaBuscaDesenvolvedores;

    @FXML
    private Button BotaoNovaBuscaGame;

    @FXML
    private Button BotaoNovaBuscaJogador;

    @FXML
    private Button BotaoNovaExclusaoDesenvolvedor;

    @FXML
    private Button BotaoNovaExclusaoGame;

    @FXML
    private Button BotaoNovaExclusaoJogador;

    @FXML
    private Button BotaoNovoCadastroDesenvolvedor;

    @FXML
    private Button BotaoNovoCadastroGame;

    @FXML
    private Button BotaoNovoCadastroJogador;
    
    @FXML
    private Text ExclusaoErroDesenvolvedores;
    
    @FXML
    private Text BuscaErroJogadores;
    
    @FXML
    private Text ExclusaoErroGame;
    
    @FXML
    private Text AlteracaoErroGames;
    
    @FXML
    private Text CadastroErroAcertoJogador;

    @FXML
    private Text ExclusaoErroJogadores;

    @FXML
    private Text AlteracaoErroJogadores;
    
    @FXML
    private Text BuscaErroGames;
    
    @FXML
    private Text BuscaErroDesenvolvedores;
    
    @FXML
    private Text CadastroErroAcertoGame;
    
    @FXML
    private Text AlteracaoErroDesenvolvedores;
    
    @FXML
    private Button BotaoRealizarBuscaDesenvolvedor;

    @FXML
    private StackPane StackAlteracaoDesenvolvedores;

    @FXML
    private StackPane StackAlteracaoFinalDesenvolvedores;

    @FXML
    private StackPane StackAlteracaoFinalGames;

    @FXML
    private StackPane StackAlteracaoFinalJogadores;

    @FXML
    private StackPane StackAlteracaoGames;

    @FXML
    private StackPane StackAlteracaoJogadores;

    @FXML
    private StackPane StackBuscaDesenvolvedores;

    @FXML
    private StackPane StackBuscaFinalJogadores;

    @FXML
    private StackPane StackBuscaGames;

    @FXML
    private StackPane StackBuscaJogadores;

    @FXML
    private StackPane StackCadastroDesenvolvedores;

    @FXML
    private StackPane StackCadastroFinalDesenvolvedores;

    @FXML
    private StackPane StackCadastroFinalGames;

    @FXML
    private StackPane StackCadastroFinalJogadores;

    @FXML
    private StackPane StackCadastroGames;

    @FXML
    private StackPane StackCadastroJogadores;

    @FXML
    private StackPane StackExclusaoDesenvolvedores;

    @FXML
    private StackPane StackExclusaoFinalDesenvolvedores;

    @FXML
    private StackPane StackExclusaoFinalGames;

    @FXML
    private StackPane StackExclusaoFinalJogadores;

    @FXML
    private StackPane StackExclusaoGames;

    @FXML
    private StackPane StackExclusaoJogadores;

    @FXML
    private StackPane StackRealizarAlteracaoGames;

    @FXML
    private StackPane StackRealizarAlteracaoDesenvolvedores;

    @FXML
    private StackPane StackRealizarAlteracaoJogadores;

    @FXML
    private StackPane StackBuscaFinalGames;
    
    @FXML
    private StackPane StackRealizarBuscaDesenvolvedores;

    @FXML
    private StackPane StackTopoDesenvolvedores;

    @FXML
    private StackPane StackTopoDesenvolvedores1;

    @FXML
    private StackPane StackTopoDesenvolvedores3;

    @FXML
    private StackPane StackTopoDesenvolvedores4;

    @FXML
    private StackPane StackTopoGames;

    @FXML
    private StackPane StackTopoGames1;

    @FXML
    private StackPane StackTopoGames2;

    @FXML
    private StackPane StackTopoGames4;

    @FXML
    private StackPane StackTopoJogadores1;

    @FXML
    private StackPane StackTopoJogadores2;

    @FXML
    private StackPane StackTopoJogadores3;

    @FXML
    private StackPane StackTopoJogadores4;

    @FXML
    private Tab TabBotaoAlteracaoDesenvolvedores;

    @FXML
    private Tab TabBotaoAlteracaoGames;

    @FXML
    private Tab TabBotaoAlteracaoJogadores;

    @FXML
    private Tab TabBotaoBuscaDesenvolvedores;

    @FXML
    private Tab TabBotaoBuscaGames;

    @FXML
    private Tab TabBotaoBuscaJogadores;

    @FXML
    private Tab TabBotaoCadastroDesenvolvedores;

    @FXML
    private Tab TabBotaoCadastroGames;

    @FXML
    private Tab TabBotaoCadastroJogadores;

    @FXML
    private Tab TabBotaoDesenvolvedores;

    @FXML
    private Tab TabBotaoExclusaoDesenvolvedores;

    @FXML
    private Tab TabBotaoExclusaoGames;

    @FXML
    private Tab TabBotaoExclusaoJogadores;

    @FXML
    private Tab TabBotaoGames;

    @FXML
    private Tab TabBotaoJogadores;

    @FXML
    private TableColumn<Jogadores, String> TableBuscaCategoriaFavJogadores;

    @FXML
    private TableColumn<Game, String> TableBuscaCategoriaGameDesenvolvedor;

    @FXML
    private TableColumn<Game, String> TableBuscaCategoriaGames;

    @FXML
    private TableColumn<Game, Integer> TableBuscaDataLancGameDesenvolvedor;

    @FXML
    private TableColumn<Game, Integer> TableBuscaDataLancGames;

    @FXML
    private TableColumn<Jogadores, Integer> TableBuscaDataNascJogadores;

    @FXML
    private TableView<Desenvolvedores> TableBuscaDesenvolvedor;

    @FXML
    private TableColumn<Jogadores, String> TableBuscaEmailJogadores;

    @FXML
    private TableColumn<Game, Integer> TableBuscaFaixaEtariaGameDesenvolvedor;

    @FXML
    private TableColumn<Game, Integer> TableBuscaFaixaEtariaGames;

    @FXML
    private TableView<Game> TableBuscaGameDesenvolvedor;

    @FXML
    private TableView<Game> TableBuscaGames;

    @FXML
    private TableColumn<Jogadores, String> TableBuscaGeneroJogadores;

    @FXML
    private TableColumn<Desenvolvedores, Integer> TableBuscaIDDesenvolvedor;

    @FXML
    private TableColumn<Game, Integer> TableBuscaIDGameDesenvolvedor;

    @FXML
    private TableColumn<Game, Integer> TableBuscaIDGames;

    @FXML
    private TableColumn<Jogadores, Integer> TableBuscaIDJogadores;

    @FXML
    private TableView<Jogadores> TableBuscaJogadores;

    @FXML
    private TableColumn<Desenvolvedores, String> TableBuscaLocalDesenvolvedor;

    @FXML
    private TableColumn<Jogadores, String> TableBuscaNascionalidadeJogadores;

    @FXML
    private TableColumn<Jogadores, String> TableBuscaNicknameJogadores;

    @FXML
    private TableColumn<Desenvolvedores, String> TableBuscaNomeDesenvolvedor;

    @FXML
    private TableColumn<Game, String> TableBuscaNomeGameDesenvolvedor;

    @FXML
    private TableColumn<Game, String> TableBuscaNomeGames;

    @FXML
    private TableColumn<Jogadores, String> TableBuscaNomeJogadores;

    @FXML
    private TextField TecladoAlteracaoEmailJogador;

    @FXML
    private TextField TecladoAlteracaoIDDesenvolvedor;

    @FXML
    private TextField TecladoAlteracaoIDGame;

    @FXML
    private TextField TecladoAlteracaoNovaCategoriaFavJogador;

    @FXML
    private TextField TecladoAlteracaoNovaDataNascJogador;

    @FXML
    private TextField TecladoAlteracaoNovaNacionalidadeJogador;

    @FXML
    private TextField TecladoAlteracaoNovaSenhaJogador;

    @FXML
    private TextField TecladoAlteracaoNovoEmailJogador;

    @FXML
    private TextField TecladoAlteracaoNovoGeneroJogador;

    @FXML
    private TextField TecladoAlteracaoNovoLocalDesenvolvedor;

    @FXML
    private TextField TecladoAlteracaoNovoNicknameJogador;

    @FXML
    private TextField TecladoAlteracaoNovoNomeDesenvolvedor;

    @FXML
    private TextField TecladoAlteracaoNovoNomeJogador;

    @FXML
    private TextField TecladoAlteracaoSenhaJogador;

    @FXML
    private TextField TecladoAltercaoCategoriaGame;

    @FXML
    private TextField TecladoAltercaoDataLancGame;

    @FXML
    private TextField TecladoAltercaoFaixaEtariaGame;

    @FXML
    private TextField TecladoAltercaoNomeGame;

    @FXML
    private TextField TecladoBuscaIDDesenvolvedor;

    @FXML
    private TextField TecladoBuscaIDGame;

    @FXML
    private TextField TecladoBuscaNicknameJogador;

    @FXML
    private TextField TecladoCadastroCategoriaFavJogador;

    @FXML
    private TextField TecladoCadastroCategoriaGame;

    @FXML
    private TextField TecladoCadastroDataLancGame;

    @FXML
    private TextField TecladoCadastroDataNascJogador;

    @FXML
    private TextField TecladoCadastroEmailJogador;

    @FXML
    private TextField TecladoCadastroFaixaEtariaGame;

    @FXML
    private TextField TecladoCadastroGeneroJogador;

    @FXML
    private TextField TecladoCadastroIDDesenvolvedor;

    @FXML
    private TextField TecladoCadastroIDGame;

    @FXML
    private TextField TecladoCadastroIDJogador;

    @FXML
    private TextField TecladoCadastroLocalDesenvolvedor;

    @FXML
    private TextField TecladoCadastroNascionalidadeJogador;

    @FXML
    private TextField TecladoCadastroNicknameJogador;

    @FXML
    private TextField TecladoCadastroNomeDesenvolvedor;

    @FXML
    private TextField TecladoCadastroNomeGame;

    @FXML
    private TextField TecladoCadastroNomeJogador;

    @FXML
    private TextField TecladoCadastroSenhaJogador;

    @FXML
    private TextField TecladoExclusaoEmailJogador;

    @FXML
    private TextField TecladoExclusaoIDDesenvolvedor;

    @FXML
    private TextField TecladoExclusaoIDGame;

    @FXML
    private TextField TecladoExclusaoSenhaJogador;
    

    
    /////////////////////////   JOGADORES   //////////////////////////

    ///////////////////// BUSCAR - JOGADORES ////////////////////////
    @FXML
    void ola(ActionEvent event) {
    	System.out.println("Busca");
        if(! TecladoBuscaNicknameJogador.getText().equals("")){
            Jogadores j = new Jogadores();
            JogadoresDAO jDAO = new JogadoresDAO();
            j = jDAO.buscar( Integer.parseInt(TecladoBuscaNicknameJogador.getText()));
            
            if(j == null){
                BuscaErroJogadores.setText("");
                BuscaErroJogadores.setText("ERRO: Cadastro n„o encontrado!");
                this.BuscaErroJogadores.setVisible(true);
            } else{
                this.StackBuscaJogadores.setVisible(false);
                this.StackBuscaFinalJogadores.setVisible(true);
                
                TableBuscaIDJogadores.setCellValueFactory(new PropertyValueFactory<>("idJogador"));
                TableBuscaNomeJogadores.setCellValueFactory(new PropertyValueFactory<>("NomeJogador"));
                //TableBuscaNicknameJogadores.setCellValueFactory(new PropertyValueFactory<>("nicknameJogador"));
                TableBuscaEmailJogadores.setCellValueFactory(new PropertyValueFactory<>("emailJogador"));
                TableBuscaNascionalidadeJogadores.setCellValueFactory(new PropertyValueFactory<>("nacionalidadeJogador"));
                //TableBuscaDataNascJogadores.setCellValueFactory(new PropertyValueFactory<>("dataNascimentoJogador"));
                TableBuscaGeneroJogadores.setCellValueFactory(new PropertyValueFactory<>("generoJogador"));
                TableBuscaCategoriaFavJogadores.setCellValueFactory(new PropertyValueFactory<>("categoriaFavJogador"));
                jogue.clear();
                jogue.addAll(j);
                
                TableBuscaJogadores.setItems(jogue);
            }
            
        } else{
            TecladoBuscaNicknameJogador.requestFocus();
        }
    }
    
    @FXML
    void BuscaCadastroJogador(ActionEvent event) {
    	
    	System.out.println("Busca");
        if(! TecladoBuscaNicknameJogador.getText().equals("")){
            Jogadores j = new Jogadores();
            JogadoresDAO jDAO = new JogadoresDAO();
            j = jDAO.buscar(Integer.parseInt(TecladoBuscaNicknameJogador.getText()));
            
            if(j == null){
                BuscaErroJogadores.setText("");
                BuscaErroJogadores.setText("ERRO: Cadastro n„o encontrado!");
                this.BuscaErroJogadores.setVisible(true);
            } else{
                this.StackBuscaJogadores.setVisible(false);
                this.StackBuscaFinalJogadores.setVisible(true);
                
                TableBuscaIDJogadores.setCellValueFactory(new PropertyValueFactory<>("idJogador"));
                TableBuscaNomeJogadores.setCellValueFactory(new PropertyValueFactory<>("nomeJogador"));
                TableBuscaEmailJogadores.setCellValueFactory(new PropertyValueFactory<>("emailJogador"));
                TableBuscaNascionalidadeJogadores.setCellValueFactory(new PropertyValueFactory<>("nacionalidadeJogador"));
                TableBuscaDataNascJogadores.setCellValueFactory(new PropertyValueFactory<>("dataNascimentoJogador"));
                TableBuscaGeneroJogadores.setCellValueFactory(new PropertyValueFactory<>("generoJogador"));
                TableBuscaCategoriaFavJogadores.setCellValueFactory(new PropertyValueFactory<>("categoriaFavJogador"));
                jogue.clear();
                jogue.addAll(j);
                
                TableBuscaJogadores.setItems(jogue);
            }
            
        } else{
            TecladoBuscaNicknameJogador.requestFocus();
        }
    }
    
    @FXML
    void NovaBuscaCadastroJogador(ActionEvent event) {
        this.StackBuscaFinalJogadores.setVisible(false);
        this.StackBuscaJogadores.setVisible(true);
        
        TecladoBuscaNicknameJogador.setText("");
        
        BuscaErroJogadores.setText("");
        this.BuscaErroJogadores.setVisible(false);
    }
    /////////////////////////////////////////////////////////////////////
    
    
    
    ///////////////////// ALTERACAO - JOGADORES ////////////////////////
    @FXML
    void AlterarCadastroJogadores(ActionEvent event) {
        Jogadores j = new Jogadores();
        JogadoresDAO jDAO = new JogadoresDAO();
        
        j = jDAO.buscar( Integer.parseInt(TecladoAlteracaoEmailJogador.getText()));
        
        if(j == null){
            AlteracaoErroJogadores.setText("");
            AlteracaoErroJogadores.setText("ERRO: Cadastro n„o encontrado!");
            this.AlteracaoErroJogadores.setVisible(true);
        }else{
            this.StackAlteracaoJogadores.setVisible(false);
            this.StackRealizarAlteracaoJogadores.setVisible(true);
            
            TecladoAlteracaoNovoNomeJogador.setText(j.getNomeJogador());
            TecladoAlteracaoNovoEmailJogador.setText(j.getEmailJogador());
            TecladoAlteracaoNovaSenhaJogador.setText(j.getSenhaJogador());
            TecladoAlteracaoNovaNacionalidadeJogador.setText(j.getNacionalidadeJogador());
            TecladoAlteracaoNovaCategoriaFavJogador.setText(j.getCategoriaFavJogador());
            TecladoAlteracaoNovoGeneroJogador.setText(j.getGeneroJogador());
        }
    }
  
        @FXML
        void ConcluirAlteracaoJogador(ActionEvent event) {
        this.StackRealizarAlteracaoJogadores.setVisible(false);
        this.StackAlteracaoFinalJogadores.setVisible(true);
        
        Jogadores j = new Jogadores();
        JogadoresDAO jDAO = new JogadoresDAO();
        
        j.setNomeJogador(TecladoAlteracaoNovoNomeJogador.getText());
        j.setEmailJogador(TecladoAlteracaoNovoEmailJogador.getText());
        j.setSenhaJogador(TecladoAlteracaoNovaSenhaJogador.getText());
        j.setNacionalidadeJogador(TecladoAlteracaoNovaNacionalidadeJogador.getText());
        j.setCategoriaFavJogador(TecladoAlteracaoNovaCategoriaFavJogador.getText());
        j.setGeneroJogador(TecladoAlteracaoNovoGeneroJogador.getText());
        jDAO.alterar(j, TecladoAlteracaoEmailJogador.getText());
    }
        
        
        @FXML
        void NovaAlteracaoCadastroJogadores(ActionEvent event) {
        	this.StackRealizarAlteracaoJogadores.setVisible(false);
        	this.StackAlteracaoFinalJogadores.setVisible(false);
            AlteracaoErroJogadores.setText("");
            this.StackAlteracaoJogadores.setVisible(true);
        }
        
    //////////////////////////////////////////////////////////////////////////////////
        
    
        
    ///////////////////// CADASTRAR - JOGADORES ////////////////////////
    @FXML
    void CadastroJogador(ActionEvent event) {
        Jogadores j = new Jogadores();
        JogadoresDAO jDAO = new JogadoresDAO();
        //j = jDAO.buscar(TecladoCadastroNicknameJogador.getText());
        
        
        //if(j == null){
        	
        	j = new Jogadores();
            //j.setIdJogador(Integer.parseInt(TecladoCadastroIDJogador.getText()));
            j.setNomeJogador(TecladoCadastroNomeJogador.getText());
            j.setEmailJogador(TecladoCadastroEmailJogador.getText());
            j.setSenhaJogador(TecladoCadastroSenhaJogador.getText());
            j.setNacionalidadeJogador(TecladoCadastroNascionalidadeJogador.getText());
            j.setCategoriaFavJogador(TecladoCadastroCategoriaFavJogador.getText());
            j.setGeneroJogador(TecladoCadastroGeneroJogador.getText());
            jDAO.incluir(j);
            
            this.StackCadastroJogadores.setVisible(false);
            this.StackCadastroFinalJogadores.setVisible(true);
            
           /* CadastroErroAcertoJogador.setText("");
            CadastroErroAcertoJogador.setText("Cadastro realizado com sucesso!");*/
            
        /*} else{
            this.StackCadastroJogadores.setVisible(false);
            this.StackCadastroFinalJogadores.setVisible(true);
            CadastroErroAcertoJogador.setText("");
            CadastroErroAcertoJogador.setText("ERRO: Cadastro j√° existente!");
        }*/
    }
    
    
    @FXML
    void RealizarNovoCadastroJogador(ActionEvent event) {
        //TecladoCadastroIDJogador.setText("");
        TecladoCadastroNomeJogador.setText("");
        //TecladoCadastroNicknameJogador.setText("");
        TecladoCadastroEmailJogador.setText("");
        TecladoCadastroSenhaJogador.setText("");
        TecladoCadastroNascionalidadeJogador.setText("");
        TecladoCadastroCategoriaFavJogador.setText("");
        TecladoCadastroGeneroJogador.setText("");

        this.StackCadastroFinalJogadores.setVisible(false);
        this.StackCadastroJogadores.setVisible(true);
    }
    
    //////////////////////////////////////////////////////////////////////////////////
    
    
    ///////////////////// EXCLUIR - JOGADORES ////////////////////////
    @FXML
    void ExclusaoCadastroJogador(ActionEvent event) {
        Jogadores j = null;
        JogadoresDAO jDAO = new JogadoresDAO();
        
        j = jDAO.buscar(Integer.parseInt(TecladoExclusaoEmailJogador.getText()));

        if(j == null){
            ExclusaoErroJogadores.setText("ERRO: Cadastro n„o encontrado!");
        }else{
            jDAO.excluir(Integer.parseInt(TecladoExclusaoEmailJogador.getText()));
            this.StackExclusaoJogadores.setVisible(false);
            this.StackExclusaoFinalJogadores.setVisible(true);
        }
    }
    
    @FXML
    void NovaExclusaoCadastroJogador(ActionEvent event) {
        this.StackExclusaoFinalJogadores.setVisible(false);
        this.ExclusaoErroJogadores.setVisible(false);
        ExclusaoErroJogadores.setText("");
        this.StackExclusaoJogadores.setVisible(true);
    }
    //////////////////////////////////////////////////////////////////////////////////
    
    
    
    
    
    
    
    
    
    /////////////////////////   GAMES   //////////////////////////
    
    ///////////////////// BUSCAR - GAMES ////////////////////////
    @FXML
    void BuscarCadastroGame(ActionEvent event) {
    	System.out.println("Busca");
        if(! TecladoBuscaNicknameJogador.getText().equals("")){
           Game g = new Game();
           GameDAO gDAO = new GameDAO();
           g = gDAO.buscar(Integer.parseInt(TecladoBuscaIDGame.getText()));
           
           if(g == null){
               BuscaErroGames.setText("");
               BuscaErroGames.setText("ERRO: Game n„o encontrado!");
               this.BuscaErroGames.setVisible(true);
            } else{
                this.StackBuscaGames.setVisible(false);
                this.StackBuscaFinalGames.setVisible(true);

                //TableBuscaIDGames.setCellValueFactory(new PropertyValueFactory<>("idGame"));
                TableBuscaNomeGames.setCellValueFactory(new PropertyValueFactory<>("nomeGame"));
                TableBuscaFaixaEtariaGames.setCellValueFactory(new PropertyValueFactory<>("faixaEtariaGame"));
                TableBuscaCategoriaGames.setCellValueFactory(new PropertyValueFactory<>("CategoriaGame"));
                Gm.clear();
                Gm.addAll(g);

                TableBuscaGames.setItems(Gm);
        }
    }else{
        TecladoBuscaNicknameJogador.requestFocus();
    }
    }
    
    
    @FXML
    void NovaBuscaCadastroGame(ActionEvent event) {
        this.StackBuscaFinalGames.setVisible(false);
        this.StackBuscaGames.setVisible(true);
        
        TecladoBuscaIDGame.setText("");
        
        BuscaErroGames.setText("");
        this.BuscaErroGames.setVisible(false);
    }

    //////////////////////////////////////////////////////////////////////////////////
    
    
    ///////////////////// ALTERAR - GAMES ////////////////////////
    @FXML
    void AlterarCadastroGame(ActionEvent event) {
    	 Game g = new Game();
         GameDAO gDAO = new GameDAO();
         
         g = gDAO.buscar(Integer.parseInt(TecladoAlteracaoIDGame.getText()));
         
         if(g == null) {
        	 AlteracaoErroGames.setText("");
        	 AlteracaoErroGames.setText("ERRO: Game n„o encontrado...");
        	 this.AlteracaoErroGames.setVisible(true);
         }else {
        	 this.StackAlteracaoGames.setVisible(false);
        	 this.StackAlteracaoFinalGames.setVisible(true);
        	 this.StackRealizarAlteracaoGames.setVisible(true);
        	 
        	 TecladoAltercaoNomeGame.setText(g.getNomeGame());
        	 TecladoAltercaoCategoriaGame.setText(g.getCategoriaGame());
        	 TecladoAltercaoFaixaEtariaGame.setText(NumberFormat.getInstance().format(g.getFaixaEtariaGame()));
        	 //TecladoAltercaoDataLancGame.setText(NumberFormat.getInstance().format(g.getDataLancamentoGame()));
         }
    }
    
    @FXML
    void ConcluirAlteracaoGame(ActionEvent event) {
    	this.StackAlteracaoGames.setVisible(false);
    	this.StackRealizarAlteracaoGames.setVisible(false);
    	
    	Game g = new Game();
    	GameDAO gDAO = new GameDAO();
    	
    	g.setNomeGame(TecladoAltercaoNomeGame.getText());
        g.setFaixaEtariaGame(Integer.parseInt(TecladoAltercaoFaixaEtariaGame.getText()));
        g.setCategoriaGame(TecladoAltercaoCategoriaGame.getText());
        //g.setDataLancamentoGame(Integer.parseInt(TecladoAltercaoDataLancGame.getText()));
        //gDAO.alterar(g, g.getidGame());
        gDAO.alterar(g, TecladoAlteracaoIDGame.getText());
    }
    
    @FXML
    void NovaAlteracaoCadastroGame(ActionEvent event) {
    	this.StackRealizarAlteracaoGames.setVisible(false);
    	this.StackAlteracaoFinalGames.setVisible(false);
        AlteracaoErroGames.setText("");
        this.StackAlteracaoGames.setVisible(true);
    }
    

    ///////////////////// CADASTRAR - GAMES ////////////////////////
    @FXML
    void CadastrarGame(ActionEvent event) {
        Game g = new Game();
        GameDAO gDAO = new GameDAO();
        //g = gDAO.buscar(Integer.parseInt(TecladoCadastroIDGame.getText()));
        //if(g == null){
        	g = new Game();
            //g.setIdGame(Integer.parseInt(TecladoCadastroIDGame.getText()));
            g.setNomeGame(TecladoCadastroNomeGame.getText());
            g.setCategoriaGame(TecladoCadastroCategoriaGame.getText());
            g.setFaixaEtariaGame(Integer.parseInt(TecladoCadastroFaixaEtariaGame.getText()));
            gDAO.incluir(g);
            
            this.StackCadastroGames.setVisible(false);
            this.StackCadastroFinalGames.setVisible(true);
            
        /*} else{
            this.StackCadastroGames.setVisible(false);
            this.StackCadastroFinalGames.setVisible(true);
            
            CadastroErroAcertoGame.setText("");
            CadastroErroAcertoGame.setText("ERRO: Game j√° existente!");
        }*/

    }
    
    @FXML
    void NovoCadastrarGame(ActionEvent event) {
    	//TecladoCadastroIDGame.setText("");
    	TecladoCadastroNomeGame.setText("");
    	//TecladoCadastroDataLancGame.setText("");
    	TecladoCadastroFaixaEtariaGame.setText("");
    	TecladoCadastroCategoriaGame.setText("");
    	
    	this.StackCadastroFinalGames.setVisible(false);
    	this.StackCadastroGames.setVisible(true);
    }
    //////////////////////////////////////////////////////////////////////////////////
    
    
    ///////////////////// EXCLUIR - GAMES ////////////////////////
    @FXML
    void ConcluirExclusaoGame(ActionEvent event) {
    	Game g = null;
    	GameDAO gDAO = new GameDAO();
    	
    	//g = gDAO.buscar(Integer.parseInt(TecladoCadastroIDGame.getText()));
    	
    	/*if(g == null) {
    		ExclusaoErroGame.setText("ERRO: Game n„o cadastrado!");
    	}else {*/
    		gDAO.excluir(Integer.parseInt(TecladoExclusaoIDGame.getText()));
    		this.StackExclusaoGames.setVisible(false);
    		this.StackExclusaoFinalGames.setVisible(true);
    	}
    //}
    
    @FXML
    void NovaExclusaoGame(ActionEvent event) {
    	this.StackExclusaoFinalGames.setVisible(false);
    	this.StackExclusaoGames.setVisible(false);
    	ExclusaoErroGame.setText("");
    	this.StackExclusaoGames.setVisible(true);
    }
    //////////////////////////////////////////////////////////////////////////////////
    
    
    
    
    
    
    
    
    
    /////////////////////////   DESENVOLVEDORES   //////////////////////////
    
    ///////////////////// BUSCAR - DESENVOLVEDORES ////////////////////////
    
    @FXML
    void BuscaCadastroDesenvolvedores(ActionEvent event) {
    	if(! TecladoBuscaIDDesenvolvedor.getText().equals("")){
            Desenvolvedores d = new Desenvolvedores();
            DesenvolvedoresDAO dDAO = new DesenvolvedoresDAO();
            
        	
            d = dDAO.buscar(Integer.parseInt(TecladoBuscaIDDesenvolvedor.getText()));
            
            if(d == null){
                BuscaErroDesenvolvedores.setText("");
                BuscaErroDesenvolvedores.setText("ERRO: Cadastro n„o encontrado!");
                this.BuscaErroDesenvolvedores.setVisible(true);
            } else{
                this.StackBuscaDesenvolvedores.setVisible(false);
                this.StackRealizarBuscaDesenvolvedores.setVisible(true);
                
                //TableBuscaIDDesenvolvedor.setCellValueFactory(new PropertyValueFactory<>("idDesenvolvedor"));
                TableBuscaNomeDesenvolvedor.setCellValueFactory(new PropertyValueFactory<>("nomeDesenvolvedor"));
                TableBuscaLocalDesenvolvedor.setCellValueFactory(new PropertyValueFactory<>("localDesenvolvedor"));
                desen.clear();
                desen.addAll(d);
                
                TableBuscaDesenvolvedor.setItems(desen);
                
            }
            
        } else{
            TecladoBuscaIDDesenvolvedor.requestFocus();
        }
    }

    @FXML
    void NovaBuscaDesenvolvedores(ActionEvent event) {
        this.StackRealizarBuscaDesenvolvedores.setVisible(false);
        this.StackBuscaDesenvolvedores.setVisible(true);
        
        TecladoBuscaIDDesenvolvedor.setText("");
        
        BuscaErroDesenvolvedores.setText("");
        this.BuscaErroDesenvolvedores.setVisible(false);
    }
    
    ///////////////////// ALTERAR - DESENVOLVEDORES ////////////////////////
    
    @FXML
    void AlterarCadastroDesenvolvedores(ActionEvent event) {
    	Desenvolvedores d = new Desenvolvedores();
	   	DesenvolvedoresDAO dDAO = new DesenvolvedoresDAO();
	     
	     d = dDAO.buscar(Integer.parseInt(TecladoAlteracaoIDDesenvolvedor.getText()));
	     
	     if(d == null) {
	    	 AlteracaoErroDesenvolvedores.setText("");
	    	 AlteracaoErroDesenvolvedores.setText("ERRO: Game n„o encontrado...");
	    	 this.AlteracaoErroDesenvolvedores.setVisible(true);
	     }else {
	    	 this.StackAlteracaoDesenvolvedores.setVisible(false);
	    	 this.StackAlteracaoFinalDesenvolvedores.setVisible(true);
	    	 this.StackRealizarAlteracaoDesenvolvedores.setVisible(true);
	    	 
	    	 TecladoAlteracaoNovoNomeDesenvolvedor.setText(d.getNomeDesenvolvedor());
	    	 TecladoAlteracaoNovoLocalDesenvolvedor.setText(d.getLocalDesenvolvedor());
	     }
    }
    
    @FXML
    void ConclusaoAlteracaoDesenvolvedores(ActionEvent event) {
    	this.StackAlteracaoDesenvolvedores.setVisible(false);
    	this.StackRealizarAlteracaoDesenvolvedores.setVisible(false);
    	this.StackAlteracaoFinalDesenvolvedores.setVisible(true);
    	
    	Desenvolvedores d = new Desenvolvedores();
	   	DesenvolvedoresDAO dDAO = new DesenvolvedoresDAO();
    	
    	d.setNomeDesenvolvedor(TecladoAlteracaoNovoNomeDesenvolvedor.getText());
        d.setLocalDesenvolvedor(TecladoAlteracaoNovoLocalDesenvolvedor.getText());
        //dDAO.alterar(d, d.getidDesenvolvedor());
        dDAO.alterar(d, TecladoAlteracaoIDDesenvolvedor.getText());
        
    }
    
    @FXML
    void NovaAlteracaoCadastroDesenvolvedores(ActionEvent event) {
    	this.StackRealizarAlteracaoDesenvolvedores.setVisible(false);
    	this.StackAlteracaoFinalDesenvolvedores.setVisible(false);
        AlteracaoErroDesenvolvedores.setText("");
        this.StackAlteracaoDesenvolvedores.setVisible(true);
    }
    
    ///////////////////// CADASTRAR - DESENVOLVEDORES ////////////////////////
    @FXML
    void CadastrarDesenvolvedores(ActionEvent event) {
    	Desenvolvedores d = new Desenvolvedores();
	   	DesenvolvedoresDAO dDAO = new DesenvolvedoresDAO();
        //d = dDAO.buscar(Integer.parseInt(TecladoCadastroIDDesenvolvedor.getText()));
        
        //if(d == null){
	   		d = new Desenvolvedores();
            d.setNomeDesenvolvedor(TecladoCadastroNomeDesenvolvedor.getText());
            d.setLocalDesenvolvedor(TecladoCadastroLocalDesenvolvedor.getText());
            dDAO.incluir(d);
            
            this.StackCadastroJogadores.setVisible(true);
            this.StackCadastroFinalJogadores.setVisible(false);
            
            /*CadastroErroAcertoJogador.setText("");
            CadastroErroAcertoJogador.setText("Cadastro realizado com sucesso!");
            
        } else{
            this.StackCadastroJogadores.setVisible(false);
            this.StackCadastroFinalJogadores.setVisible(true);
            CadastroErroAcertoJogador.setText("");
            CadastroErroAcertoJogador.setText("ERRO: Cadastro j· existente!");
        }*/
    }
    
    @FXML
    void NovoCadastroDesenvolvedores(ActionEvent event) {
        TecladoCadastroIDDesenvolvedor.setText("");
        TecladoCadastroNomeDesenvolvedor.setText("");
        TecladoCadastroLocalDesenvolvedor.setText("");

        this.StackCadastroFinalDesenvolvedores.setVisible(false);
        this.StackCadastroDesenvolvedores.setVisible(true);
    }
    
    ///////////////////// EXCLUIR - DESENVOLVEDORES ////////////////////////
    
    @FXML
    void ExclusaoCadastroDesenvolvedores(ActionEvent event) {
    	Desenvolvedores d = null;
    	DesenvolvedoresDAO dDAO = new DesenvolvedoresDAO();
    	
    	d = dDAO.buscar(Integer.parseInt (TecladoExclusaoIDDesenvolvedor.getText()));
    	
    	if(d == null) {
    		ExclusaoErroDesenvolvedores.setText("ERRO: Game n„o cadastrado!");
    	}else {
    		dDAO.excluir(Integer.parseInt(TecladoExclusaoIDDesenvolvedor.getText()));
    		this.StackExclusaoDesenvolvedores.setVisible(false);
    		this.StackExclusaoFinalDesenvolvedores.setVisible(true);
    	}
    }
    
    @FXML
    void NovaExclusaoCadastroDesenvolvedores(ActionEvent event) {
    	this.StackExclusaoFinalDesenvolvedores.setVisible(false);
    	this.StackExclusaoDesenvolvedores.setVisible(false);
    	ExclusaoErroDesenvolvedores.setText("");
    	this.StackExclusaoDesenvolvedores.setVisible(true);
    }
    
    ////////////////// BUSCAS ////////////////////////

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		botao.setOnMouseClicked((MouseEvent e)->{
	    	System.out.println("Busca");
	        if(! TecladoBuscaNicknameJogador.getText().equals("")){
	            Jogadores j = new Jogadores();
	            JogadoresDAO jDAO = new JogadoresDAO();
	            j = jDAO.buscar(Integer.parseInt(TecladoBuscaNicknameJogador.getText()));
	            
	            if(j == null){
	                BuscaErroJogadores.setText("");
	                BuscaErroJogadores.setText("ERRO: Cadastro n„o encontrado!");
	                this.BuscaErroJogadores.setVisible(true);
	            } else{
	                this.StackBuscaJogadores.setVisible(false);
	                this.StackBuscaFinalJogadores.setVisible(true);
	                
	                TableBuscaIDJogadores.setCellValueFactory(new PropertyValueFactory<>("idJogador"));
	                TableBuscaNomeJogadores.setCellValueFactory(new PropertyValueFactory<>("NomeJogador"));
	                TableBuscaEmailJogadores.setCellValueFactory(new PropertyValueFactory<>("emailJogador"));
	                TableBuscaNascionalidadeJogadores.setCellValueFactory(new PropertyValueFactory<>("nacionalidadeJogador"));
	                TableBuscaGeneroJogadores.setCellValueFactory(new PropertyValueFactory<>("generoJogador"));
	                TableBuscaCategoriaFavJogadores.setCellValueFactory(new PropertyValueFactory<>("categoriaFavJogador"));
	                jogue.clear();
	                jogue.addAll(j);
	                
	                TableBuscaJogadores.setItems(jogue);
	            }
	            
	        } else{
	            TecladoBuscaNicknameJogador.requestFocus();
	        }
	        
		});
		BotaoBuscarGame.setOnMouseClicked((MouseEvent e)->{
	    	System.out.println("Busca");

	        if(! TecladoBuscaIDGame.getText().equals("")){
	           Game g = new Game();
	           GameDAO gDAO = new GameDAO();
	           g = gDAO.buscar(Integer.parseInt(TecladoBuscaIDGame.getText()));
	           
	           if(g == null){
	               BuscaErroGames.setText("");
	               BuscaErroGames.setText("ERRO: Game n„o encontrado!");
	               this.BuscaErroGames.setVisible(true);
	            } else{
	                this.StackBuscaGames.setVisible(false);
	                this.StackBuscaFinalGames.setVisible(true);

	                //TableBuscaIDGames.setCellValueFactory(new PropertyValueFactory<>("idGame"));
	                TableBuscaNomeGames.setCellValueFactory(new PropertyValueFactory<>("nomeGame"));
	                TableBuscaFaixaEtariaGames.setCellValueFactory(new PropertyValueFactory<>("faixaEtariaGame"));
	                TableBuscaCategoriaGames.setCellValueFactory(new PropertyValueFactory<>("CategoriaGame"));
	                Gm.clear();
	                Gm.addAll(g);
	                
	                TableBuscaGames.setItems(Gm);
	        }
	    }else{
	        TecladoBuscaNicknameJogador.requestFocus();
	    }
	        
		});
		
	}
	
}


