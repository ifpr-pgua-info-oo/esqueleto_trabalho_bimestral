package ifpr.pgua.eic.trabbim.telas;

import ifpr.pgua.eic.trabbim.App;
import ifpr.pgua.eic.trabbim.repositorios.Escola;
import javafx.fxml.FXML;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;

public class Home {
    
    private Escola escola;
    
    @FXML
    private StackPane painelCentral;
    @FXML
    private BorderPane root;

    @FXML
    private ToggleButton btTema;

    private String tema = "light";


    public Home(Escola biblioteca){
        this.escola = escola;
    }


    @FXML
    private void mudaTema(){
        if(tema.equals("light")){
            tema = "dark";
            btTema.setText("Light Mode");
            root.getStylesheets().remove(App.class.getResource("css/estilo.css").toExternalForm());
            root.getStylesheets().add(App.class.getResource("css/estilo_dark.css").toExternalForm());
            
        }else{
            tema = "light";
            btTema.setText("Dark Mode");
            root.getStylesheets().add(App.class.getResource("css/estilo.css").toExternalForm());
            root.getStylesheets().remove(App.class.getResource("css/estilo_dark.css").toExternalForm());
        
        }
    }
}
