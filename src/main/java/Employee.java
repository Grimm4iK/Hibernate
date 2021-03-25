import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Column(name = "NAME")
    String name;
    @Column(name = "SALARY")
    int salary;

    @ManyToOne
    @JoinColumn(name = "DEPARTMENT_ID")
    Department department;


}
