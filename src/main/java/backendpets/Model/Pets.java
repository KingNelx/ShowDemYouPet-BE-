package backendpets.Model;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Entity;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Pet")
public class Pets {

    @Id
    @GeneratedValue

    private @Getter @Setter Long id;
    private @Getter @Setter String petName;
    private @Getter @Setter String ownerName;
    private @Getter @Setter String petAge;
    private @Getter @Setter String typeOfPet;
    private @Getter @Setter String petGender;
    private @Getter @Setter String address;
}