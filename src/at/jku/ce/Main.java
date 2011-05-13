package at.jku.ce;

public class Main {

	private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
	
	public static void main(String[] args) {
	
	Set<DomainObject> objectSet = new HashSet<DomainObject>();

	objectSet.add(new DomainObject("Helga", "Das ist mein Kommentar."));
	objectSet.add(new DomainObject("Walter", "Das ist mein Kommentar."));
	objectSet.add(new DomainObject("Hannah", "Das ist mein Kommentar."));
	objectSet.add(new DomainObject("Paul", "Das ist mein Kommentar."));
	objectSet.add(new DomainObject("Claudia", "Das ist mein Kommentar."));

	for (DomainObject domainObject : objectSet) {
	  LOGGER.debug(domainObject.id);
	}

	}

}
