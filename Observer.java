package obs;

import java.util.ArrayList; 
import java.util.Iterator; 

interface ISubject 
{ 
public void register(Observer o); 
public void unregister(Observer o); 
public void notifyObservers(); 
} 

class Subject implements ISubject 
{
ArrayList<Observer> observers = new ArrayList<Observer>();
int flog; 

public int getflog() 
{ 
return flog; 
} 

public void setflog(int flog) 
{ 
this.flog = flog; 

notifyObservers(); 
} 

public void register(Observer o) { 
observers.add(o); 
} 

public void unregister(Observer o) { 
observers.remove(o); 
} 


public void notifyObservers() 
{ 
for ( int i=0;i<observers.size(); i++) 
{ 
	observers.get(i).update(); 
} 
} 

} 


interface Observer 
{ 
public void update(); 
} 

class ob implements Observer 
{ 
public void update() 
{ 
	 System.out.println("observer 1 updated "); 
} 

} 

class obs implements Observer 
{ 
	 public void update() 
{ 
	 System.out.println("observer 2 updated "); 

	 } 
} 

class obss implements Observer 
{ 
	 public void update() 
{ 
	 System.out.println("observer 3 updated "); 

	 } 
} 


class Main 
{ 
public static void main(String args[]) 
{ 
ob o1 = new ob(); 
obs o2 = new obs(); 
obss o3 = new obss(); 


Subject su = new Subject(); 

su.register(o1); 
su.register(o2); 
su.register(o3);

su.setflog(1);

} 
}
