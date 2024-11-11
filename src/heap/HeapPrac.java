package heap;

import java.util.ArrayList;

public class HeapPrac<T extends Comparable<T>> {
    private ArrayList<T> heap;

    // Constructor
    public HeapPrac() {
        this.heap = new ArrayList<>();
    }

    // Insert a new element into the heap
    public void insert(T value) {
        heap.add(value);
        heapifyUp(heap.size() - 1);
    }

    // Extract the minimum element from the heap
    public T extract() {
        if (heap.isEmpty()) throw new IllegalStateException("Heap is empty");
        
        T minValue = heap.get(0);
        T lastValue = heap.remove(heap.size() - 1);
        
        if (!heap.isEmpty()) {
            heap.set(0, lastValue);
            heapifyDown(0);
        }
        
        return minValue;
    }

    // Restore the heap property going up
    private void heapifyUp(int index) {
        int parentIndex = (index - 1) / 2;
        while (index > 0 && heap.get(index).compareTo(heap.get(parentIndex)) < 0) {
            swap(index, parentIndex);
            index = parentIndex;
            parentIndex = (index - 1) / 2;
        }
    }

    // Restore the heap property going down
    private void heapifyDown(int index) {
        int size = heap.size();
        while (index < size) {
            int leftChild = 2 * index + 1;
            int rightChild = 2 * index + 2;
            int smallest = index;

            if (leftChild < size && heap.get(leftChild).compareTo(heap.get(smallest)) < 0) {
                smallest = leftChild;
            }

            if (rightChild < size && heap.get(rightChild).compareTo(heap.get(smallest)) < 0) {
                smallest = rightChild;
            }

            if (smallest != index) {
                swap(index, smallest);
                index = smallest;
            } else {
                break;
            }
        }
    }

    // Helper method to swap two elements in the heap
    private void swap(int i, int j) {
        T temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    // Optional method to view the heap 
    public void displayHeap() {
        System.out.println(heap);
    }

    // Main method for testing the heap
    public static void main(String[] args) {
        HeapPrac<Integer> minHeap = new HeapPrac<>();
        minHeap.insert(10);
        minHeap.insert(4);
        minHeap.insert(15);
        minHeap.insert(1);
        minHeap.insert(20);

        minHeap.displayHeap();
        System.out.println("Extracted: " + minHeap.extract());
        minHeap.displayHeap();
    }
}
