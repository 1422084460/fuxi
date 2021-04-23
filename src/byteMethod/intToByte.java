package byteMethod;

public class intToByte {

    public static void main(String[] args) {
        String num = "121aA";
        byte[] arr = num.getBytes();
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(byte2int(arr));
    }

    public static int byte2int(byte[] res) {
        // 一个byte数据左移24位变成0x??000000，再右移8位变成0x00??0000
        int targets = (res[0] & 0xff) | ((res[1] << 8) & 0xff00)
                | ((res[2] << 24) >>> 8) | (res[3] << 24);
        return targets;
    }
}
