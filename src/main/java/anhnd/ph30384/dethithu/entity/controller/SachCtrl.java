package anhnd.ph30384.dethithu.entity.controller;

import anhnd.ph30384.dethithu.entity.Sach;
import anhnd.ph30384.dethithu.entity.response.SachResp;
import anhnd.ph30384.dethithu.repository.NxbRepo;
import anhnd.ph30384.dethithu.repository.SachRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SachCtrl {
    @Autowired
    SachRepo rp1;
    NxbRepo rp2;

    @GetMapping("/sach")
    public List<Sach> findAll(){
        return rp1.findAll();
    }

    @GetMapping("/sach/truy-van")
    public List<SachResp> getAll(){
        return rp1.getAll();
    }

    @GetMapping("/sach/truy-van/trang")
    public List<SachResp> pageAll(@RequestParam (value = "so", defaultValue = "0", required = false) Integer so){
        int luong = 5;
        Pageable page = PageRequest.of(so, luong);
        return rp1.pageAll(page).getContent();
    }
}
