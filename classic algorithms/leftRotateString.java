//189. Rotate Array one is int[] ,the other is char[] ,totally the same
public static char[] leftRotateString(char[] data, int n) {
    if (data == null || n < 0 || n > data.length) {
        return data;
    }
    reverse(data, 0, data.length - 1);
    reverse(data, 0, data.length - n - 1);
    reverse(data, data.length - n, data.length - 1);
    return data;
}
