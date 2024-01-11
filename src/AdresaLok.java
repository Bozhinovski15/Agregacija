
class AdresaLok {
		private int StanBr;
		private String lokacija;
		public AdresaLok (int StanBr, String lokacija) {
			this.StanBr = StanBr;
			this.lokacija = lokacija;
			}
		public int getStanBr() {
			return StanBr;
		}
		public String getLokacija() {
			return lokacija;
		}
}
		class Kupuvac{
			private int kupuvacID;
			private AdresaLok adresaLinija;
			public Kupuvac(int kupuvacID, AdresaLok adresaLinija) {
				this.kupuvacID = kupuvacID;
				this.adresaLinija = adresaLinija;
			}
			public int getKupuvacID() {
				return kupuvacID;
			}
			public AdresaLok getAdresaLinija() {
				return adresaLinija;
			}
		}
	 class Dostava{
			public static void main(String []Args) {
				String lokacija = new String ("Naselba1, Zgrada2");
				AdresaLok adresa1 = new AdresaLok ( 15, lokacija);
				Kupuvac tom = new Kupuvac(1212, adresa1);
				System.out.println("Kupuvac ID: " + tom.getKupuvacID());
				System.out.println("Stan Br: "+ tom.getAdresaLinija().getStanBr());
				System.out.println("Lokacija: "+tom.getAdresaLinija().getLokacija());
				
				System.out.println();
				AdresaLok adresa2 = new AdresaLok (32, lokacija);
				Kupuvac marko = new Kupuvac (1673, adresa2);
				System.out.println("Kupuvac ID: "+marko.getKupuvacID());
				System.out.println("Stan br: "+marko.getAdresaLinija().getStanBr());
				System.out.println("Lokacija: "+marko.getAdresaLinija().getLokacija());
			}
		}
