using System;
using Gtk;

public partial class MainWindow: Gtk.Window
{
	public MainWindow () : base (Gtk.WindowType.Toplevel)
	{
		Build ();
		buttonSuma.Clicked += delegate {
			int numeroCasilla1 = int.Parse(casilla1.Text);
			int numeroCasilla2 = int.Parse(casilla2.Text);
			int resultado = numeroCasilla1 + numeroCasilla2;
			labelResultado.Text = resultado.ToString();

		};
	}

	protected void OnDeleteEvent (object sender, DeleteEventArgs a)
	{
		Application.Quit ();
		a.RetVal = true;
	}
}
