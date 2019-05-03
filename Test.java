
public class Test {

	public static void main(String[] args) {
		Gui_admin guiadmin = new Gui_admin();
		Gui_login guilogin = new Gui_login();
		Gui_patrola guipatrola = new Gui_patrola();
		int broj = 3;
		if (broj == 3) {
			guilogin.main(args);
		}
		guiadmin.main(args);
		guipatrola.main(args);
	}

}
