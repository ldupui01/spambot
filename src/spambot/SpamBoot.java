package spambot;

import java.net.MalformedURLException;
import java.util.Set;

	public interface SpamBoot {
		/**
		* Sets the seed.
		*
		* The seed is the very first URL that has to be given to the
		* system. The associated web page is the starting point for
		* the whole process of fetching web pages, extracting their
		* links and email addresses, and fetching more web pages.
		*
		* @param seedUrl the first URL to fetch and analyse
		*/
		void setSeed(String seedUrl) throws MalformedURLException;
		/**
		* Returns the seed URL.
		* @return the seed URL.
		*/
		String getSeed();
		/**
		2If you do not remember how many CPUs you have on your machine, go over the notes and exercises on concurrency
		again.
		3
		* Sets the number of threads.
		*
		* The user should be able to set the number of threads to be
		* used for running the crawlers.
		*
		* @param count the number of threads (i.e. crawlers) to start in parallel
		void setThreads(int count);
		/**
		* Initiates the scanning process.
		*/
		void scanSite();
		/**
		* Returns all the emails gathered.
		*
		* This method should be executed only after the last crawlers
		* have stopped. If it is called before that point, its
		* behaviour is not defined.
		*/
		Set<String> getEMails();
}
