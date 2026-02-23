public class recursive {
    int[] list;

    recursive(int[] list) {
        this.list = list;
    }

    int even(int[] list, int index) {
        if (index == list.length) {
            return 0;
        } else if (list[index] % 2 == 0) {
            index++;
            return 1 + even(list, index);
        } else {
            return even(list, ++index);
        }
    }
}
