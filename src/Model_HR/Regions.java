/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model_HR;

/**
 *
 * @author admin
 */
public class Regions {
    private int regions_id;
    private String regions_name;

    public Regions() {
    }

    public Regions(int regions_id, String regions_name) {
        this.regions_id = regions_id;
        this.regions_name = regions_name;
    }

    public int getRegions_id() {
        return regions_id;
    }

    public void setRegions_id(int regions_id) {
        this.regions_id = regions_id;
    }

    public String getRegions_name() {
        return regions_name;
    }

    public void setRegions_name(String regions_name) {
        this.regions_name = regions_name;
    }
    
    
}
