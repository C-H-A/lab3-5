package rmuti.Lab3_5;

public class TestArrayList {
	public static void main(String [] args) {
		ArrayList lst = new ArrayList();
		lst.add(0, "10");
		lst.add(1, "11");
		lst.add(2, "13");
		lst.add(3, "15");
		lst.add(4, "20");
		lst.add(5, "60");
		lst.add(6, "80");
		lst.add("100");
		System.out.println(lst.size());
		System.out.println(lst);
		lst.remove(0);
		System.out.println(lst);
	}
}