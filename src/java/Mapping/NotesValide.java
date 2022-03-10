package Mapping;
public class NotesValide {
    private Integer id;
    private Integer idNote;

    public NotesValide(Integer id, Integer idNote) {
        this.id = id;
        this.idNote = idNote;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdNote() {
        return this.idNote;
    }

    public void setIdNote(Integer idNote) {
        this.idNote = idNote;
    }

}
