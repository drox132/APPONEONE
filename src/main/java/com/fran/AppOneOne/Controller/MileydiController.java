package com.fran.AppOneOne.Controller;

import com.fran.AppOneOne.Model.Mileydi;
import com.fran.AppOneOne.Service.MileydiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mileydi")
public class MileydiController {

    private final MileydiService mileydiService;

    @Autowired
    public MileydiController(MileydiService mileydiService) {
        this.mileydiService = mileydiService;
    }

    @GetMapping("/selectallmileydi")
    public List<Mileydi> selectAllMileydi(){
        return mileydiService.selectAllMileydi();
    }
    @GetMapping("/selectallmileydiby/{id}")
    public Mileydi selectAllMileydiById(@PathVariable int id){
        return mileydiService.selectAllMileydiById(id);
    }

    @PostMapping("/insertmileydi")
    public void insertMileydi(@RequestBody Mileydi nuevaMileydi){
        mileydiService.insertMileydi(nuevaMileydi);
    }

    @PutMapping("/updatemileydiby/{id}")
    public void updateMileydiById(@RequestBody Mileydi updateMileydi){
        mileydiService.updateMileydiById(updateMileydi);
    }

    @DeleteMapping("/deletemileydiBy/{id}")
    public void deleteMileydiById(int id){
        mileydiService.deleteMileydiById(id);
    }


}
