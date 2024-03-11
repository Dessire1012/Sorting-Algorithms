import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Tarea 2: Algoritmos de ordenamiento\n");

        int tamaño = 100000;
        int[] arr = new int[tamaño];

        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(1000) + 1;
        }

        System.out.print("\nArray generado: { ");
        for (int i = 0; i < tamaño; i++) {
            System.out.print(arr[i]);
            if (i < tamaño - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" }");

        long startTime;
        long endTime;

        // Insertion sort
        Insertion_sort ins_sort = new Insertion_sort();
        long startTime = System.currentTimeMillis();
        ins_sort.sort(arr);
        long endTime = System.currentTimeMillis();
        System.out.println("\nInsertion sort:");
        ins_sort.printArray(arr);
        System.out.println("Tiempo de ejecución: " + (endTime - startTime) + " milisegundos");

        // Selection sort
        Selection_sort select_sort = new Selection_sort();
        startTime = System.currentTimeMillis();
        select_sort.sort(arr);
        endTime = System.currentTimeMillis();
        System.out.println("\nSelection sort:");
        select_sort.printArray(arr);
        System.out.println("Tiempo de ejecución: " + (endTime - startTime) + " milisegundos");


        // Bubble sort
        Bubble_sort bubble_sort = new Bubble_sort();
        startTime = System.currentTimeMillis();
        bubble_sort.sort(arr);
        endTime = System.currentTimeMillis();
        System.out.println("\nBubble sort:");
        bubble_sort.printArray(arr);
        System.out.println("Tiempo de ejecución: " + (endTime - startTime) + " milisegundos");


        // Merge sort
        Merge_sort mergeSort = new Merge_sort();
        startTime = System.currentTimeMillis();
        mergeSort.sort(arr, 0, tamaño - 1);
        endTime = System.currentTimeMillis();
        System.out.println("\nMerge sort:");
        mergeSort.printArray(arr);
        System.out.println("Tiempo de ejecución: " + (endTime - startTime) + " milisegundos");

        // Heap sort
        Heap_sort heapSort = new Heap_sort();
        startTime = System.currentTimeMillis();
        heapSort.sort(arr);
        endTime = System.currentTimeMillis();
        System.out.println("\nHeap sort");
        heapSort.printArray(arr);
        System.out.println("Tiempo de ejecución: " + (endTime - startTime) + " milisegundos");

        // Quick Sort
        int N = arr.length;
        Quick_sort quickSort = new Quick_sort();
        startTime = System.currentTimeMillis();
        quickSort.quickSort(arr, 0, N - 1);
        endTime = System.currentTimeMillis();
        System.out.println("\nQuick sort:");
        quickSort.printArr(arr);
        System.out.println("Tiempo de ejecución: " + (endTime - startTime) + " milisegundos");

    }
}
