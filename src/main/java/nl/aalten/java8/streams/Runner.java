package nl.aalten.java8.streams;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class Runner {

    public static void main(String[] args) {
        List<Article> articles = createArticleList();
        sumSpecificArticlesOldWay(articles);
        sumSpecificArticlesWithStreams(articles);
    }

    private static void sumSpecificArticlesOldWay(List<Article> articles) {
        Double totalPrice = Double.valueOf(0);
        for (Article article : articles) {
            if (Type.TOY == article.getType()) {
                totalPrice = totalPrice + article.getPrice();
            }
        }
        log. info("Old -> Total for all toys is : " + totalPrice);

    }

    private static void sumSpecificArticlesWithStreams(List<Article> articles) {
        double totalPrice = articles
                .stream()
                .filter(article -> article.getType() == Type.TOY)
                .mapToDouble(Article::getPrice)
                .sum();
        log. info("New -> Total for all toys is : " + totalPrice);
    }

    /**
     * Creates a list of Articles
     * @return the list of articles
     */
    private static List<Article> createArticleList() {
        List<Article> articles = new ArrayList();
        articles.add(new Article(1l, "Ball", new Double(5.5), Type.TOY));
        articles.add(new Article(2l, "Hammer", new Double(250.0), Type.TOOL));
        articles.add(new Article(3l, "Doll", new Double(12.75), Type.TOY));
        return articles;
    }


}
