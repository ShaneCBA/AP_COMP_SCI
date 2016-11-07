public class Name {
	private String firstName;
	private String middleName;
	private String lastName;

	public Name(String first, String middle, String last) {
		this.firstName=first;
		this.middleName=middle;
		this.lastName=last;
	}

	public String getFirst() {
		return firstName;
	}
	public String getMiddle() {
		return middleName;
	}
	public String getLast() {
		return lastName;
	}
	public String firstMiddleLast() {
		return firstName+" "+middleName+" "+lastName;
	}
	public String lastFirstMiddle() {
		return lastName+" "+firstName+" "+middleName;
	}

	public boolean equals(Name otherName) {
		return (this.firstName.equalsIgnoreCase(otherName.getFirst()))&&(this.middleName.equalsIgnoreCase(otherName.getMiddle()))&&(this.lastName.equalsIgnoreCase(otherName.getLast()));
	}

	public String initials() {
		//return firstName.toUpperCase().charAt(0)+middleName.toUpperCase().charAt(0)+lastName.toUpperCase().charAt(0);
		return firstName.substring(0,1).toUpperCase()+middleName.substring(0,1).toUpperCase()+lastName.substring(0,1).toUpperCase();
	}

	public int length() {
		return firstName.length()+middleName.length()+lastName.length();
	}
}