package ca.umontreal.iro.geodes.boxspl;

import java.util.ArrayList;
import java.util.List;

/**
 * A POJO metamodel of a universe of boxes. You can see the metamodel
 * <a href="http://yuml.me/preview/27938e54">on yUML</a>.
 * </p>
 * <img src=
 * "https://yuml.me/diagram/boring/class/[BoxModel]<>model-boxes>[Box|id:String]<>contents-[Box]"/>
 * 
 * @author Michalis Famelis
 *
 */
public class BoxModel {

	private ArrayList<Box> contents = new ArrayList<>();

	/**
	 * Adds more box elements to the model.
	 * @param box to add
	 */
	public void addBox(Box box) {
		this.contents.add(box);
	}

	/**
	 * Returns the list of all elements of the model.
	 * @return a list of Boxes
	 */
	public List<Box> getBoxes() {
		return this.contents;
	}

}
