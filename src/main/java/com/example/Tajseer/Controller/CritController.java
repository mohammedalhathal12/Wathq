package com.example.Tajseer.Controller;

import com.example.Tajseer.Model.Cretifcation;
import com.example.Tajseer.Model.Users;
import com.example.Tajseer.Service.ServiceCirt;
import com.example.Tajseer.View.ServiceImpCirt;
import com.example.Tajseer.View.ServiceImplmation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
@RequestMapping(value = "/cer")
@RestController
@Service
public class CritController extends ServiceImpCirt {


    @Autowired
    private ServiceCirt sevice;

    @Override
    @PostMapping(value = "/Post")
    public Cretifcation AddServiceCirt(@RequestBody Cretifcation cer) {
        return sevice.AddServiceCirt(cer);
    }

    @Override
    @GetMapping(value = "/getCer")
    public List<Cretifcation> getAllServiceCirt() {
        return sevice.getAllServiceCirt();
    }

    @Override
    @GetMapping(value="/cer/{id}")
    public Cretifcation getServiceCirt(@PathVariable("id") int id) {
        return sevice.getServiceCirt(id);
    }

    @Override
    @PutMapping(value="/cer/{id}")
    public Cretifcation updateServiceCirt (@RequestBody Cretifcation cer,@PathVariable("id")int id) {
        return sevice.updateServiceCirt(cer,id);
    }

    @Override
    @DeleteMapping(value="/cer/{/id}")
    public void deletedServiceCirt(@PathVariable("id") int id) {
        sevice.deletedServiceCirt(id);
    }
    @PostMapping("/UploadCertificate")
    public Cretifcation uploadCertificate(@PathVariable("fileName") MultipartFile fileName) {
        Cretifcation cretifcation = sevice.uploadCertificate(fileName);
        return cretifcation;
    }
}

