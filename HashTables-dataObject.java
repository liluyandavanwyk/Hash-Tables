import java.util.*;
import java.io.*;
public class dataObject{
	private long iD;
	private String data;

	public dataObject(long iD,String data){
		this.iD = iD;
		this.data =data;
	}
	public long getId(){
		return iD;
	}
	public String getData(){
		return data;
	}
	public void setData(String newData){
			this.data = newData;
	}
	public void setId(long iD){
		this.iD = iD;
	}

	public String displayDataObject(){
		return getData();
	}


}
