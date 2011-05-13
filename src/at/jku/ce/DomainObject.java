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

	public DomainObject(String name, String comment) {
		super();
		this.name = name; 
		this.comment = comment;
	}
	
	public String getUuId() {
		return uuid;
	}

}
