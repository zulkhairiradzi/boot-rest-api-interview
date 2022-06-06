package posmy.interview.boot.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Books {
    @Id
    @GeneratedValue
    private Long id;

    private String isdn;
    private String status;
    private String bookName;
}
