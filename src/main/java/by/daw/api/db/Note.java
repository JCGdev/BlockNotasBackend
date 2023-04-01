package by.daw.api.db;
// TODO -> AÑADIR ANOTACIONES JAXB PARA ESTA CLASE
public class Note {
    private final String userID;
    private final String content;

    public Note(String userID, String content) {
        this.userID = userID;
        this.content = content;
    }

    public String getUserID() {
        return userID;
    }

    public String getContent() {
        return content;
    }

}
