
public class Blogginlagg {
	public String amne;
	public String innehall;
	public String forfattare;
	public String inlaggkategori;
	
	public void Print() {
		System.out.println(amne + "\n\n" + innehall + "\n\n" + "Skrivet av: " + forfattare + "\nKategori: " + inlaggkategori);
		
		
		System.out.println("\n---------------------------------------------\n");
	}
}
