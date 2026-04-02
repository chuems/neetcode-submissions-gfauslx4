class DynamicArray {
    private int arr[];
    private int size;
    private int capacity;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.size = 0;
    }

    public int get(int i) {
        return arr[i];
   }

    public void set(int i, int n) {
        arr[i] = n;
    }

    public void pushback(int n) {
        if (size == capacity){
            resize();
        }
        arr[size] = n;
        size++;
    }

    public int popback() {
        int value = arr[size - 1];
        size--;
        return value;

        
    }

    public void resize() {
        this.capacity = capacity * 2;
        int new_arr[] = new int[this.capacity];

        for(int i = 0; i < size; i++){
            new_arr[i] = arr[i];
        } arr = new_arr;

    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
}