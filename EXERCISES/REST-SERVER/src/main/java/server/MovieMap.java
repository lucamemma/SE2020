/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author studente
 */


@XmlRootElement(name = "MovieMap")
public class MovieMap {
    
     @XmlElement(nillable = false, name = "entry")
     private List<MovieEntry> entries = new ArrayList<MovieEntry>();
     
    public List<MovieEntry> getEntries() {
        return entries;
    }

    @XmlRootElement(name = "MovieEntry")
    public static class MovieEntry {

        private String id;
        private Movie Movie;

        public String getId() { return id; }
        public Movie getMovie () { return Movie; }
     
        public void setId(String i) { id = i; }
        public void setMovie(Movie m) { Movie = m; }
        
    }
}
