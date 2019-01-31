public class Box {
    float width;
    int height;
    float length;

    public Box() { }

    public boolean validate(float length, float width, int height) {
        if (this.length>= length && this.width >=width && this.height >=height) {
            return true;
        }
        return false;
    }
}
