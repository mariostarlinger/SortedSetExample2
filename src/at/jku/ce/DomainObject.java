package at.jku.ce;

public class DomainObject {

<<<<<<< HEAD

	private String uuid = UUID.randomUUID().toString();
	private String name;

	/**
 	* Default constructor
	*/

	public DomainObject() {
		super();
	}

	public DomainObject(String uuid) {
		super();
		this.uuid = uuid;
	}
	
	public String getUuId() {
		return uuid;
	}

}
