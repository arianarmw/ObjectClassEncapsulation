/* Author : Ariana Rahmawati
 * Date   : September 15th 2022
 * Lesson : Object, Class, Encapsulation
 * Course : Object Oriented Programming (OOP)
 */

package Kasus1;

public class Inventori {
	Barang[] barangs;
	
	void initBarang() {
		barangs = new Barang [2];
		barangs[0] = new Barang("001", "Baju",10);
		barangs [1] = new Barang("002", "Celana",20);
	}
	
	void showBarang() {
		System.out.println(barangs[0].getNama() + "(" + barangs[0].getStok() + ")");
        System.out.println(barangs[1].getNama() + "(" + barangs[1].getStok() + ")");  
	}
	
	void pengadaan() {
		initBarang();
		barangs[0].setStok(0);
		showBarang();
		
	}
	
	public static void main(String[] args) {
		Inventori beli = new Inventori();
		beli.pengadaan();
	}
}