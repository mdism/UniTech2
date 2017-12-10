package mdism.unitech;

/**
 * Created by mdism on 11-Dec-17.
 */

public class ErrorMassage {
    private int errorID;
    private String errorMassage;
    private String ErrorData;

    public ErrorMassage() {
    }

    public ErrorMassage(int errorID, String errorMassage, String errorData) {

        this.errorID = errorID;
        this.errorMassage = errorMassage;
        ErrorData = errorData;
    }

    public void setErrorID(int errorID) {
        this.errorID = errorID;
    }

    public void setErrorMassage(String errorMassage) {
        this.errorMassage = errorMassage;
    }

    public void setErrorData(String errorData) {
        ErrorData = errorData;
    }

    public int getErrorID() {

        return errorID;
    }

    public String getErrorMassage() {
        return errorMassage;
    }

    public String getErrorData() {
        return ErrorData;
    }

}
