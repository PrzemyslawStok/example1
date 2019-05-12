package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class SimpleController {

    @Autowired
    DataRepository dataRepository;

    @RequestMapping("/printText")
    public String zwrocNapis(){
        return "Przykładowy napis";
    }

    @RequestMapping("/tekst")
    public String napis(@RequestParam String t){
        return "tekst: "+t;
    }

    @RequestMapping("/dodaj")
    public String dodaj(@RequestParam Double a, @RequestParam Double b){

        return "suma: "+(a+b);
    }

    @RequestMapping("/printData")
    public Iterable<Data> printData(@RequestParam(name = "no",required = false,defaultValue = "5") Integer no){
        ArrayList<Data> data = new ArrayList<>();

        for(int i=0;i<no;i++){
            Data d = new Data();
            d.setX((double)i);
            d.setY((double)i);

            data.add(d);
        }

        return data;
    }

    @RequestMapping("/addData")
    public Iterable<Data> addData(@RequestParam Double x, @RequestParam Double y){

        Data data = new Data();

        data.setX(x);
        data.setY(y);

        dataRepository.save(data);

        return dataRepository.findAll();
    }

    @RequestMapping("/printDatabase")
    public Iterable<Data> printDatabase(){
        return dataRepository.findAll();
    }
}


