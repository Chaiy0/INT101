package thing.id999;
import quantity.id999.Measure;
//  2. create a class name "Dimension" in "thing.id999" package.
public class Dimension {
//    2.1 add a private field named "title" which is a "String".
//    2.2 add a private final field named "height" which is a "Measure".
//    2.3 add a private final field named "width" which is a "Measure".
    private String title;
    private final Measure height;
    private final Measure width;
//    Constructor 
    public Dimension(String title, Measure height, Measure width) {
        this.title = title;
        this.height = height;
        this.width = width;
    }

//    2.4 override the "toString()" method to show all fields.
    @Override
    public String toString() {
        return "Title: " + title + ", Height: " + height + ", Width: " + width;
    }

//    2.5 add a "changeHeight(...)" method that recieves a "double" 
//        (named "newHeight").  This method changes the "value" of 
//        the "height" field to "newHeight". This method returns nothing (void).
    public void changeHeight(double newHeight) {
        height.setValue(newHeight);
    }

//    2.6 add a "getHeightUnit()" method that recieves nothing but returns 
//    the "unit" of the "height".    
    public String getHeightUnit() {
        return height.getUnit();
    }

//    2.7 add a "getHeightValue()" method that recieves nothing but returns
//    the "value" of the "height".
    public double getHeightValue() {
        return height.getValue();
    }
}
