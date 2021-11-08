package com.fran.AppOneOne.Exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DatoDeNameEsVacioException extends RuntimeException{

    Logger logger= LoggerFactory.getLogger(DatoDeNameEsVacioException.class);


    public DatoDeNameEsVacioException (){
        logger.error("El dato de name es vacio");
    }




}
