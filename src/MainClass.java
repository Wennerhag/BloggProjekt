import java.util.ArrayList;
import java.util.List;


public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
List <Blogginlagg> blogposts = new ArrayList <Blogginlagg>();
		
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
		
		ett.Print();
		tva.Print();
		
	}

}
