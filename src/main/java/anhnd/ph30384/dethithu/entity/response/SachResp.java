package anhnd.ph30384.dethithu.entity.response;

import jakarta.persistence.Entity;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SachResp {
    private String ma;
    private String ten;
    private LocalDate ngayXuatBan;
    private Integer soTrang;
    private BigDecimal donGia;
    private String tenNxb;
}
