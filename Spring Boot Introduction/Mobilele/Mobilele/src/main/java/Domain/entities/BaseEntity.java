package Domain.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import org.hibernate.annotations.GenericGenerator;

@MappedSuperclass
public abstract class BaseEntity {
    public BaseEntity() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(generator = "uuid-string")
    @GenericGenerator(name = "uuid-string",
    strategy = "org.hibernate.id.UUIDGenerator")

    private String id;

}
