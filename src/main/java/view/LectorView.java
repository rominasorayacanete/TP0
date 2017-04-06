package view;
import java.awt.Color;

import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.MainWindow;

public class LectorView extends MainWindow<LectorViewModel> {

		  public LectorView() {
		    super(new LectorViewModel());
		  }

		  @Override
		  public void createContents(Panel mainPanel) {
		    setTitle("Lector de Notas");
		    mainPanel.setLayout(new VerticalLayout());
		    
		    new Label(mainPanel).setText("Ingrese su token");
		    
		    new TextBox(mainPanel).bindValueToProperty("tokenUsuario");
		    
		    new Button(mainPanel) //
		    .setCaption("Confirmar Token de ingreso") //
		    .onClick(() -> getModelObject().validar());
		    
		    new Button(mainPanel) //
		    .setCaption("Consultar notas") //
		    .onClick(() -> getModelObject().obtenerDatos());
		    
		    new Label(mainPanel).bindValueToProperty("notas"); 
		   
		  }

		  public static void main(String[] args) {
		    new LectorView().startApplication();
		  }
}
