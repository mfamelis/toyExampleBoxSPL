package ca.umontreal.iro.geodes.boxspl;

import java.util.ArrayList;
import java.util.List;

/**
 * A POJO metamodel of a universe of boxes. A box has an identifier (it's up to
 * you to make sure it is unique), and keeps track of a list of other boxes that
 * it contains.
 * 
 * @author Michalis Famelis
 *
 */
public class Box {

	private ArrayList<Box> contents;
	private String id;

	/**
	 * Box constructor.
	 * 
	 * @param n : a String identifier for your box. Up to you to give it a unique
	 *          name.
	 */
	public Box(String n) {
		this.id = n;
		this.contents = new ArrayList<Box>();
	}

	/**
	 * What boxes do I contain?
	 * 
	 * @return String representation of the Box's contents
	 */
	private String contentsAsString() {
		String ret = "";
		for (Box b : this.contents)
			ret += b.toString() + "\n";
		return ret;
	}

	/**
	 * Adds boxes to this Box's contents
	 * 
	 * @param b : a Box to add
	 */
	public void addBox(Box b) {
		this.contents.add(b);
	}

	/**
	 * Returns the contents of the Box
	 * 
	 * @return a list with all Boxes contained by the Box
	 */
	public List<Box> getBoxes() {
		return this.contents;
	}

	@Override
	public String toString() {
		return this.id + (this.contentsAsString().isEmpty() ? " " : "\n" + this.contentsAsString());
	}

}
