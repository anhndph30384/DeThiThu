package anhnd.ph30384.dethithu.repository;

import anhnd.ph30384.dethithu.entity.Nxb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NxbRepo extends JpaRepository<Nxb, Integer> {
}
