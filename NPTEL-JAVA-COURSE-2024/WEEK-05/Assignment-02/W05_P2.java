/*  Write a program to create an interface Searchable with a method search(String keyword) that searches for a given keyword in a text document.
Create two classes Document and WebPage that implement the Searchable interface and provide their own implementations of the search() method. */

import java.util.Scanner;

interface Searchable {

    // Declare the abstract method "search" that classes implementing this interface must provide
    boolean search(String keyword);
}

class Document implements Searchable {

    // Declare a private instance variable to store the content of the document
    private String content;

    // Constructor for initializing the document's content
    public Document(String content) {
        this.content = content;
    }

    // Implement the "search" method required by the Searchable interface
    public boolean search(String keyword) {
        // Check if the content contains the specified keyword
        return content.contains(keyword);
    }
}

// Declare the WebPage class, which implements the Searchable interface
class WebPage implements Searchable {

    // Declare private instance variables to store the URL and HTML content
    private String url;
    private String htmlContent;

    // Constructor for initializing the URL and HTML content
    public WebPage(String url, String htmlContent) {
        this.url = url;
        this.htmlContent = htmlContent;
    }

    // Implement the "search" method required by the Searchable interface
    public boolean search(String keyword) {
        // Check if the HTML content contains the specified keyword
        return htmlContent.contains(keyword);
    }
}

public class W05_P2 {

    public static void main(String[] args) {
        // Create an instance of the Document class with a sample content
        Scanner in = new Scanner(System.in);
        System.out.printf("Enetr a text string: ");
        String text = in.nextLine();
        String document = text;
        System.out.printf("Enetr a document string: ");
        String str = in.nextLine();

        // Search for a keyword in the document and store the result
        boolean documentContainsKeyword = document.contains(str);

        // Print whether the document contains the keyword
        System.out.println("Document contains keyword: " + str + " " + documentContainsKeyword);
// Create an instance of the WebPage class with a sample URL and HTML content
        WebPage webPage = new WebPage("https://onlinecourses.nptel.ac.in", "This is a NPTEL online course webpage.");

        // Search for a keyword in the webpage and store the result
        boolean webPageContainsKeyword = webPage.search("webpage");

        // Print whether the webpage contains the keyword
        System.out.print("Webpage contains keyword 'webpage': " + webPageContainsKeyword);
    }
}
