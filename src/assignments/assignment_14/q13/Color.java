package assignments.assignment_14.q13;

import java.util.Arrays;

public class Color {
    String color;
    int red;
    int green;
    int blue;
    public int[] rgbArray;

    public final static int[] WHITE = new int[] { 255, 255, 255 };
    public final static int[] LIGHT_GRAY = new int[] { 192, 192, 192 };
    public final static int[] GRAY = new int[] { 128, 128, 128 };
    public final static int[] DARK_GRAY = new int[] { 64, 64, 64 };
    public final static int[] BLACK = new int[] { 0, 0, 0 };
    public final static int[] RED = new int[] { 255, 0, 0 };
    public final static int[] PINK = new int[] { 255, 175, 175 };
    public final static int[] ORANGE = new int[] { 255, 200, 0 };
    public final static int[] YELLOW = new int[] { 255, 255, 0 };
    public final static int[] GREEN = new int[] { 0, 255, 0 };
    public final static int[] MAGENTA = new int[] { 255, 0, 255 };
    public final static int[] CYAN = new int[] { 0, 255, 255 };
    public final static int[] BLUE = new int[] { 0, 0, 255 };

    public Color() {
        color = "white";
    }

    public Color(int red, int green, int blue) {
        this();
        this.red = red;
        this.green = green;
        this.blue = blue;

    }

    @Override
    public String toString() {
        rgbArray = new int[]{red, green, blue};
        if (Arrays.equals(rgbArray, WHITE)) {
            color="white";
        }else if (Arrays.equals(rgbArray, LIGHT_GRAY)){
            color="light grey";
        }else if (Arrays.equals(rgbArray, GRAY)){
            color="gray";
        }else if (Arrays.equals(rgbArray, DARK_GRAY)){
            color="dark gray";
        }else if (Arrays.equals(rgbArray, BLACK)){
            color="black";
        }else if (Arrays.equals(rgbArray, RED)){
            color="red";
        }else if (Arrays.equals(rgbArray, PINK)){
            color="pink";
        }else if (Arrays.equals(rgbArray, ORANGE)){
            color="orange";
        }else if (Arrays.equals(rgbArray,YELLOW)){
            color="yellow";
        }else if (Arrays.equals(rgbArray,GREEN)){
            color="green";
        }else if (Arrays.equals(rgbArray,MAGENTA)){
            color="magenta";
        }else if (Arrays.equals(rgbArray,CYAN)){
            color="cyan";
        }else if (Arrays.equals(rgbArray,BLUE)){
            color="blue";
        }else{
            color="n/a";
        }
        return color;
    }



    public static void main(String[] args) {
        Color color = new Color(255,255,255);
        System.out.println(color.toString());
        System.out.println(color.color);
        Color color2 = new Color(255, 0, 0);
        System.out.println(color2.toString() ) ; // prints "red"
        System.out.println(Arrays.toString(color2.rgbArray));
    }
}
