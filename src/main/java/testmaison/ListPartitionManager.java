package testmaison;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author Khalil Dhamer
 *
 */
public class ListPartitionManager {

	private List<Integer> liste = new ArrayList<Integer>();
	private int taille = 0;
	
	public ListPartitionManager(List<Integer> liste, int taille) {
		this.liste = liste;
		this.taille = taille;
	}

	public ListPartitionManager() {
		// TODO Auto-generated constructor stub
	}

	public  List<List<Integer>> partition(List<Integer> liste, int taille) {
		this.liste = liste;
		this.taille = taille;
		return partition();
	}
	
	/**
	 * Method take list of integer as input and return list contain </br>
	 * list parts with length of taille field or less
	 * @return List<List<Integer>> partitioned list with size of taille field
	 */
	public  List<List<Integer>> partition() {
		System.out.println(toString());
		List<List<Integer>> partitionListe = new ArrayList<List<Integer>>();
		List<Integer> part;
		int i = 0;
		while (liste != null && i < liste.size()) {
			if (i + taille < liste.size()) {
				part = liste.subList(i, i + taille);
				partitionListe.add(part);
			} else {
				part = liste.subList(i, liste.size());
				partitionListe.add(part);
			}
			i += taille;
		}
		System.out.println("Liste de partitions, length : " + 
					partitionListe.size() + " content : " + Arrays.toString(partitionListe.toArray()));
		System.out.println("=========="); 
		return partitionListe;
	}
	
	public List<Integer> getListe() {
		return liste;
	}
	
	public void setListe(List<Integer> liste) {
		this.liste = liste;
	}

	public int getTaille() {
		return taille;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}

	@Override
	public String toString() {
		return 		"Input List : " + (getListe() != null ? Arrays.toString(getListe().toArray()) : getListe()) + "\n"
	  			+ 	"partition size : " + taille;
	}
}
