package kata.casinos.externals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

import kata.casinos.Casino;
import kata.casinos.LoginFailException;
import kata.casinos.Vip;

public class CasinoDAO {

	static Map<String, List<Casino>> groups = new HashMap<>();
	static Map<String, Casino> casinos = new HashMap<>();
	
	static {
		put("Enghien", "A");
		put("Paris", "A");
		put("Roscoff", "B");
		put("Dinard", "B");
		put("Carnac", "B");
		put("Saint-Malo", "C");
		put("Toulouse", "C");
		put("Bordeaux", "C");
	}
	
	private static void put(String nom, String group) {
		Casino c = new Casino();
		casinos.put(nom, c);
		groups.computeIfAbsent(group, g ->  new ArrayList<>()).add(c);
	}

	private static class Item {
		String n;
		String p;
		
		public Item(String n, String p) {
			super();
			this.n = n;
			this.p = p;
		}
		
	}
	static Map<Casino, List<Item>> vips = new HashMap<>();

	static Random random = new Random(3013897);
	
	private static void add(String prenom, String nom) {
		Item i = new Item(prenom, nom);
		int size = casinos.values().size();
		Casino choosen = new ArrayList<>(casinos.values()).get(random.nextInt(size));
		vips.computeIfAbsent(choosen, c -> new ArrayList<>()).add(i);
	}
	

	static { add("Nyssa", "Roberson"); add("Gray", "Snyder"); add("Maia", "Holcomb"); add("William", "Mcintosh"); add("Destiny", "Saunders"); add("Hadley", "Snider"); add("Cyrus", "Tran"); add("Alice", "Rutledge"); add("Dorothy", "Kelly"); add("Peter", "Sampson"); add("Jacqueline", "Cannon"); add("Kimberly", "Taylor"); add("Yolanda", "Guerra"); add("Claire", "Reynolds"); add("Magee", "Wiggins"); add("Claudia", "Castaneda"); add("Jane", "Higgins"); add("Ira", "Espinoza"); add("Danielle", "Mcdowell"); add("Wyoming", "Hewitt"); add("Geoffrey", "Finley"); add("Cairo", "Morales"); add("Aristotle", "Benjamin"); add("Martin", "Mcpherson"); add("Audra", "Mcpherson"); add("Caesar", "Chase"); add("Beck", "Hutchinson"); add("Lucian", "Miles"); add("Hanna", "Cohen"); add("Amity", "Riley"); add("Cruz", "Kidd"); add("Brenden", "Erickson"); add("Ian", "Sosa"); add("Adele", "Gamble"); add("Odessa", "Mcintosh"); add("Felix", "Bean"); add("Ria", "Spencer"); add("Carlos", "Bush"); add("Cassady", "Walls"); add("Griffith", "Mckenzie"); add("Len", "Black"); add("Aristotle", "Burks"); add("Bert", "Mcpherson"); add("Denton", "Wagner"); add("Jordan", "Richard"); add("Carson", "Hays"); add("Guinevere", "Newman"); add("Ira", "Higgins"); add("Janna", "Bryant"); add("Burke", "Cooke"); add("Lars", "Strickland"); add("Roary", "Bowen"); add("Bernard", "Knight"); add("Clarke", "Dodson"); add("Cedric", "Higgins"); add("Amaya", "Rosales"); add("Noel", "Ford"); add("Jordan", "Bray"); add("Jordan", "Prince"); add("Hakeem", "Snider"); add("Ramona", "Blair"); add("Rashad", "Mcmillan"); add("Camden", "Rutledge"); add("Jarrod", "Moss"); add("Karen", "Barnett"); add("Odysseus", "Fry"); add("Alfreda", "Kelly"); add("Ursula", "Henderson"); add("Aaron", "Donovan"); add("Keiko", "Duran"); add("Lester", "James"); add("Oliver", "Lancaster"); add("Marvin", "Schwartz"); add("Amela", "Valentine"); add("Noelle", "Preston"); add("Amena", "Flores"); add("Abbot", "Hanson"); add("Hedwig", "Church"); add("Raja", "Harper"); add("Quail", "Cobb"); add("Wynne", "Morgan"); add("Theodore", "Donaldson"); add("Alden", "Mcdonald"); add("Idona", "Lara"); add("Rhiannon", "Hatfield"); add("Maris", "Stephens"); add("Lance", "Henson"); add("Hiroko", "Clarke"); add("Carolyn", "Elliott"); add("Kieran", "Cobb"); add("Dennis", "Shannon"); add("Aaron", "Fletcher"); add("Peter", "Cash"); add("Dale", "Ray"); add("Jacob", "King"); add("Wade", "Welch"); add("Omar", "Shepherd"); add("Rhona", "Humphrey"); add("Cedric", "Lancaster"); add("Summer", "Mccray"); }
	
	public static List<Vip> findVipByCasino(Casino user) {
		return vips.getOrDefault(user, Collections.emptyList())
		.stream()
		.map(i -> {Vip v = new Vip();v.setNom(i.n);v.setPrenom(i.p); return v;})
		.collect(Collectors.toList());
	}

	public static Casino findCasino(String login, String password) {
		Casino casino = casinos.get(login);
		if (casino != null) {
			return casino;
		}
		throw new LoginFailException("BadLogin");
	}

	public static Casino findCasinoByName(String text) {
		Casino casino = casinos.get(text);
		if (casino != null) {
			groups.entrySet().stream()
				.filter(e -> e.getValue().contains(casino))
				.map(e -> e.getValue()).flatMap(l -> l.stream())
				.filter(c -> c!= casino)
				.forEach(c -> casino.addInGroup(c));
		}
		return casino;
	}
	
}