package ua.goit.gojavaonline.core_3.groupe_02.sidorenko.module03.flowers;

import java.util.List;

public class Bouquet {
    private List<Flower> flowers;

    public List<Flower> getFlowers() {
        return flowers;
    }

    public void setFlowers(List<Flower> flowers) {
        this.flowers = flowers;
    }
    public void addFlower(Flower flower){
        this.flowers.add(flower);
    }
}

