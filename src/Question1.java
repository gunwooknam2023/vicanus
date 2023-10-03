//해결하지 못했습니다

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question1 {
    public static void main(String[] args) {
        List<Bread> breads = BreadMaker.createBreads();

        for(int i = 0; i < breads.size(); i++) {
            Bread bread = breads.get(i);
            bread.properties();
        }
    }
}

// Bread 객체 생성
class BreadMaker {
    public static List<Bread> createBreads() {
        List<Bread> breads = new ArrayList<>();

        Recipe cream = new Recipe(Map.of("flour", 100, "water", 100, "cream", 200));
        Recipe sugar = new Recipe(Map.of("flour", 100, "water", 50, "sugar", 200));
        Recipe butter = new Recipe(Map.of("flour", 100, "water", 100, "butter", 50));

        breads.add(new Bread("cream", cream));
        breads.add(new Bread("sugar", sugar));
        breads.add(new Bread("butter", butter));

        return breads;
    }
}


// Bread 객체 정의, 정보 출력
class Bread {
    private String breadType;
    private Recipe recipe;

    public Bread(String breadType, Recipe recipe) {
        this.breadType = breadType;
        this.recipe = recipe;
    }

    public void properties() {
        System.out.println("breadType: " + breadType);
        System.out.println("recipe");

        // 레시피 세부내용 출력

    }
}


// 재료와 값을 담을 Recipe 객체 (HashMap)
class Recipe {
    private Map<String, Integer> details = new HashMap<>();

    public Recipe(Map<String, Integer> details) {
        this.details = details;
    }

    public Map<String, Integer> getDetails() {
        return details;
    }
}


//해결하지 못했습니다



