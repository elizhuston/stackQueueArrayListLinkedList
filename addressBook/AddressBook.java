package addressBook;

import java.util.Arrays;

public class AddressBook {
	public static void main(String[] args) {
		Contact newPerson = new Contact("Fred", "Flintsone", "S");
		System.out.println(newPerson.firstName);
		Phone newPhone = new Phone("222-111-2424", "Home");
		newPerson.addPhone(newPhone);
		System.out.println(Arrays.toString(newPerson.pnum));
		Address newAddress = new Address("123 Some Street", "", "Bedrock", "UT", 23456, 203);
		newPerson.addAddress(newAddress);
		System.out.println(Arrays.toString(newPerson.address));
	}
}

class Contact {
	public String firstName;
	public String lastName;
	public String middleInitial;
	public Phone[] pnum;
	public int numPhones;
	public Email[] email;
	public Address[] address;
	public int numAddresses;
	public ContactGroups[] groups;

	public Contact(String firstName, String lastName, String middleinitial) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleInitial = middleinitial;
		this.numPhones = 0;
		this.pnum = new Phone[3];
		this.numAddresses = 0;
		this.address = new Address[3];
	}

	public void addPhone(Phone ph) {
		this.pnum[this.numPhones] = ph;

	}

	public void addAddress(Address ad) {
		this.address[this.numAddresses] = ad;

	}

	public void removePhone(Phone ph) {
		this.pnum[this.numPhones] = ph;

	}

}

class Phone {
	public String number;
	public String type;

	public String toString() {
		return this.number + " " + this.type;
	}

	public Phone(String number, String type) {
		this.number = number;
		this.type = type;

	}
}

class Email {
	public String address;
	public String type;
}

class Address {
	public String street1;
	public String street2;
	public String city;
	public String state;
	public int zipCode;
	public int countryCode;
	public String type;

	public String toString() {
		return this.street1 + " " + this.street2 + "," + this.city + "," + this.state + " " + this.zipCode + " "
				+ this.countryCode + " " + this.type;
	}

	public Address(String street1, String street2, String city, String state, int zipCode, int countryCode) {
		this.street1 = street1;
		this.street2 = street2;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.countryCode = countryCode;

	}
}

class ContactGroups {
	public String type;
	public String desc;
}
