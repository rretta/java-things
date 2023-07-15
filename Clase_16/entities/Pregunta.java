package atl.course.trivia.entities;

import lombok.Data;

@Data
public class Pregunta {

    private Category category;
    private String question;
    private String[] options;
    private Integer answer;
    private String explanation;


}
