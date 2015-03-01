
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;



class Menu{

	public static void main(String[] args){
      Lista lista1= new Lista(new int[]{12, 15, 11, 4, 32});
      ObjectOutputStream salida=new ObjectOutputStream(new FileOutputStream("media.obj"));
      salida.writeObject("guardar este string y un objeto\n");
      salida.writeObject(lista1);
      salida.close();	
      List<String> strList1 = new ArrayList<String>();
	}
	

}
