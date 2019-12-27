package Project1;
import javafx.scene.paint.Color;

public enum MyColor{
    BLUE(0, 0 , 255), GREEN(0, 255, 0), RED(255, 0, 0),
     HUDSON(203,233,	181),SKY(85,	211,	252), YELLOW(248, 222, 126), PINK(239,	111,	159),
    BROWN(102, 51, 0), PUPLRE(228, 0, 228), BLACK(0,0,0), BERGUNDY(187,43,96),
     NYCSNOW(254	,249	,249),  AQUA(2	,141	,180),BLU(100, 0 , 255), GREE(100, 255, 0), RE(100, 0, 0),
    HUDSO(100,233,	181), SK(0,	211,	252), YELLO(100, 222, 126), PIN(100,	111,	159),
    BROW(102, 51, 100), PUPLR(100, 0, 228), BLAC(100,0,0), BERGUND(0,43,96),
    NYCSNO(100	,100	,249),  AQU(200	,141	,180);
    private int red, green, blue;
   private MyColor(int r, int g, int b) {
       red = r;
       green = g;
       blue = b;
   }
    public String hex(){
       String a, b, c;
        a = Integer.toHexString(red);
        b = Integer.toHexString(green);
        c = Integer.toHexString(blue);
        return "0x"+a+a+b+b+c+c;
    }
    public Color paint() {
        return Color.rgb(red, green, blue);
    }
    public static Color getColor(String S){
        int r = 0;
        int g = 0;
        int b = 0;
        switch (S) {
            case "blue":
                r = 0;
                g = 0;
                b = 255;
                break;
            case "green":
                r = 0;
                g = 255;
                b = 0;
                break;
            case "red":
                r = 255;
                g = 0;
                b = 0;
                break;
            case "yellow":
                r = 248;
                g = 222;
                b = 126;
                break;
            case "brown":
                r = 102;
                g = 51;
                b = 0;
                break;
            case "purple":
                r = 222;
                g = 222;
                b = 255;
                break;
            case "black":
                r = 0;
                b = 0;
                g = 0;
                break;
        }
        return Color.rgb(r, g ,b);
    }
    public String define(){
        return "Red = " + red + "  Green = " + green + "  Blue = " + blue;
    }
    public static Color mix(String color1, String color2){
       int r = 0;
       int g = 0;
       int b = 0;
       switch (color1) {
           case "blue":
               r = 0;
               g = 0;
               b = 255;
               break;
           case "green":
               r = 0;
               g = 255;
               b = 0;
               break;
           case "red":
               r = 255;
               g = 0;
               b = 0;
               break;
           case "yellow":
               r = 248;
               g = 222;
               b = 126;
               break;
           case "brown":
               r = 102;
               g = 51;
               b = 0;
               break;
           case "purple":
               r = 222;
               g = 222;
               b = 255;
               break;
           case "black":
               r = 0;
               b = 0;
               g = 0;
               break;
       }
        switch (color2) {
            case "blue":
                r += 0;
                g += 0;
                b += 255;
                break;
            case "green":
                r += 0;
                g += 255;
                b += 0;
                break;
            case "red":
                r += 255;
                g += 0;
                b += 0;
                break;
            case "yellow":
                r += 248;
                g += 222;
                b += 126;
                break;
            case "brown":
                r += 102;
                g += 51;
                b += 0;
                break;
            case "purple":
                r += 222;
                g += 222;
                b += 255;
                break;
            case "black":
                r = 0;
                b = 0;
                g = 0;
                break;
        }
        if(r > 255){
            r = 255;
        }
        if(g > 255){
            g =255;
        }
        if(b > 255){
            b = 255;
        }
        return Color.rgb(r, g ,b);
   }
}