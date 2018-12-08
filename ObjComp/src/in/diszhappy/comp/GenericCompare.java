/**
 * 
 */
package in.diszhappy.comp;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import in.diszhappy.exception.IllegalComparisionException;

/**
 * @author Saumm on 16-Oct-2018 10:33:44 PM 
 * Desc : This Class is responsible to compare objects
 *
 */
public class GenericCompare {
	/**
	 * As the method in this class is static, hence object creation is restricted.
	 */
	private GenericCompare() {

	}
	/**
	 * Created By Saumm on 16-Oct-2018
	 * Desc : This method will compare two objects; fildwise. 
	 * @return compareObjectFields : It will return a map that will contain the field name as Key and in value it will have the new value and old value of the field separator #. In case the two objects are not of same class it will return null 
	 */
	public static Map<String, String> compareObjectFields(Object newObj, Object oldObj)
			throws IllegalArgumentException, IllegalAccessException {
		if (!newObj.getClass().equals(oldObj.getClass())) {
			throw new IllegalComparisionException("Object of different class can't be compared");
		}
		Map<String, String> diffMap = new HashMap<>();
		Field[] fields = oldObj.getClass().getDeclaredFields();
		for (Field f : fields) {
			f.setAccessible(true);
			if (f.get(newObj) != null && !f.get(newObj).equals(f.get(oldObj))) {
				diffMap.put(f.getName(), f.get(newObj) + "#" + f.get(oldObj));
			}
		}
		return diffMap;
	}
}
