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

class observer1 implements Observer 
{ 
public void update() 
{ 
	 System.out.println("observer 1 updated "); 
} 

} 

class observer2 implements Observer 
{ 
	 public void update() 
{ 
	 System.out.println("observer 2 updated "); 

	 } 
} 

class observer3 implements Observer 
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
observer1 ob = new observer1(); 
observer2 obs = new observer2(); 
observer3 obss = new observer3(); 


Subject su = new Subject(); 

su.register(ob); 
su.register(obs); 
su.register(obss);

su.setflog(1);

} 
}
