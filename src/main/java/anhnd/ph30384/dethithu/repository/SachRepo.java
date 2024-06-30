package anhnd.ph30384.dethithu.repository;

import anhnd.ph30384.dethithu.entity.Sach;
import anhnd.ph30384.dethithu.entity.response.SachResp;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SachRepo extends JpaRepository<Sach, Integer> {
    @Query(value = "select new anhnd.ph30384.dethithu.entity.response.SachResp(s.ma, s.ten, s.ngayXuatBan, s.soTrang, s.donGia, s.nxb.ten) from Sach s join Nxb n on s.nxb.id = n.id")
    List<SachResp> getAll();

    @Query(value = "select new anhnd.ph30384.dethithu.entity.response.SachResp(s.ma, s.ten, s.ngayXuatBan, s.soTrang, s.donGia, s.nxb.ten) from Sach s join Nxb n on s.nxb.id = n.id")
    Page<SachResp> pageAll(Pageable page);
}
