package nl.aalten.java8.streams;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

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
        System.out.println("Old -> Total for all toys is : " + totalPrice);

    }

    private static void sumSpecificArticlesWithStreams(List<Article> articles) {
        double totalPrice = articles
                .stream()
                .filter(article -> article.getType() == Type.TOY)
                .mapToDouble(Article::getPrice)
                .sum();
        System.out.println("New -> Total for all toys is : " + totalPrice);
    }

    private static List<Article> createArticleList() {
        List<Article> articles = new ArrayList();
        articles.add(new Article(1l, "Ball", new Double(5.5), Type.TOY));
        articles.add(new Article(2l, "Hammer", new Double(250.0), Type.TOOL));
        articles.add(new Article(1l, "Doll", new Double(12.75), Type.TOY));
        return articles;
    }


}
