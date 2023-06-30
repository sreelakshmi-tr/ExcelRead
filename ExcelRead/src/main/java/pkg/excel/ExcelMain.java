package pkg.excel;

import java.io.IOException;

public class ExcelMain {
	public static void main(String[] args) throws IOException {

		String name =Excel.readStringData(1,0);

		System.out.println("Name :"+ "\t"+name);

		String id= Excel.readIntegerData(1, 1);

		System.out.println("id :"+"\t"+ id);

		}
}
