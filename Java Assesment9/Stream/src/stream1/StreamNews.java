package stream1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamNews {

	public static void main(String[] args) {
		News firstNews = new News(1, "Test1", "User1", "Great News on budget" );
        News secondNews = new News(1, "Test1", "User2", "wonderful news about Technology" );
        News thirdNews = new News(2, "Test2", "User3", "This seems fake budget news" );
        News fourthNews = new News(3, "Test3", "User4", "This is so frightening" );

        List<News> newsList = new ArrayList<>();
        newsList.add(firstNews);
        newsList.add(secondNews);
        newsList.add(thirdNews);
        newsList.add(fourthNews);
        
        //Optional<Object> a = News.stream()
       // .max(Comparator.comparing(News::getUser))
       // .map(p->p.User);
        //System.out.println(a);


        


        System.out.println(newsList.stream()
                .collect(Collectors.groupingBy(News::getNewsId)).keySet());

	}

}
