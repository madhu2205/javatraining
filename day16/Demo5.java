//objectInputStream
import java.io.FileInputStream;
import java.io.FileOutputstream;
import java.io.ObjectOutputstream;
import java.io.Serializable;

class Student implements Serializable{
 private int id;
 private String name;
 public int getId(){
  return id;
 }
 public void setId(int id){
  this.id=id;
 }
 public String getName(){
  return name;
 }
 public void setName(String name)
