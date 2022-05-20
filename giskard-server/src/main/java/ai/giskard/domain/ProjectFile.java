package ai.giskard.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;


@MappedSuperclass
@Table(indexes = @Index(columnList = "fileName"))
@NoArgsConstructor
@Getter
@Setter
public abstract class ProjectFile extends AbstractAuditingEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String fileName;

    @ManyToOne
    @JsonBackReference
    private Project project;

    private long size;
}
