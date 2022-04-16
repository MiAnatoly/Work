public class Decryption {
    String text;
    Decryption(String text){
        this.text = text;
    }
    public void numText(){

        char[] num = text.toCharArray();
        for (int i = 0; i<num.length;i++) {
            int g = num[i];
            if (g%2 == 0) g = g + 8;
            else g = g - 8;
            char h = (char) g;
            //System.out.print(g);
            System.out.print(h);
        }
        System.out.println("");
    }
}
