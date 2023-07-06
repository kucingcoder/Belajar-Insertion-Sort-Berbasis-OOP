public class InsertionSort {

    private int[] data;

    public InsertionSort(){}

    void setData(int[] data){
        this.data = data;
    }

    public void InsertionSort(){
        int size = this.data.length;

        for (int step = 1; step < size; step++){
            int key = this.data[step];
            int j = step - 1;

            while (j >= 0 && key < this.data[j]){
                this.data[j + 1] = this.data[j];
                --j;
            }
            this.data[j + 1] = key;
        }
    }
}
