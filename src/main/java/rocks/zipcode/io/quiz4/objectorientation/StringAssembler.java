package rocks.zipcode.io.quiz4.objectorientation;

/**
 * @author leon on 11/12/2018.
 */
public class StringAssembler {

    private Character delimeter;
    private StringBuilder stringBuilder;

    public StringAssembler(Character delimeter) {
        this.delimeter = delimeter;
        this.stringBuilder = new StringBuilder();
    }

    public StringAssembler append(String str) {
        stringBuilder.append(str).append(delimeter);
        return this;
    }

    public String assemble() {
        return stringBuilder.toString().substring(0, stringBuilder.toString().length() - 1);
    }
}
