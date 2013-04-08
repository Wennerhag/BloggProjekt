import java.util.ArrayList;
import java.util.List;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.CoolBar;


public class ForstaFonstret {
	private static Text innehall;
	private static Text amne;
	private static Text text;
	private static org.eclipse.swt.widgets.List list;
	private static Text forfattare;
	private static Text kategori;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		Display display = Display.getDefault();
		Shell shell = new Shell();
		shell.setSize(450, 677);
		shell.setText("Blogg");
		
		//
final List <Blogginlagg> blogposts = new ArrayList <Blogginlagg>();
		
Kategori litteratur = new Kategori();
litteratur.titel = "Litteratur";
Kategori blogg = new Kategori();
blogg.titel = "Blogg";

Forfattare linus = new Forfattare();
linus.namn = "Linus Wennerhag";
linus.alder = 23;
linus.kon = "Man";

Blogginlagg ett = new Blogginlagg();
ett.amne = "Min nya blogg";
ett.innehall = "Här är min nya blogg som jag skapat i Java!";
ett.forfattare = linus.namn;
ett.inlaggkategori = blogg.titel;

Blogginlagg tva = new Blogginlagg();
tva.amne = "Moment 22 av Joseph Heller";
tva.innehall = "Igår läste jag ut boken Moment 22 av Joseph Heller.\nBoken handlar om manskapet i en amerikansk flyttflottilj under Andra Världskriget!";
tva.forfattare = linus.namn;
tva.inlaggkategori = litteratur.titel;

blogposts.add(ett);
blogposts.add(tva);


		innehall = new Text(shell, SWT.BORDER);
		innehall.setText("Skriv in blogginl\u00E4ggets inneh\u00E5ll");
		innehall.setBounds(10, 49, 414, 202);
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Blogginlagg tre = new Blogginlagg();
				tre.amne = amne.getText();
				tre.innehall = innehall.getText();
				tre.forfattare = forfattare.getText();
				tre.inlaggkategori = kategori.getText();
				
				list.add(tre.amne + "\n\n" + tre.innehall + "\n\n" + "Skrivet av: " + tre.forfattare + "\nKategori: " + tre.inlaggkategori);
			}
		});
		btnNewButton.setBounds(254, 10, 170, 33);
		btnNewButton.setText("L\u00E4gg till");
		
		amne = new Text(shell, SWT.BORDER);
		amne.setBounds(10, 10, 215, 33);
		amne.setText("Skriv in en titel f\u00F6r blogginl\u00E4gget");
		
		list = new org.eclipse.swt.widgets.List(shell, SWT.BORDER);
		list.setBounds(10, 340, 414, 298);
		
		text = new Text(shell, SWT.BORDER);
		text.setBounds(10, 340, 414, 298);
		
		forfattare = new Text(shell, SWT.BORDER);
		forfattare.setText("Skriv in f\u00F6rfattarens namn");
		forfattare.setBounds(10, 257, 254, 21);
		
		kategori = new Text(shell, SWT.BORDER);
		kategori.setText("Skriv in en kategori");
		kategori.setBounds(10, 298, 254, 21);
			
		for(int i = 0; i < blogposts.size(); i++) {
			Blogginlagg a = blogposts.get(i);
			
			list.add(a.amne + "\n\n" + a.innehall + "\n\n" + "Skrivet av: " + a.forfattare + "\nKategori: " + a.inlaggkategori);	
		}
		
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		
		
	}
	public org.eclipse.swt.widgets.List getList() {
		return list;
	}
}
