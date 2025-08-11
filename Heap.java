import java.util.*;

public class Heap {
    static class MinHeap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            arr.add(data);

            int x = arr.size() - 1; // Index of the newly added element
            int par = (x - 1) / 2; // Parent index

            while (x > 0 && arr.get(x) < arr.get(par)) { // Ensure x > 0 to avoid negative index
                // Swap child and parent
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par; // Move up to the parent
                par = (x - 1) / 2; // Update parent index
            }
        }

        public int peek() {
            if (arr.isEmpty()) {
                throw new NoSuchElementException("Heap is empty");
            }
            return arr.get(0);
        }

        private void heapify(int i) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int minIdx = i;

            if (left < arr.size() && arr.get(left) < arr.get(minIdx)) {
                minIdx = left;
            }
            if (right < arr.size() && arr.get(right) < arr.get(minIdx)) {
                minIdx = right;
            }

            if (minIdx != i) {
                // Swap
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                // Recursively heapify
                heapify(minIdx);
            }
        }

        public int remove() {
            if (arr.isEmpty()) {
                throw new NoSuchElementException("Heap is empty");
            }

            int data = arr.get(0); // The root element (minimum element)

            // Swap root with the last element
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            // Remove the last element
            arr.remove(arr.size() - 1);

            // Heapify the new root
            if (!arr.isEmpty()) {
                heapify(0);
            }

            return data;
        }

        public boolean isEmpty() {
            return arr.isEmpty();
        }
    }

    public static void main(String[] args) {
        MinHeap h = new MinHeap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while (!h.isEmpty()) {
            System.out.println(h.peek());
            h.remove();
        }
    }
}
