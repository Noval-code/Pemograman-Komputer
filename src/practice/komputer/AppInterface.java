/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package practice.komputer;

/**
 *
 * @author muhammad noval aula
 */
public interface AppInterface {
  
    final int ADD_DATA_KOMPUTER = 1;
    final int SEARCH_BY_BRAND = 2;
    final int SEARCH_BY_MODEL = 3;
    final int VIEW_TABLE_DATA = 4;
    final int EXIT = 5;
    
    public int pilihanMenu();
    public void add();
    public String keyword(String type);
    public Komputer searchByBrand(String brand);
    public Komputer searchByModel(String model);
    public void viewTableData();
    public void viewData(Komputer k);
    public void exit();
}
