package com.ipiecoles.java.java350.model;

import java.time.LocalDate;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


public class EmployeTest {
    
    @Test
    public void testNbAnneAnciennete0(){
        //Given
        Employe employe= new Employe();
        employe.setDateEmbauche(LocalDate.now());
        //When 
        Integer nbAnneeAnciennete=employe.getNombreAnneeAnciennete();
        //Then
        Assertions.assertThat(nbAnneeAnciennete).isEqualTo(0);
    }
    
    @Test
    public void testNbAnneAnciennete20(){
        //Given
        Employe employe= new Employe();
        employe.setDateEmbauche(LocalDate.now().minusYears(20));
        //When 
        Integer nbAnneeAnciennete=employe.getNombreAnneeAnciennete();
        //Then
        Assertions.assertThat(nbAnneeAnciennete).isEqualTo(20);
    }

    @Test
    public void testNbAnneAncienneteNotNull(){
        //Given
        Employe employe= new Employe();
        employe.setDateEmbauche(LocalDate.now());
        //When 
        Integer nbAnneeAnciennete=employe.getNombreAnneeAnciennete();
        //Then
        Assertions.assertThat(nbAnneeAnciennete).isNotNull();
    }

    @Test
    public void testInstantiateEmployeDateEmbaucheNull(){
        //Given
        Employe employe=new Employe();
        //When 
        LocalDate dembauche=employe.getDateEmbauche();
        //Then
        Assertions.assertThat(dembauche).isNull();
    }
}
