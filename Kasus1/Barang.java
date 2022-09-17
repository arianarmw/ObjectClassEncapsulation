/* Author : Ariana Rahmawati
 * Date   : September 15th 2022
 * Lesson : Object, Class, Encapsulation
 * Course : Object Oriented Programming (OOP)
 */

package Kasus1;

public class Barang {
	private String kode_barang;
	private String nama_barang;
	private int stok;
	
	public Barang(String kode, String nama, int stk) {
		this.kode_barang = kode;
		this.nama_barang = nama;
		this.stok = stk;
	}
	
	public String getKode() {
		return this.kode_barang;
	}
	
	public String getNama() {
		return this.nama_barang;
	}
	      
	public int getStok() {
		return this.stok;
	}
	
	public void setStok(int stk){
		this.stok += stk;
	}
}

	