package models;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;



import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Guest on 1/9/18.
 */
public class CdProjectTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
        CdProject.clearAllCds();
    }

    @Test
    public void CdInstantiatesCorrectly_true () throws Exception {
        CdProject testCdProject = new CdProject("Awesome", "The Awesome Band");
        assertEquals(true, testCdProject instanceof CdProject);
    }

    @Test
    public void setCdName_changeNameOfCD_String() throws Exception {
        ArrayList<String> cds = new ArrayList<>();
        CdProject testCdProject = new CdProject("Yellow Submarine", "Beatles");
        testCdProject.setCdName("Abbey Road");
        assertEquals(true, testCdProject.getCdName().equals("Abbey Road"));
    }

    @Test
    public void setCdArtist_changeNameOfArtist_String() throws Exception {
        ArrayList<String> cds = new ArrayList<>();
        CdProject testCdProject = new CdProject("Yellow Submarine", "Beatles");
        testCdProject.setCdArtist("Easy Start All Starts");
        assertEquals(true, testCdProject.getCdArtist().equals("Easy Start All Starts"));
    }

//    @Test
//    public void sortCds_sortsCdsInAlphabeticalOrder_ArrayList() throws Exception {
//        CdProject testCdProject = new CdProject("Yellow Submarine", "Beatles");
//        CdProject testCdProject2 = new CdProject("Poop", "pee");
//        CdProject testCdProject3 = new CdProject("Queen", "Radio Ga Ga");
//        CdProject testCdProject4 = new CdProject("ABBA", "ABBA's Greatest Hits");
//        CdProject.sortCds();
//        ArrayList expected = new ArrayList();
//        expected.add(testCdProject4);
//        expected.add(testCdProject2);
//        expected.add(testCdProject3);
//        expected.add(testCdProject);
//        assertEquals(expected, CdProject.getAll());
//    }

    @Test
    public void getId_postsInstantiatesWithAnID_1() throws Exception {
        CdProject.clearAllCds();
        CdProject testCdProject = setupNewCdProject();
        assertEquals(1, testCdProject.getId());
    }

//    @Test
//    public void findReturnsCorrectCollection() throws Exception {
//        CdProject testCdProject = setupNewCdProject();
//        assertEquals(1, CdProject.findById(testCdProject.getId()));
//    }
//
//    @Test
//    public void findReturnsCorrectCollectionWhenMoreThanOneExists() throws Exception {
//        CdProject testCdProject = new CdProject("Metallica", "Kill 'Em All");
//        CdProject testCdProject2 = setupNewCdProject();
//        CdProject.sortCds();
//        assertEquals(2, testCdProject.findById(testCdProject.getId()));
//    }

    public CdProject setupNewCdProject(){
        return new CdProject("Abbey Road", "Beatles");
    }
}