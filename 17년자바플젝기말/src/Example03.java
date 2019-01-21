import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Person {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return String.format("Person(\"%s\", %d)", name, age);
	}
}

class PersonComparator implements Comparator<Person> {
	public enum Compare { BY_NAME_ASC, BY_NAME_DESC, BY_AGE_ASC, BY_AGE_DESC };
	private Compare compare;
	
	public PersonComparator(Compare compare) {
		this.compare = compare;
	}

	@Override
	public int compare(Person p1, Person p2) {
		if(p1 == p2) return 0;
		if(p1 == null) return -1;
		if(p2 == null) return 1;

		switch(compare) {
		case BY_NAME_ASC: return p1.name.compareTo(p2.name);
		case BY_NAME_DESC: return p2.name.compareTo(p1.name);
		case BY_AGE_ASC: return p1.age - p2.age;
		case BY_AGE_DESC: return p2.age - p1.age;
		}

		return 0;
	}
}

public class Example03 {

	static void sort1(List<Person> list) {
		Comparator<Person> personComparator = new PersonComparator(PersonComparator.Compare.BY_NAME_ASC);
		list.sort(personComparator);
	}

	static void sort2(List<Person> list) {
		Comparator<Person> personComparator = new PersonComparator(PersonComparator.Compare.BY_NAME_DESC);
		list.sort(personComparator);
	}

	static void sort3(List<Person> list) {
		Comparator<Person> personComparator = new PersonComparator(PersonComparator.Compare.BY_AGE_ASC);
		list.sort(personComparator);
	}

	static void sort4(List<Person> list) {
		Comparator<Person> personComparator = new PersonComparator(PersonComparator.Compare.BY_AGE_DESC);
		list.sort(personComparator);
	}


	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();
		list.add(new Person("È«±æµ¿", 18));
		list.add(new Person("ÀÓ²©Á¤", 19));
		list.add(new Person("Àü¿ìÄ¡", 20));
		sort1(list);
		System.out.println(list.toString());
		sort2(list);
		System.out.println(list.toString());
		sort3(list);
		System.out.println(list.toString());
		sort4(list);
		System.out.println(list.toString());
	}
}
