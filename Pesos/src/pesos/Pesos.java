package pesos;

import java.io.IOException;
import javax.swing.text.Document;


public class Pesos {

  public static void main(String[] args) {
    Document doc = Jsoup.connect("https://en.wikipedia.org/").get();
    log(doc.title());
    Elements newsHeadlines = doc.select("#mp-itn b a");
    for (Element headline : newsHeadlines) {
        log("%s\n\t%s", 
    headline.attr("title"), headline.absUrl("href"));
}
  }
}
