package com.fran.AppOneOne.Service.Implementation;

import com.fran.AppOneOne.Model.Mileydi;
import com.fran.AppOneOne.Repository.MileydiRepository;
import com.fran.AppOneOne.Service.MileydiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MileydiServiceImplementation implements MileydiService {

    private final MileydiRepository mileydiRepository;

    @Autowired
    public MileydiServiceImplementation(MileydiRepository mileydiRepository) {
        this.mileydiRepository = mileydiRepository;
    }

    @Override
    public List<Mileydi> selectAllMileydi() {
        return mileydiRepository.selctAllMileydi();
    }

    @Override
    public Mileydi selectAllMileydiById(int id) {
        return mileydiRepository.selectAllMileydiById(id);
    }

    @Override
    public void insertMileydi(Mileydi nuevaMileydi) {
        mileydiRepository.insertMileydi(nuevaMileydi.getName(),nuevaMileydi.getAge());
    }

    @Override
    public void updateMileydiById(Mileydi updaeMileydi) {
        mileydiRepository.updateMileyById(updaeMileydi.getName(),updaeMileydi.getAge(),updaeMileydi.getId());
    }

    @Override
    public void deleteMileydiById(int id) {
        mileydiRepository.deleteMileydiById(id);
    }
}
