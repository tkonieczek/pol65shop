package p.sda.shop.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import p.sda.shop.dao.KnightDAO;
import p.sda.shop.model.Knight;

import java.util.List;

@Service
public class KnightService {

    @Autowired
    KnightDAO knightDAO;

/*    @Autowired
    KnightRepository knightRepository;*/

    public List<Knight> getAllKnights() {
      //  List<Knight> allKnight = knightRepository.findAll();
        List<Knight> allKnight = knightDAO.getAllKnight();
        return allKnight;
    }
}
