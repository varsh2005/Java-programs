public class OddOccurencePrint {
    public static void printOddOccurrences(int[] arr) {
        int n = arr.length;
        boolean[] visited = new boolean[n]; // to avoid rechecking the same element

        System.out.println("Elements with odd occurrences:");

        for (int i = 0; i < n; i++) {
            if (visited[i]) continue;

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            if (count % 2 != 0) {
                System.out.println(arr[i] + " occurs " + count + " times");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 3, 1, 3};
        printOddOccurrences(arr);
    }
}
