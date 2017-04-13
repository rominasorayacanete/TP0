package domain;

import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.WindowOwner;

import view.LectorViewModel;

public class ValidacionDialog extends Dialog<LectorViewModel> {

	public ValidacionDialog (WindowOwner owner) {
	super(owner, null);
}

	@Override
	protected void createFormPanel(Panel mainPanel) {
		Panel form = new Panel(mainPanel);
		form.setLayout(new VerticalLayout());
		
		new Label(form).bindValueToProperty("validacionToken");
		
	}

	@Override
	protected void addActions(Panel actions) {
		new Button(actions).setCaption("Aceptar").onClick(this::accept).setAsDefault();
	}

}
