public class ConcurrentModificationExceptionExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        for (int i : list) {
            if (i % 2 == 0) {
                list.remove(Integer.valueOf(i)); // ConcurrentModificationException
            }
        }
        System.out.println(list);
    }
}