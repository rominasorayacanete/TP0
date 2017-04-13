package domain;

import org.uqbar.arena.Application;
import org.uqbar.arena.windows.Window;

import view.LectorView;

public class LectorApplication extends Application {

	public static void main(String[] args) {
		new LectorApplication().start();
	}

	@Override
	protected Window<?> createMainWindow() {
		return new LectorView(this);
	}
	
}
