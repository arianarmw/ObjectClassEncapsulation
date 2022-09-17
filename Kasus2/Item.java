/* Author : Ariana Rahmawati
 * Date   : September 15th 2022
 * Lesson : Object, Class, Encapsulation
 * Course : Object Oriented Programming (OOP)
 */

package Kasus2;

public class Item {
	private String name;
	
	private Item () {
		name = "Ipin";
	}
	
	public Item(String name) {
		this();
		System.out.println(this.name);
	}
}