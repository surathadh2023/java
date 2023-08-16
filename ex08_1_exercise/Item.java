package ex08_1_exercise;

public class Item {

    public char color;

    public boolean setColor(char theColor) {
        if(theColor == ' ') return false;

        this.color = theColor;
        return true;

    }
    
}
