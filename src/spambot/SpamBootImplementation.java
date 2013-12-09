package spambot;
import java.net.MalformedURLException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


public class SpamBootImplementation implements SpamBoot{

	WebpageLinks weblink =  new WebpageLinks();
	
	@Override
	public void setSeed(String seedUrl) throws MalformedURLException {
		Webpage reader = new WebpageReader(seedUrl);
		weblink.setUrls(reader.getLinks());
	}

	@Override
	public String getSeed() {
		// call next url from datastore
		Set<String> s = weblink.getUrls();
		for (Iterator<String> itr= s.iterator();itr.hasNext();itr.next()){
			//String next = itr.next();
			//System.out.println(itr.next());
			try{
				String newUrl = itr.next();
				//this.setSeed(itr.next());	
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public void scanSite() {
		// call method readpage with 
	}

	@Override
	public Set<String> getEMails() {
		// call method getEmails
		return null;
	}

	
	public void launcher(){
		/*Scanner keyboard = new Scanner(System.in);
		System.out.println("enter the URL where to start the spamboot");
		String url = keyboard.next();
		*/
		String url ="http://www.oracle.com";
		
		try{
			this.setSeed(url);
		}catch(Exception ex){
			System.out.println("something got wrong in the launcher");
			ex.printStackTrace();
		}
		this.getSeed();
	}
	
	public static void main(String[] args){
		// to know the number of processor
		System.out.println("Processor: " +  Runtime.getRuntime().availableProcessors());
		// Starting the spamboot
		SpamBootImplementation spamBoot = new SpamBootImplementation();
		spamBoot.launcher();
	}
	
}

class Crawler implements Runnable{
	private Set<String> urlSet;
	private Set<String> urlVisited;
	private Set<String> emailSet;
	
	public Crawler(Set<String> urlSet){
		this.urlSet = urlSet;
	}
	
	public void run(){
			
	}
}
