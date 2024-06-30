package anhnd.ph30384.dethithu.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.hibernate.annotations.Nationalized;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "NXB")
public class Nxb {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false)
    private Integer id;

    @Size(max = 20)
    @Column(name = "Ma", length = 20)
    @NotBlank(message = "Khong duoc de trong!")
    private String ma;

    @Size(max = 50)
    @Nationalized
    @NotBlank(message = "Khong duoc de trong!")
    @Column(name = "Ten", length = 50)
    private String ten;

}