package com.fran.AppOneOne.Service;

import com.fran.AppOneOne.Model.Mileydi;

import java.util.List;

public interface MileydiService {

    List<Mileydi>selectAllMileydi();
    Mileydi selectAllMileydiById(int id);
    void insertMileydi(Mileydi nuevaMileydi);
    void updateMileydiById(Mileydi updaeMileydi);
    void deleteMileydiById(int id);
}
