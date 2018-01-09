package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

/**
 * Created by Guest on 1/9/18.
 */
public class CdProject {
    private int id;
    private String cdName;
    private String cdArtist;
    private static ArrayList instances = new ArrayList<>();
    public CdProject(String cdName, String cdArtist) {
        this.cdName = cdName;
        this.cdArtist = cdArtist;
        instances.add(this);
        this.id = instances.size();
    }
    public String getCdName() {
        return this.cdName;
    }
    public void setCdName(String thisCdName) {
        this.cdName = thisCdName;
    }

    public String getCdArtist() {
        return this.cdArtist;
    }

    public void setCdArtist(String thisCdArtist) {
        this.cdArtist = thisCdArtist;
    }

    public static void sortCds() {
        Collections.sort(instances);
    }

    public static Object findById(int id) {
        return instances.get(id-1);
    }

    public static void clearAllCds(){
        instances.clear();
    }

    public int getId() {
        return id;
    }

    public static ArrayList<CdProject> getAll() {
        return instances;
    }
}
