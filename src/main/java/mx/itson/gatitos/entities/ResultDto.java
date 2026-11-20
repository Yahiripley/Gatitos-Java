package mx.itson.gatitos.entities;

/**
 * DTO de respuesta estándar devuelto por la API de Django.
 */
public class ResultDto {

    private boolean success;
    private String message;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
