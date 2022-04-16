public class Encryption {
    String text;
    Encryption(String text){
        this.text = text;
    }
    public void textNum(){


         char[] num = text.toCharArray();
         for (int i = 0; i<num.length;i++) {
             int g = num[i];
             //System.out.println(g);
             if (g%2 == 0) g = g - 8;
             else g = g + 8;
             char h = (char) g;
             //System.out.println(g);
             System.out.print(h);
         }
        System.out.println("");
    }

}
