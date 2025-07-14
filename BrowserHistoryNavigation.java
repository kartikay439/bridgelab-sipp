import java.util.Scanner;


interface BrowserArchitecture{
	void search(Scanner sc) ;
	void goBack() ;
	void goNext();
	public void getHistory();
	void startBrowser() ;
}



public class BrowserHistoryNavigation {
	
	public static void main(String[] args) {
		Browser browser = new Browser();
		browser.startBrowser();
		
	}

}


class Tab{
	private Tab next;
	private Tab prev;
	private String url;
	
	//Creating new url
	public Tab(String url) {
		this.setUrl(url);
	}

	public Tab getNext() {
		return next;
	}

	public void setNext(Tab next) {
		this.next = next;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Tab getPrev() {
		return prev;
	}

	public void setPrev(Tab prev) {
		this.prev = prev;
	}
	
	}


class Browser implements BrowserArchitecture{
	Tab top;
	Tab bottom;
	Tab current;
	
	public Browser() {
		this.top = null;
	}
	
	public void search(Scanner sc) {
		System.out.println("Enter url : ");
		String url = sc.next();
		Tab newTab = new Tab(url);
		if(top == null) {
			top = bottom = current =  newTab;
		}else {
		top.setPrev(newTab);
		newTab.setNext(top);
		top  = newTab;
		current = top;
		}
		System.out.println(url);
		System.out.println();
		System.out.println();
	}
	public void goNext() {
		if(current.getPrev() != null) {
			current = current.getPrev();
			
			if(current.getNext()!=null && current.getPrev() != null) {
				current.getPrev().setNext(current.getNext());	
			}
			else if(current.getNext()!=null) {
				
				
			}else {
				current.getPrev().setNext(null);
			}
			current.setNext(top);
			top.setPrev(current);
			top = current;
			current.setPrev(null);
			
			
			System.out.println(current.getUrl());
			System.out.println();
			System.out.println();
			return;
		}
		System.out.println("No Next tab exist");
		System.out.println();
		System.out.println();
	}
	
	public void getCurrent() {
		if(current != null) {
	
			System.out.println("Current tab  :"+current.getUrl());
			System.out.println();
			System.out.println();
			return;
		}
		System.out.println("No tab exist please search first.");
		System.out.println();
		System.out.println();
	
	}
	public void goBack() {
		if(current.getNext() != null) {
			current = current.getNext();
			
			
			if(current.getNext()!=null && current.getPrev() != null) {
				current.getPrev().setNext(current.getNext());
			
			}
			else if(current.getNext()!=null) {
				
				
			}else {
				
			}
			current.setNext(top);
			current.setPrev(null);
			top.setPrev(current);
			top = current;
			System.out.println(current.getUrl());
			return;
		}
		System.out.println("No Previos tab exist");
		System.out.println();
		System.out.println();
	}
	
	public void getHistory(){
		Tab temp = top;
		System.out.println("----------------------------------Your browsing history-----------------------------");
		while(temp!=null) {
			System.out.println(temp.getUrl());
			temp = temp.getNext();
		}
		System.out.println();
		System.out.println();
	}
	
	
	
	public void startBrowser() {
		Scanner sc = new Scanner(System.in);
		boolean running  = true;
		while(running) {
			System.out.println("Search 1.");
			System.out.println("Go Back 2.");
			System.out.println("Go Next 3.");
			System.out.println("History 4.");
			System.out.println("Go Current 5.");
			System.out.println("Close Browser 6.");
			System.out.println();
			System.out.println();
			System.out.println("Enter choice : ");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:search(sc);
					break;
			case 2:goBack();
					break;
			case 3:goNext();
					break;
			case 4:getHistory();
				break;
			case 5:getCurrent();
			break;
			
			case 6:running = false;
					break;
			
			}
			
		}
	}
	
	
	
}