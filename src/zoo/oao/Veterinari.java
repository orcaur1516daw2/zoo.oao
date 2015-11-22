/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo.oao;

/**
 *
 * @author Oriol Alex Oriol
 * 
 * 
 */
public class Veterinari extends Personal {

/**
 *
 * @author Oriol Alex Oriol
 * 
 * @param codi_personal
 * 
 * @param sou
 * 
 * @param DNI
 * 
 * @param nss
 * 
 * @param horari
 */
    
public Veterinari (int codi_personal, double sou, String DNI, double nss, String horari) {
    this.codi_personal=codi_personal;
    this.sou=sou;
    this.DNI=DNI;
    this.nss=nss;
    this.horari=horari;
    
}

/**
 *
 * @return
 */
    public int getCodi_personal() {
        return codi_personal;
    }
/**
 *
 * @return
 */
    public double getSou() {
        return sou;
    }
/**
 *
 * @return
 */
    public String getDNI() {
        return DNI;
    }
/**
 *
 * @return
 */
    public double getNss() {
        return nss;
    }
/**
 *
 * @return
 */
    public String getHorari() {
        return horari;
    }

    public void setCodi_personal(int codi_personal) {
        this.codi_personal = codi_personal;
    }
/**
 * 
 * @param sou 
 */
    public void setSou(double sou) {
        this.sou = sou;
    }
/**
 * 
 * @param DNI 
 */
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
/**
 * 
 * @param nss 
 */
    public void setNss(double nss) {
        this.nss = nss;
    }
/**
 * 
 * @param horari 
 */
    public void setHorari(String horari) {
        this.horari = horari;
    }

    @Override
    public String toString() {
        return "Veterinari amb codi = " + codi_personal + ", sou = " + sou + ", DNI = " + DNI + ", nss = " + nss + ", horari = " + horari +"";
    }
    
    
}

