package at.jku.ce;

public class Main {

	private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
	
	public static void main(String[] args) {
	
	Set<DomainObject> objectSet = new HashSet<DomainObject>();

	objectSet.add(DomainFactory.createDomainObject("Helga", "Das ist mein Kommentar."));
	objectSet.add(DomainFactory.createDomainObject("Walter", "Das ist mein Kommentar."));
	objectSet.add(DomainFactory.createDomainObject("Hannah", "Das ist mein Kommentar."));
	objectSet.add(DomainFactory.createDomainObject("Paul", "Das ist mein Kommentar."));
	objectSet.add(DomainFactory.createDomainObject("Claudia", "Das ist mein Kommentar."));

	for (DomainObject domainObject : objectSet) {
	  LOGGER.debug(domainObject.getUuid());
	}

	}

}
