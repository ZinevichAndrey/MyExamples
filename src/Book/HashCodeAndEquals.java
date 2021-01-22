package Book;

import java.util.HashMap;

class Book{
	String author;
}
class Ticket{
	int numberOfLibrary;
	String name;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + numberOfLibrary;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ticket other = (Ticket) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (numberOfLibrary != other.numberOfLibrary) {
			return false;
		}
		return true;
	}	

}

public class HashCodeAndEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Ticket, Book> map = new HashMap<>();
		Ticket ticket = new Ticket();
		Book book = new Book();
		book.author = "joshua Bloh";
		ticket.name = "Andrey";
		ticket.numberOfLibrary = 1;
		map.put(ticket, book);
		Book bookOne = map.get(ticket);
		Book book2 = new Book();
		book2.author = "Fir fir";
		ticket.numberOfLibrary = 2;
		map.put(ticket, book2);
		Book bookTwo = map.get(ticket);

		for(Book value : map.values()) {
			System.out.println(value.author);
		}
	}

}
