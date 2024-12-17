public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Kunal";
        char target = 'u';
        System.out.println(search(name, target));
    }
    static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
    }
}
