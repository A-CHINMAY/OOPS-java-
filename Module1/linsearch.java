package Module1;

class linsearch {
    public static void main(String args[]) {
        int nums[] = { 1, 2, 3, 4 };
        int key = 3;
        for (int x : nums) {
            if (x == key)
                System.out.println("key element found in the list");
        }
        System.out.println("key element not found in the list");
    }
}
