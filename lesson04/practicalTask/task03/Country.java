package lesson04.practicalTask.task03;

/*
 * Enter the name of the country. Print the name of the continent. (Declare enum with names of 
 * continents)

 */
public class Country {

	private String name;

	public Country() {
	}

	public Country(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Continent cont() {
		Continent continent = Continent.SUCH_COUNTRY_IS_NOT_VALID;
		switch (name) {
		case "Egypt":
		case "South Africa":
		case "Angola":
			continent = Continent.AFRICA;
			break;
		case "Bouvet Island":
		case "Heard Island and McDonald Islands":
		case "South Georgia and the South Sandwich Islands":
			continent = Continent.ANTARCTICA;
			break;
		case "India":
		case "Pakistan":
		case "China":
			continent = Continent.ASIA;
			break;
		case "Australia":
			continent = Continent.AUSTRALIA;
			break;
		case "Ukraine":
		case "Polland":
		case "Great Britain":
			continent = Continent.EUROPE;
			break;
		case "United States":
		case "Canada":
		case "Mexico":
			continent = Continent.NORTH_AMERICA;
			break;
		case "Argentina":
		case "Brazil":
		case "Chile":
			continent = Continent.SOUTH_AMERICA;
			break;
		}
		return continent;

	}

}
