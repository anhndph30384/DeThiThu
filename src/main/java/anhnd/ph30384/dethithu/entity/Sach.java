package anhnd.ph30384.dethithu.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.hibernate.annotations.Nationalized;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "Sach")
public class Sach {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false)
    private Integer id;

    @Size(max = 20)
    @Column(name = "Ma", length = 20)
    @NotBlank(message = "Khong duoc de trong!")
    private String ma;

    @Size(max = 30)
    @Nationalized
    @Column(name = "Ten", length = 30)
    @NotBlank(message = "Khong duoc de trong!")
    private String ten;

    @Column(name = "NgayXuatBan")
    @NotNull(message = "Khong duoc de trong!")
    private LocalDate ngayXuatBan;

    @Column(name = "SoTrang")
    @NotNull(message = "Khong duoc de trong!")
    private Integer soTrang;

    @Column(name = "DonGia", precision = 20)
    @NotNull(message = "Khong duoc de trong!")
    private BigDecimal donGia;

    @ManyToOne
    @JoinColumn(name = "IdNXB", referencedColumnName = "Id")
    @NotBlank(message = "Khong duoc de trong!")
    private Nxb nxb;

    @Column(name = "TrangThai")
    @NotNull(message = "Khong duoc de trong!")
    private Integer trangThai;

}