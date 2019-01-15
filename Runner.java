class Runner {

	public static void main(String[] arr) {
		LinkedListCode list = new LinkedListCode();
		list.insert(44);
		list.insert(67);
		list.insert(89);
		list.insert(22022);

		list.deleteAt(2);

		list.show();
	}
}